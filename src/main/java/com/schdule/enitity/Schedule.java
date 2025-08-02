package com.schdule.enitity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String contents;
    private String name;
    private String password;
    private LocalDateTime time; //DTO로 뺄 수도 있다.

    public Schedule( String title, String contents, String name, String password, LocalDateTime time) {
        this.title = title;
        this.contents = contents;
        this.name = name;
        this.password = password;
        this.time = time;
    }
}
