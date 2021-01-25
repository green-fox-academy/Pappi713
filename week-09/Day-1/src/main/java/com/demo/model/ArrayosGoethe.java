package com.demo.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class ArrayosGoethe {
    private String what;
    private Integer[] numbers;

    public ArrayosGoethe(String what, Integer[] numbers){
        this.what=what;
        this.numbers=numbers;
    }
}
