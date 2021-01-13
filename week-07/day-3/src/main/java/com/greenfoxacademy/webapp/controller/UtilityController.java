package com.greenfoxacademy.webapp.controller;

import com.greenfoxacademy.webapp.dj.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {

    private UtilityService utilityService;

    @Autowired
    UtilityController(UtilityService utilityService){
        this.utilityService=utilityService;
    }

    @GetMapping("/useful")
    public String useful() {
        return "useful";
    }

    @GetMapping("/useful/colored")
    public String colored(Model model) {
        model.addAttribute("color",utilityService.randomColor());
        return "colored";
    }

    @GetMapping("/useful/email")
    public String email(Model model, @RequestParam String email) {
        String[] dataToModel=utilityService.validateEmail(email);
        model.addAttribute("text",dataToModel[0]);
        model.addAttribute("color",dataToModel[1]);
        return "email";
    }

    @GetMapping("/useful/encode")
    public String encode(Model model, @RequestParam String text, @RequestParam String number) {
        String encoded=utilityService.caesar(text,Integer.parseInt(number));
        model.addAttribute("coded",encoded);
        return "cesar";
    }

    @GetMapping("/useful/decode")
    public String decode(Model model, @RequestParam String text, @RequestParam String number) {
        String encoded=utilityService.caesar(text,(-1)*Integer.parseInt(number));
        model.addAttribute("coded",encoded);
        return "cesar";
    }


}
