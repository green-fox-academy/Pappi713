package com.greenfoxacademy.mysql.controllers;

import com.greenfoxacademy.mysql.model.Assignee;
import com.greenfoxacademy.mysql.model.ToDo;
import com.greenfoxacademy.mysql.repositories.AssigneeRepository;
import com.greenfoxacademy.mysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class ToDoController {
    private ToDoRepository toDoRepository;
    private AssigneeRepository assigneeRepository;

    @Autowired
    public ToDoController(ToDoRepository toDoRepository, AssigneeRepository assigneeRepository){
        this.toDoRepository=toDoRepository;
        this.assigneeRepository=assigneeRepository;
    }

    @GetMapping(value = {"/", "/list"})
    public String list(Model model, @RequestParam(required = false) Boolean isDone) {
        List<ToDo> todoka= (List<ToDo>) toDoRepository.findAll();
        List<Assignee> assignees = (List<Assignee>) assigneeRepository.findAll();

        if (isDone!=null){
            model.addAttribute("todos", todoka.stream().filter(x->x.getDone()==!isDone).collect(Collectors.toList()));
            model.addAttribute("doneyet",todoka.stream().filter(x->x.getDone()==isDone).collect(Collectors.toList()));
        }
        else{
            model.addAttribute("todos", toDoRepository.findAll());
            model.addAttribute("doneyet", new ArrayList<>());
        }
        model.addAttribute("assignees",assignees);

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


    @GetMapping ("/{id}/delete")
    public String deleteTodo (@PathVariable Long id){
        toDoRepository.deleteById(id);
        return "redirect:/list";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Long id, Model model){
        Optional<ToDo> optionalToDo=toDoRepository.findById(id);
        if(optionalToDo.isPresent()){
            model.addAttribute("todo",optionalToDo.get());
        }
        return "edit";
    }
    @PostMapping("/edit-todo/{id}")
    public String edit( @PathVariable Long id,@ModelAttribute ToDo todo){
        edittodo(id,todo);
        return "redirect:/list";
    }

    public void edittodo(Long id, ToDo updatedToDo){
        Optional<ToDo> optionalToDo = toDoRepository.findById(id);
        if(!optionalToDo.isPresent()){
            throw new IllegalArgumentException();
        }
        ToDo todo = optionalToDo.get();
        todo.setTitle(updatedToDo.getTitle());
        todo.setDone(updatedToDo.getDone());
        todo.setUrgent(updatedToDo.getUrgent());
        toDoRepository.save(todo);
    }

    @PostMapping("/search")
    public String search(Model model, @RequestParam String search){
        List<ToDo> todoka= (List<ToDo>) toDoRepository.findAll();
        model.addAttribute("todos",todoka.stream().filter(s->s.getTitle().contains(search)).collect(Collectors.toList()));
        return "todolist";
    }


}