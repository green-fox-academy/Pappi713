package com.greenfoxacademy.webapp.controller;

import com.greenfoxacademy.webapp.dj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreenFoxAppController {

    private StudentService studentService;

    @Autowired
    GreenFoxAppController(StudentService studentService){
        this.studentService=studentService;
    }

    @GetMapping("/gfa")
    public String table(Model model) {
        model.addAttribute("names",studentService.findAll());
        model.addAttribute("size",studentService.count());
        return "gfa";
    }

    @GetMapping("/gfa/list")
    public String list(Model model) {
        model.addAttribute("names",studentService.findAll());
        model.addAttribute("size",studentService.count());
        return "list";
    }

    @GetMapping("/gfa/add")
    public String add(Model model) {
        return "add";
    }
    @PostMapping("/gfa/add/save")
    public String save(Model model, @RequestParam String name) {
        studentService.save(name);
         return "redirect:/gfa";
    }
}
