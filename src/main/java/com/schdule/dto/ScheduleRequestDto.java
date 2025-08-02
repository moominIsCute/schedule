package com.schdule.dto;


import com.schdule.enitity.Schedule;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ScheduleRequestDto {

    Schedule schedule;

    private final String title;
    private final String name;
    private final String password;
    private final LocalDateTime setTime;


    public ScheduleRequestDto(String title, String name, String password, LocalDateTime setTime) {
        this.title = title;
        this.name = name;
        this.password = password;
        this.setTime = setTime;
    }
}
