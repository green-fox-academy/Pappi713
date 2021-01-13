package com.greenfoxacademy.webapp.dj.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {
    public void log(String message) {
        System.out.println("SOME SPRING INFO");
        System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
        System.out.println("SOME SPRING INFO");
    }
}
