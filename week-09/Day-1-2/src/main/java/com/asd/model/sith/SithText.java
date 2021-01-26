package com.asd.model.sith;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SithText {
    @JsonProperty("sith_text")
    private String text;

    public SithText(String text) {
        this.text = text;
    }
}
