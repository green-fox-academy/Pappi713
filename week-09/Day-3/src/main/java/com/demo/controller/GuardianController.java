package com.demo.controller;

import com.demo.model.*;
import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    Cargo cargo = new Cargo();
    StatusInfo statusInfo = new StatusInfo();

    @GetMapping("/groot")
    public ResponseEntity<?> translate(@RequestParam(required = false) String message) {
        if (message != null) {
            return ResponseEntity.ok(new Text(message));
        } else {
            return ResponseEntity.badRequest().body(new ErrorMessage("I am Groot!"));
        }
    }

    @GetMapping("/arrow")
    public ResponseEntity<?> calculateSpeed(@RequestParam(required = false) Double distance, @RequestParam(required = false) Double time) {
        if (distance != null && time != null) {
            return ResponseEntity.ok(new Arrow(distance, time));
        } else {
            return ResponseEntity.badRequest().body(new ErrorMessage("Missing data"));
        }
    }

    @GetMapping("/rocket")
    public Cargo getCargoDetails() {
        return cargo;
    }

    @GetMapping("/rocket/fill")
    public ResponseEntity<?> fillCargo(@RequestParam(required = false) String caliber, @RequestParam(required = false) Integer amount) {
        if (caliber != null && amount != null) {
            if (caliber.equals(".25") || caliber.equals(".30") || caliber.equals(".50")) {
                cargo.fill(caliber, amount);
                statusInfo.updateStatusinfo(cargo, caliber, amount);
            }
            return ResponseEntity.ok(statusInfo);
        } else {
            return ResponseEntity.badRequest().body(new ErrorMessage("Missing input data"));
        }
    }
}
