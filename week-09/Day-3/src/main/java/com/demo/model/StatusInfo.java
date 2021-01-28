package com.demo.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StatusInfo {

    private String recieved;
    private Integer amount;
    private String shipstatus;
    private Boolean ready;


    public void updateStatusinfo(Cargo cargo, String caliber, Integer amount){
        this.recieved=caliber;
        this.amount=amount;
        Integer maxcapacity=12500;
        Integer cargoStorage=cargo.getCaliber25()+cargo.getCaliber30()+cargo.getCaliber50();
        double percentage= (double)cargoStorage/(double)maxcapacity*100;
        if(cargoStorage==0){
            cargo.setShipstatus("empty");
            this.shipstatus="0%";
        }
        else if(cargoStorage>=maxcapacity){
            cargo.setShipstatus("overloaded");
            this.shipstatus=(percentage)+"%";
            cargo.setReady(true);
            this.ready=true;
        }
        else if(cargoStorage==maxcapacity){
            cargo.setShipstatus("full");
            this.shipstatus="100%";
            cargo.setReady(true);
            this.ready=true;
        }
        else{
            cargo.setShipstatus((percentage)+"%");
            this.shipstatus=((int)percentage)+"%";
        }
    }
}
