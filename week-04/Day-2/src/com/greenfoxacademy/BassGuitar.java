package com.greenfoxacademy;

public class BassGuitar extends StringedInstrument{
    public BassGuitar(){
        this.name="Bass Guitar";
        this.numberOfStrings =4;
    }
    public BassGuitar(int numberofString){
        this.numberOfStrings=numberofString;
        //this.name="Bass Guitar";
    }
    public void play() {
        System.out.println(this.name+", a "+numberOfStrings+"-stringed instrument that goes "+sound());
    }
    public String sound(){
        return "Duum-duum-duum";
    }
}
