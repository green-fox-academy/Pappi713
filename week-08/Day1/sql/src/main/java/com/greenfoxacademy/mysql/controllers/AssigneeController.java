package com.greenfoxacademy.mysql.controllers;

import com.greenfoxacademy.mysql.model.Assignee;
import com.greenfoxacademy.mysql.model.ToDo;
import com.greenfoxacademy.mysql.repositories.AssigneeRepository;
import com.greenfoxacademy.mysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class AssigneeController {

    private ToDoRepository toDoRepository;
    private AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeController(ToDoRepository toDoRepository, AssigneeRepository assigneeRepository){
        this.toDoRepository=toDoRepository;
        this.assigneeRepository=assigneeRepository;
    }


    @GetMapping("/{id}/edit-assignee")
    public String edit(@PathVariable Long id, Model model){
        Optional<Assignee> optionalAssignee=assigneeRepository.findById(id);
        if(optionalAssignee.isPresent()){
            model.addAttribute("assignee",optionalAssignee.get());
        }
        return "editassignee";
    }
    @PostMapping("/edit-assignee/{id}")
    public String edit( @PathVariable Long id,@ModelAttribute Assignee assignee){
        editAssignee(id,assignee);
        return "redirect:/list";
    }

    public void editAssignee(Long id, Assignee updatedAssigne){
        Optional<Assignee> optionalAssignee = assigneeRepository.findById(id);
        if(!optionalAssignee.isPresent()){
            throw new IllegalArgumentException();
        }
        Assignee assignee = optionalAssignee.get();
        assignee.setName(updatedAssigne.getName());
        assignee.setEmail(updatedAssigne.getEmail());
        assigneeRepository.save(assignee);
    }

    @PostMapping("/add-assignee")
    public String add(Model model, @RequestParam String name, @RequestParam String email){
        assigneeRepository.save(new Assignee(name, email));
        return "redirect:/list";
    }
    @GetMapping("/add-assignee")
    public String add(){
        return "addassignee";
    }
}
