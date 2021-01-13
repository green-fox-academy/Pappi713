package com.greenfoxacademy.webapp.model;

import com.greenfoxacademy.webapp.dj.service.MyColor;
import org.springframework.stereotype.Service;

@Service
public class Red implements MyColor {
    @Override
    public String printcolor() {
        return "Red";
    }
}
