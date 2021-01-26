package com.asd.model.array;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResultArraySingleNumber {

    private Integer result;

    public ResultArraySingleNumber(Integer result){
        this.result =result;
    }
}
