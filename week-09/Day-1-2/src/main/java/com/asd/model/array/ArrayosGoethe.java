package com.asd.model.array;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
