package com.greenfoxacademy;

public class Mammal  extends Animal{
    public Mammal(String animalName) {
        super(animalName);
    }

    @Override
    public String breed() {
        return "pushing miniature versions out";
    }
}
