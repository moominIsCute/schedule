package com.schedule.dto;

import lombok.Getter;

@Getter
public class ScdDeleteRequestDto {
    private final String password;

    public ScdDeleteRequestDto( String name, String password) {
        this.password = password;
    }
}
