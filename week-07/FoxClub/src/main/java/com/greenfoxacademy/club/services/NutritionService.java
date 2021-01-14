package com.greenfoxacademy.club.services;

import com.greenfoxacademy.club.model.Fox;
import org.springframework.stereotype.Service;

@Service
public class NutritionService {

    public void updateFoodAndDrink(String food, String drink, Fox fox){
        fox.setFood(food);
        fox.setDrink(drink);
    }
}
