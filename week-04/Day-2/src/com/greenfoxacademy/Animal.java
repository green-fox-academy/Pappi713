package com.greenfoxacademy;

public abstract class Animal {

    protected String name;
    protected Integer age;

    public Animal(String animalName){
        this.name=animalName;
    }

    public String getName() {
        return name;
    }

    public abstract String breed();

}
