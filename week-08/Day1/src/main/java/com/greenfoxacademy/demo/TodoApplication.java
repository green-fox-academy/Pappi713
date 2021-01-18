package com.greenfoxacademy.demo;

import com.greenfoxacademy.demo.model.ToDo;
import com.greenfoxacademy.demo.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {
    private ToDoRepository toDoRepository;


    @Autowired
    public TodoApplication(ToDoRepository toDoRepository){
        this.toDoRepository=toDoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        toDoRepository.save(new ToDo("I have to learn Object Relational Mapping"));
        toDoRepository.save(new ToDo("I have to eat some chocholate"));
    }
}
