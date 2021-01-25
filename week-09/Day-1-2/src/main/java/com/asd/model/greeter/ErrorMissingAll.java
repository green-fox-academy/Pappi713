package com.asd.model.greeter;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ErrorMissingAll {
    private String error= "Please provide a name and a title!";
}
