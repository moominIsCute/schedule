package com.schdule.dto;

import com.schdule.enitity.Schedule;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ScdDto {

    Schedule schedule;
    //서비스한테 받은 인풋을 엔티티형태로 변환하여 저장하기
    private final String title;
    private final String contents;
    private final String name;
    private final String password;
    private final LocalDateTime time;

    //서비스에서 로직 실행해야함, 여기서 엔티티로 직접 넣을려고 고민했었음
    public ScdDto(String title, String contents, String name, String password, LocalDateTime time) {
        this.title = title;
        this.contents = contents;
        this.name = name;
        this.password = password;
        this.time = time;
    }
}
