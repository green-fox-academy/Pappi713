package com.demo.controller;


import com.demo.model.ArrayError;
import com.demo.model.ArrayosGoethe;
import com.demo.model.ResultArrayArray;
import com.demo.model.ResultArraySingleNumber;
import com.demo.model.append.AppendError;
import com.demo.model.action.Result;
import com.demo.model.action.Until;
import com.demo.model.append.Append;
import com.demo.model.doubling.Doubling;
import com.demo.model.doubling.ErrorDoubling;
import com.demo.model.greeter.ErrorMissingAll;
import com.demo.model.greeter.ErrorMissingName;
import com.demo.model.greeter.ErrorMissingTitle;
import com.demo.model.greeter.Welcome;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class RestInPeace {


    @GetMapping("/doubling")
    public ResponseEntity<?> getDouble(@RequestParam(required = false) Integer input) {
        if (input != null) {
            return ResponseEntity.ok(new Doubling(input));
        } else {
            return ResponseEntity.ok(new ErrorDoubling());

        }
    }

    @GetMapping("/greeter")
    public ResponseEntity<?> greeting(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (name == null || title == null) {
            if (name == null && title!=null) {
                return ResponseEntity.badRequest().body(new ErrorMissingName());
            }
            if (title == null && name!=null) {
                return ResponseEntity.badRequest().body(new ErrorMissingTitle());
            }
            if(name==null && title ==null){
                return ResponseEntity.badRequest().body(new ErrorMissingAll());
            }
        }
        return ResponseEntity.ok(new Welcome(name, title));
    }

    @GetMapping("/appenda/{appendable}")
    public ResponseEntity<?>appendA(@PathVariable String appendable){
        return ResponseEntity.ok(new Append(appendable));
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity<?> dountil(@PathVariable String action, @RequestBody Until until){
        if(action.equals("sum") || action.equals("factor")){
            return  ResponseEntity.ok(new Result(action, until.getUntil()));
        }
        else{
            return ResponseEntity.ok(new AppendError());
        }
    }

    @PostMapping("/arrays")
    public ResponseEntity<?> arrays(@RequestBody ArrayosGoethe arrayosGoethe){
        System.out.println(arrayosGoethe.getWhat());
        if(arrayosGoethe.getWhat().equals("sum")){
            Integer sum=0;
            for(int i=1;i<=arrayosGoethe.getNumbers().length;i++){
                sum=sum+arrayosGoethe.getNumbers()[i];
            }
            return ResponseEntity.ok(new ResultArraySingleNumber(sum));
        }
        if(arrayosGoethe.getWhat().equals("multiply")){
            Integer multiply=1;
            for(int i=1;i<=arrayosGoethe.getNumbers().length;i++) {
                multiply = multiply * arrayosGoethe.getNumbers()[i];
            }
            return ResponseEntity.ok(new ResultArraySingleNumber(multiply));
        }
        if(arrayosGoethe.getWhat().equals("double")){
            return ResponseEntity.ok(new ResultArrayArray(arrayosGoethe.getNumbers()));
        }
        else{
            return ResponseEntity.ok(new ArrayError());
        }
    }
}
