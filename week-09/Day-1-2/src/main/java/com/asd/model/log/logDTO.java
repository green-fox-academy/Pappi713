package com.asd.model.log;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
public class logDTO {
    private long ID;
    private String endpoint;
    private String data;
}
