package com.greenfoxacademy;

public class Reptile extends Animal {
    public Reptile(String animalName) {
        super(animalName);
    }

    @Override
    public String breed() {
        return "laying eggs";
    }
}
