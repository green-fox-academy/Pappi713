package com.greenfoxacademy.club.services;

import com.greenfoxacademy.club.model.Fox;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class InformationService {
    @Getter
    private List<Fox> foxList;

    public InformationService() {
        this.foxList = new ArrayList<>();
        foxList.add(new Fox("Mr. Fox"));
    }

    public Fox piciFastFox(String name) {
        Fox selectedFox = foxList.stream().filter(f -> f.getName().equals(name)).findAny().orElse(new Fox(name));
        return selectedFox;
    }
    public void addFox(String name){
        Fox newFox = new Fox(name);
        Optional<Fox> selectedFox = foxList.stream().filter(f -> f.getName().equals(name)).findAny();
        if(!selectedFox.isPresent()){
            foxList.add(newFox);
        }
    }
    public void updateNutrition(String food, String drink, Fox fox){
            for(Fox foxy:foxList){
                if(foxy.getName().equals(fox.getName())){
                    foxy.setFood(food);
                    foxy.setDrink(drink);
                }
        }
    }
    public void addTrick(String trick, Fox fox){
        for(Fox foxy:foxList){
            if(foxy.getName().equals(fox.getName())){
                foxy.addTrick(trick);
            }
        }
    }
}
