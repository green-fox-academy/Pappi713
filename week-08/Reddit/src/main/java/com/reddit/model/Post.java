package com.reddit.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String title;
    @Type(type = "text")
    private String content;
    private Long score = 0l;
    @Type(type = "timestamp")
    private Timestamp postedTime;

    public Post(String title, String content, Timestamp postedTime) {
        this.title = title;
        this.content = content;
        this.postedTime=postedTime;
    }

    public Long getScore() {
        return this.score;
    }


}
