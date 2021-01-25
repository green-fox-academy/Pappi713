package com.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
@Getter
@Setter
@NoArgsConstructor
public class ResultArraySingleNumber {

    private Integer result;

    public ResultArraySingleNumber(Integer result){
        this.result =result;
    }
}
