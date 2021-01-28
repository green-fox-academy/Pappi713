package com.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Arrow {
    private Double distance;
    private Double time;
    private Double speed;

    public Arrow(Double distance, Double time) {
        this.distance = distance;
        this.time = time;
        this.speed=distance/time;
    }
}
