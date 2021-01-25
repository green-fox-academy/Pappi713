package com.demo.model.greeter;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Welcome {

private String welcome_message;

public Welcome(String name, String title){
    this.welcome_message= "Oh, hi there "+name+", my dear "+title+"!";
}



}
