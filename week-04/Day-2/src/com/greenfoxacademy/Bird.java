package com.greenfoxacademy;

public  class Bird extends Animal implements Flyable {

    public Bird(String animalName) {
        super(animalName);
    }

    @Override
    public String breed(){

        return "eggs";
    };

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void takeOff() {

    }

}
