package com.greenfoxacademy.bankofsimba.model;

import java.util.concurrent.atomic.AtomicLong;

import static java.lang.Double.parseDouble;

public class BankAccount {

    String name;
    Double balance;
    Long id;
    Boolean isKing;
    Boolean isGood;

    public Boolean getIsGood(){
        return isGood;
    }

    public Boolean getIsKing() {
        return isKing;
    }

    public Long getId() {
        return id;
    }



    private static AtomicLong counter = new AtomicLong(1);

    public String getName() {
        return name;
    }

    public Double    getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    String animalType;

    public BankAccount(String name, Double balance, String animalType, Boolean isKing, Boolean isGood ) {
        this.name = name;
        this.balance =balance;
        this.animalType = animalType;
        this.id = counter.getAndIncrement();
        this.isKing=isKing;
        this.isGood=isGood;
    }
    public String decimalformat(){
        return String.format("%.2f",this.balance);
    }

    public String getStyle(){
        if(this.isKing){
            return "king";
        }
        else{
            return "none";
        }
    }
}
