package com.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ErrorMessage {

    private String error;

    public ErrorMessage(String errorMessage){
        this.error=errorMessage;
    }
}
