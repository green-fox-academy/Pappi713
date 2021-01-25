package com.demo.model.doubling;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Doubling {

    private Integer received;
    private Integer result;

    public Doubling(Integer input){
        this.received=input;
        this.result=input*2;
    }
}
