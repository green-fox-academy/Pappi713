package com.greenfoxacademy.club.services;

import com.greenfoxacademy.club.model.Dog;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class InformationService {
    @Getter
    private List<Dog> dogList;

    public InformationService() {
        this.dogList = new ArrayList<>();
        dogList.add(new Dog("Mr. Wuf"));
    }

    public Dog piciFastDog(String name) {
        Dog selectedDog = dogList.stream().filter(f -> f.getName().equals(name)).findAny().orElse(new Dog(name));
        return selectedDog;
    }
    public void addDog(String name){
        Dog newDog = new Dog(name);
        Optional<Dog> selectedDog = dogList.stream().filter(f -> f.getName().equals(name)).findAny();
        if(!selectedDog.isPresent()){
            dogList.add(newDog);
        }
    }
    public void updateNutrition(String food, String drink, Dog dog){
            for(Dog dogy: dogList){
                if(dogy.getName().equals(dog.getName())){
                    dogy.setFood(food);
                    dogy.setDrink(drink);
                }
        }
    }
    public void addTrick(String trick, Dog dog){
        for(Dog dogy: dogList){
            if(dogy.getName().equals(dog.getName())){
                dogy.addTrick(trick);
            }
        }
    }
    public void updateStat(Dog dog){
        for(Dog dogy : dogList){
            if(dogy.getName().equals(dog.getName())){
                dogy.getStats().setStr(dog.getStats().getStr());
                dogy.getStats().setDex(dog.getStats().getDex());
                dogy.getStats().setInt(dog.getStats().getInt());
                dogy.getStats().setHP(dog.getStats().getHP());
                dogy.getStats().setLvl(dog.getStats().getLvl());
                dogy.setUpgradePoints(dog.getUpgradePoints());

            }
        }
    }
}
