package com.greenfoxacademy;

public class ElectricGuitar  extends StringedInstrument{

    public ElectricGuitar(){
        this.numberOfStrings=6;
        this.name="Electric Guitar";
    }

    public ElectricGuitar(int numberofString){
        this.numberOfStrings=numberofString;
        this.name="Electric Guitar";

    }
    public void play() {
        System.out.println(this.name+", a "+numberOfStrings+"-stringed instrument that goes "+sound());
    }
    public String sound(){
        return "Twang";
    }
}
