package com.demo.model.greeter;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ErrorMissingName {
    private String error="Please provide a name!";
}
