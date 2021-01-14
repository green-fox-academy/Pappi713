package com.greenfoxacademy.club.services;

import com.greenfoxacademy.club.model.Fox;
import org.springframework.stereotype.Service;

@Service
public class TrickCenterService {

    public void addTrick(String trick, Fox fox){
        fox.addTrick(trick);
    }
}
