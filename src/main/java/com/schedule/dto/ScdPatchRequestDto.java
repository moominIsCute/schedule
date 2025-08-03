package com.schedule.dto;

import lombok.Getter;

@Getter
public class ScdPatchRequestDto {
    private final String title;    //서비스한테 받은 인풋을 엔티티형태로 변환하여 저장하기
    private final String name;
    private final String password;

    public ScdPatchRequestDto(String title, String contents, String name, String password) {
        this.title = title;
        this.name = name;
        this.password = password;
    }
}
