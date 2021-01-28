package com.demo.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Text {

    private String recieved;
    private String translated;

    public Text(String message){
        this.recieved=message;
        this.translated="I am Groot!";
    }
}
