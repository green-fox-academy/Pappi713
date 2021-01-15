package com.greenfoxacademy.club.controllers;

import com.greenfoxacademy.club.model.Dog;
import com.greenfoxacademy.club.services.InformationService;
import com.greenfoxacademy.club.services.NutritionService;
import com.greenfoxacademy.club.services.StatIncreaseService;
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
    private StatIncreaseService statIncreaseService;
    private Dog dog =new Dog("Mr. Wuf");

    @Autowired
    MainController(InformationService informationService, NutritionService nutritionService, TrickCenterService trickCenterService, StatIncreaseService statIncreaseService){
        this.informationService=informationService;
        this.nutritionService=nutritionService;
        this.trickCenterService=trickCenterService;
        this.statIncreaseService=statIncreaseService;
    }


    @GetMapping("/")
    public String index(Model model,@RequestParam(required = false) String name) {
        if(name==null){
            this.dog =informationService.piciFastDog(this.dog.getName());
        }
        else{
            dog =informationService.piciFastDog(name);
        }
        model.addAttribute("dog",this.dog);
        Integer numberOfTricks = dog.getListOfTricks().size();
        model.addAttribute("numberOfTricks",numberOfTricks);
        return "index";
    }

    @GetMapping("/login")
    public String toLogin(Model model) {
        model.addAttribute("fixlist",informationService.getDogList());
        return "login";
    }

    @PostMapping("/login")
    public String login( @RequestParam(required = true) String name) {
        informationService.addDog(name);
        return "redirect:/?name=" + name;
    }

    @GetMapping("/nutrition")
    public String nutrition() {
        return "nutrition";
    }

    @PostMapping("/updade-food-drink")
    public String changeNutrition(@RequestParam String food, @RequestParam String drink){
        nutritionService.updateFoodAndDrink(food,drink, this.dog);
        informationService.updateNutrition(food,drink,this.dog);
        return "redirect:/";
    }

    @GetMapping("/updade-trick-list")
    public String trickCenter() {
        return "trickcenter";
    }

    @PostMapping("/updade-trick-list")
    public String addTrick(@RequestParam String trick){
    //trickCenterService.addTrick(trick, this.fox);
    informationService.addTrick(trick,this.dog);
        return "redirect:/";
    }

    @GetMapping("/increase-str")
    public String increaseStr(){
        statIncreaseService.increaseStr(this.dog);
        statIncreaseService.reduceAvailableUpgradePoints(this.dog);
        informationService.updateStat(this.dog);
        return "redirect:/";
    }

    @GetMapping("/increase-dex")
    public String increaseDex(){
        statIncreaseService.increaseDex(this.dog);
        statIncreaseService.reduceAvailableUpgradePoints(this.dog);
        informationService.updateStat(this.dog);
        return "redirect:/";
    }

    @GetMapping("/increase-int")
    public String increaseInt(){
        statIncreaseService.increaseInt(this.dog);
        statIncreaseService.reduceAvailableUpgradePoints(this.dog);
        informationService.updateStat(this.dog);
        return "redirect:/";
    }

    @GetMapping("/lvl-up")
    public String lvlUp(){
        statIncreaseService.lvlUp(this.dog);
        informationService.updateStat(this.dog);
        return "redirect:/";
    }
}
