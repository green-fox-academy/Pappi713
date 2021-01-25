package com.demo.model.append;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Append {

    private String appended;

    public Append(String appendo){
        this.appended=appendo+"a";
    }
}
