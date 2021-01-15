package com.greenfoxacademy.club.services;

import com.greenfoxacademy.club.model.Dog;
import org.springframework.stereotype.Service;

@Service
public class TrickCenterService {

    public void addTrick(String trick, Dog dog){
        dog.addTrick(trick);
    }
}
