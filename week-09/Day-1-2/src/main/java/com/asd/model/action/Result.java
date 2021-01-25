package com.asd.model.action;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Result {

    private Integer result;

    public Result(String action, Integer until){
        if (action.equals("sum")){
            Integer sum=0;
            for(int i=1;i<=until;i++){
                sum=sum+i;
            }
            this.result=sum;
        }
        if (action.equals("factor")){
            Integer factor=1;
            for(int i=1;i<=until;i++){
                factor=factor*i;
            }
            this.result=factor;
        }
    }

}
