package com.schdule.controller;

import com.schdule.dto.ScdPostRequestDto;
import com.schdule.dto.ScdResponseDto;
import com.schdule.service.ScdService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ScdController {
    private final ScdService scdService;

    @PostMapping
    ResponseEntity<ScdResponseDto> scdCreate(
            @RequestBody ScdPostRequestDto scdPostRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(scdService.scdCreate(scdPostRequestDto));
    }
}
