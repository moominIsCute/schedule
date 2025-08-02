package com.schedule.dto;

import com.schedule.enitity.Schedule;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ScdResponseDto{

    //서비스한테 받은 인풋을 엔티티형태로 변환하여 저장하기
    private final String title;
    private final String contents;
    private final String name;
    //private final String password; 비밀번호는 반환할 필요가 없음
    private final LocalDateTime createAt;
    private final LocalDateTime modifiedAt;


    //서비스에서 로직 실행해야함, 여기서 엔티티로 직접 넣을려고 고민했었음

    public ScdResponseDto(Schedule schedule) {
        this.title = schedule.getTitle();
        this.contents = schedule.getContents();
        this.name = schedule.getName();
        //this.password = schedule.getPassword();
        this.createAt = schedule.getCreateAt();
        this.modifiedAt = schedule.getModifiedAt();
    }
}
