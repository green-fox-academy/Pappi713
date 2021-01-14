package com.greenfoxacademy.club.controllers;

import com.greenfoxacademy.club.model.Fox;
import com.greenfoxacademy.club.services.InformationService;
import com.greenfoxacademy.club.services.NutritionService;
import com.greenfoxacademy.club.services.TrickCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {


    private InformationService informationService;
    private NutritionService nutritionService;
    private TrickCenterService trickCenterService;
    private Fox fox=new Fox("Mr. Fox");

    @Autowired
    MainController(InformationService informationService, NutritionService nutritionService, TrickCenterService trickCenterService){
        this.informationService=informationService;
        this.nutritionService=nutritionService;
        this.trickCenterService=trickCenterService;
    }


    @GetMapping("/")
    public String index(Model model,@RequestParam(required = false) String name) {
        if(name==null){
            this.fox=informationService.piciFastFox(this.fox.getName());
        }
        else{
            fox=informationService.piciFastFox(name);
        }
        model.addAttribute("fox",this.fox);
        Integer numberOfTricks =fox.getListOfTricks().size();
        model.addAttribute("numberOfTricks",numberOfTricks);
        return "index";
    }

    @GetMapping("/login")
    public String toLogin(Model model) {
        model.addAttribute("fixlist",informationService.getFoxList());
        return "login";
    }

    @PostMapping("/login")
    public String login( @RequestParam(required = true) String name) {
        informationService.addFox(name);
        return "redirect:/?name=" + name;
    }

    @GetMapping("/nutrition")
    public String nutrition() {
        return "nutrition";
    }

    @PostMapping("/updade-food-drink")
    public String changeNutrition(@RequestParam String food, @RequestParam String drink){
        nutritionService.updateFoodAndDrink(food,drink, this.fox);
        informationService.updateNutrition(food,drink,this.fox);
        return "redirect:/";
    }

    @GetMapping("/updade-trick-list")
    public String trickCenter() {
        return "trickcenter";
    }

    @PostMapping("/updade-trick-list")
    public String addTrick(@RequestParam String trick){
    //trickCenterService.addTrick(trick, this.fox);
    informationService.addTrick(trick,this.fox);
        return "redirect:/";
    }
}
