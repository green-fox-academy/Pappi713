package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Greetings;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class Webcounter {
    AtomicLong atm=new AtomicLong(1);
    @RequestMapping("/webcounter/greeting")
    public String greetingcounter(Model model , @RequestParam String name){
        model.addAttribute("name", name);
        model.addAttribute("counter",atm.getAndIncrement());
        return "greetingcounter";
    }
}
