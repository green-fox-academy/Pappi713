package com.greenfoxacademy.club.services;

import com.greenfoxacademy.club.model.Dog;
import org.springframework.stereotype.Service;

@Service
public class NutritionService {

    public void updateFoodAndDrink(String food, String drink, Dog dog){
        dog.setFood(food);
        dog.setDrink(drink);
    }
}
