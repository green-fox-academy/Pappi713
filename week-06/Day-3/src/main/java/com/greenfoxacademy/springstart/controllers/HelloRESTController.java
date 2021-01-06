package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Greetings;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController  {

    AtomicLong atm=new AtomicLong(1);

    @RequestMapping("/greeting")
    public Greetings greeting(@RequestParam String name){
       return new Greetings(atm.getAndIncrement(),"Hello "+name);
    }
}
