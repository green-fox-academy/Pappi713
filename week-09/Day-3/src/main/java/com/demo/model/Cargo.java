package com.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Cargo {

    private Integer caliber25 = 0;
    private Integer caliber30 = 0;
    private Integer caliber50 = 0;
    private String shipstatus = "empty";
    private Boolean ready = false;


    public void fill(String caliber, Integer amount){
        if(caliber.equals(".25")){
            caliber25+=amount;
        }
        if(caliber.equals(".30")){
            caliber30+=amount;
        }
        if(caliber.equals(".50")){
            caliber50+=amount;
        }
    }


}
