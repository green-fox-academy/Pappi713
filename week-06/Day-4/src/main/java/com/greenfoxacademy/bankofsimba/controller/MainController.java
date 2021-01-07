package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import com.sun.tools.javac.Main;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    private List<BankAccount> accounts = new ArrayList<>();
    public MainController() {
        accounts.add(new BankAccount("Pumikli", 1200d, "horse",false, true));
        accounts.add(new BankAccount("Maugli", 800d, "zebra",false, true));
        accounts.add(new BankAccount("Virsli", 2500d, "dog",false, false));
        accounts.add(new BankAccount("Bruszli", 9999d, "god",true, true));
    }


    @GetMapping("/show")
    public String showaccount(Model model){
        BankAccount bankAccount=new BankAccount("Simba",2000d,"lion",false, true);
        model.addAttribute("name",bankAccount.getName());
        model.addAttribute("balance",bankAccount.decimalformat());
        model.addAttribute("animalType",bankAccount.getAnimalType());
        return "show";
    }
    @GetMapping("/text")
    public String showtext(Model model){
        String text="This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("text",text);
        return "text";
    }
    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("accounts", accounts);
        return "list";
    }
}
