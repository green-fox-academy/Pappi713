package com.greenfoxacademy.mysql.controllers;

import com.greenfoxacademy.mysql.model.ToDo;
import com.greenfoxacademy.mysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ToDoController {
    private ToDoRepository toDoRepository;

    @Autowired
    public ToDoController(ToDoRepository toDoRepository){
        this.toDoRepository=toDoRepository;
    }

    @GetMapping(value = {"/", "/list"})
    public String list(Model model, @RequestParam(required = false) Boolean isDone) {
        List<ToDo> todoka= (List<ToDo>) toDoRepository.findAll();

        if (isDone!=null){
            model.addAttribute("todos", todoka.stream().filter(x->x.getDone()==!isDone).collect(Collectors.toList()));
            model.addAttribute("doneyet",todoka.stream().filter(x->x.getDone()==isDone).collect(Collectors.toList()));
        }
        else{
            model.addAttribute("todos", toDoRepository.findAll());
            model.addAttribute("doneyet", new ArrayList<>());
        }

        return "todolist";
    }

    @PostMapping("/add")
    public String add(Model model, @RequestParam String title){
        toDoRepository.save(new ToDo(title));
        return "redirect:/list";
    }
    @GetMapping("/add")
    public String add(){
        return "add";
    }
    @PostMapping("/{id}/delete")
    public String delete(@PathVariable long id){
        toDoRepository.deleteById(id);
        return "redirect:/list";
    }
}