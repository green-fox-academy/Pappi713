package com.asd.model.action;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Until {
    private Integer until;

    public Until(Integer until){
        this.until=until;
    }

}
