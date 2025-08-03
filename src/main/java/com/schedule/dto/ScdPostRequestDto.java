package com.schedule.dto;

import lombok.Getter;

@Getter
public class ScdPostRequestDto {

    private final String title;
    private final String contents;
    private final String name;
    private final String password;

    public ScdPostRequestDto(String title, String contents, String name, String password) {
        this.title = title;
        this.contents = contents;
        this.name = name;
        this.password = password;
    }
}
