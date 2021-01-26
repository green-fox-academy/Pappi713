package com.asd.controller;


import com.asd.model.action.Result;
import com.asd.model.action.Until;
import com.asd.model.append.Append;
import com.asd.model.append.AppendError;
import com.asd.model.array.ArrayError;
import com.asd.model.array.ArrayosGoethe;
import com.asd.model.array.ResultArrayArray;
import com.asd.model.array.ResultArraySingleNumber;
import com.asd.model.doubling.Doubling;
import com.asd.model.doubling.ErrorDoubling;
import com.asd.model.greeter.ErrorMissingAll;
import com.asd.model.greeter.ErrorMissingName;
import com.asd.model.greeter.ErrorMissingTitle;
import com.asd.model.greeter.Welcome;
import com.asd.model.log.Log;
import com.asd.model.log.Logs;
import com.asd.model.log.logDTO;
import com.asd.model.sith.SithText;
import com.asd.model.sith.Text;
import com.asd.service.LogService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.stream.Collectors;


@RestController
public class RestInPeace {

    private LogService LogService;

    @Autowired
    public RestInPeace(LogService logService) {
        this.LogService = logService;
    }

    @GetMapping("/doubling")
    public ResponseEntity<?> getDouble(@RequestParam(required = false) Integer input) {
        if (input != null) {
            LogService.newEntity(LogService.getPostedTime(), "/doubling", ("input" + input));

            return ResponseEntity.ok(new Doubling(input));
        } else {
            LogService.newEntity(LogService.getPostedTime(), "/doubling", ("input=" + input));
            return ResponseEntity.ok(new ErrorDoubling());
        }
    }

    @GetMapping("/greeter")
    public ResponseEntity<?> greeting(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        LogService.newEntity(LogService.getPostedTime(), "/greeter", "name=" + name + "&title=" + title);
        if (name == null || title == null) {
            if (name == null && title != null) {
                return ResponseEntity.badRequest().body(new ErrorMissingName());
            }
            if (title == null && name != null) {
                return ResponseEntity.badRequest().body(new ErrorMissingTitle());
            }
            if (name == null && title == null) {
                return ResponseEntity.badRequest().body(new ErrorMissingAll());
            }
        }
        return ResponseEntity.ok(new Welcome(name, title));
    }

    @GetMapping("/appenda/{appendable}")
    public ResponseEntity<?> appendA(@PathVariable String appendable) {
        LogService.newEntity(LogService.getPostedTime(), "/appenda", "appendable" + appendable);
        return ResponseEntity.ok(new Append(appendable));
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity<?> dountil(@PathVariable String action, @RequestBody Until until) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        LogService.newEntity(LogService.getPostedTime(), "/dountil", objectMapper.writeValueAsString(until));
        if (action.equals("sum") || action.equals("factor")) {
            return ResponseEntity.ok(new Result(action, until.getUntil()));
        } else {
            return ResponseEntity.ok(new AppendError());
        }
    }

    @PostMapping("/arrays")
    public ResponseEntity<?> arrays(@RequestBody ArrayosGoethe arrayosGoethe) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        LogService.newEntity(LogService.getPostedTime(), "/arrays", objectMapper.writeValueAsString(arrayosGoethe));
        if (arrayosGoethe.getWhat().equals("sum")) {
            Integer sum = 0;
            for (int i = 1; i < arrayosGoethe.getNumbers().length; i++) {
                sum = sum + arrayosGoethe.getNumbers()[i];
            }

            return ResponseEntity.ok(new ResultArraySingleNumber(sum));
        }
        if (arrayosGoethe.getWhat().equals("multiply")) {
            Integer multiply = 1;
            for (int i = 1; i < arrayosGoethe.getNumbers().length; i++) {
                multiply = multiply * arrayosGoethe.getNumbers()[i];
            }
            return ResponseEntity.ok(new ResultArraySingleNumber(multiply));
        }
        if (arrayosGoethe.getWhat().equals("double")) {
            return ResponseEntity.ok(new ResultArrayArray(arrayosGoethe.getNumbers()));
        } else {
            return ResponseEntity.ok(new ArrayError());
        }
    }

    @GetMapping("/log")
    public Logs getlogs() {
        List<Log> logList = LogService.logList();
        return new Logs(logList, logList.size());
    }

    @PostMapping("/sith")
    public SithText sith(@RequestBody Text text) {
        Random random = new Random();
        String texto = text.getText();
        String result = "";
        String sub = "";
        String[] splitByDotSpace = texto.split("\\. ");
        for (int i = 0; i < splitByDotSpace.length; i++) {
            String[] splitBySpace = splitByDotSpace[i].split(" ");
            if (splitBySpace.length % 2 == 0) {
                for (int j = 0; j <= splitBySpace.length - 2; j += 2) {
                    String temp = splitBySpace[j];
                    splitBySpace[j] = splitBySpace[j + 1];
                    splitBySpace[j + 1] = temp;
                }
            } else {
                for (int j = 0; j <= splitBySpace.length - 3; j += 2) {
                    String temp = splitBySpace[j];
                    splitBySpace[j] = splitBySpace[j + 1];
                    splitBySpace[j + 1] = temp;
                }
            }

            sub = Arrays.stream(splitBySpace).map(x -> x.toLowerCase()).collect(Collectors.joining(" "));
            sub = Character.toUpperCase(sub.charAt(0)) + sub.substring(1);
            result += sub;
            result += ". ";
            int rando = random.nextInt(2 - 1 + 1) + 1;
            for (int k = 0; k < rando; k++) {
                result += LogService.randomworld();
            }

        }
        SithText sithText=new SithText(result);
        return sithText;
    }
}
