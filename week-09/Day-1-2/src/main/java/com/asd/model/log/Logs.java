package com.asd.model.log;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Logs {

    private List<Log> entries;
    @JsonProperty("entry_count")
    private Integer entryCount;

    public Logs(List<Log> entries, Integer entryCount) {
        this.entries = entries;
        this.entryCount = entryCount;
    }
}
