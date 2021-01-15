package com.greenfoxacademy.club.services;

import com.greenfoxacademy.club.model.Dog;
import org.springframework.stereotype.Service;

@Service
public class StatIncreaseService {

    public void increaseStr(Dog dog){
        dog.getStats().setStr(dog.getStats().getStr()+1);
    }
    public void increaseDex(Dog dog){
        dog.getStats().setDex(dog.getStats().getDex()+1);
    }
    public void increaseInt(Dog dog){
        dog.getStats().setInt(dog.getStats().getInt()+1);
    }
    public void reduceAvailableUpgradePoints(Dog dog){
        dog.setUpgradePoints(dog.getUpgradePoints()-1);
    }
    public void lvlUp(Dog dog){
        dog.getStats().setLvl(dog.getStats().getLvl()+1);
        dog.setUpgradePoints(dog.getUpgradePoints()+4);
        dog.getStats().setHP(dog.getStats().getHP()+3);
    }
}
