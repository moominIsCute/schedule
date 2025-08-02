package com.schdule.dto;

import com.schdule.enitity.Schedule;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ScheduleResponseDto {


    private String title;
    private String name;
    private String password;
    private LocalDateTime setTime; //Dto로 빼야 할듯
    private LocalDateTime modifyTime;

    public ScheduleResponseDto( String title, String name, String password, LocalDateTime setTime) {

        this.title = title;
        this.name = name;
        this.password = password;
        this.setTime = setTime;
    }

    public ScheduleResponseDto(Schedule schedule) {
        this.title = schedule.getTitle();
        this.name = schedule.getName();
        this.password = schedule.getPassword();
        this.setTime = schedule.getSetTime();

    }
}
