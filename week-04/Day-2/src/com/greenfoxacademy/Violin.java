package com.greenfoxacademy;

public class Violin extends StringedInstrument {

    public Violin(){
        this.numberOfStrings=4;
        this.name="Violin";
    }

    public Violin(int numberofString){
        this.numberOfStrings=numberofString;
        this.name="Violin";

    }
    public void play() {
        System.out.println(this.name+", a "+numberOfStrings+"-stringed instrument that goes "+sound());
    }
    public String sound(){
        return "Screech";
    }
}
