package com.greenfoxacademy.springstart.models;

public class Greetings {
    Long id;
    String content;

    public Greetings(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
