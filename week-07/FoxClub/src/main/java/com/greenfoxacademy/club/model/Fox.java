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
public class Fox {
    private String name;
    private List<String> listOfTricks =new ArrayList<>();
    private String food ;
    private String drink;

    public Fox(String name){
        this.name=name;
        this.food="Bread";
        this.drink="Water";
    }

    public void addTrick(String trick){
        this.listOfTricks.add(trick);
    }
}
