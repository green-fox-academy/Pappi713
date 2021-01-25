package com.asd.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResultArrayArray {

    private Integer[] result;

    public ResultArrayArray(Integer[] array){
        for(int i=0;i<array.length;i++){
            array[i]=array[i]*2;
        }
        this.result=array;
    }
}
