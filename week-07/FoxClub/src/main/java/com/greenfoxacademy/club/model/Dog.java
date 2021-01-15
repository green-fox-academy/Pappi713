package com.greenfoxacademy.club.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Dog {
    private String name;
    private List<String> listOfTricks =new ArrayList<>();
    private String food ;
    private String drink;
    private DogStats stats;
    private Integer upgradePoints;

    public Dog(String name){
        this.name=name;
        this.food="Bread";
        this.drink="Water";
        this.stats=new DogStats();
        this.upgradePoints=5;
    }

    public void addTrick(String trick){
        this.listOfTricks.add(trick);
    }
}
