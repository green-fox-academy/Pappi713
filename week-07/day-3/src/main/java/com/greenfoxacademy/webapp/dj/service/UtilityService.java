package com.greenfoxacademy.webapp.dj.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class UtilityService {

    private List<String> colors;
    private Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }


    public String caesar(String text, int number) {
        if (number < 0) {
            number = 26 + number;
        }

        String result = "";
        for (int i = 0; i < text.length(); i++) {
            int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
            result += (char) (((int) text.charAt(i) + number - offset) % 26 + offset);
        }
        return result;
    }

    public String[] validateEmail(String email){
        String[] textAndColor =new String[2];
        if(email.contains("@") && email.contains(".")){
            if(email.indexOf("@")<email.indexOf(".")){
                textAndColor[0]="Its a valid email adress";
                textAndColor[1]="green";
            }
            else {
                textAndColor[0]="Wrong email adress!";
                textAndColor[1]="red";
            }
        }
        else {
            textAndColor[0]="Wrong email adress!";
            textAndColor[1]="red";
        }
        return textAndColor;
    }
}