package com.demo.model.greeter;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ErrorMissingTitle {
    private String error="Please provide a title!";
}
