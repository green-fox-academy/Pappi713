package com.asd.model.sith;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Text {
    private String text;

    public Text(String text) {
        this.text = text;
    }
}
