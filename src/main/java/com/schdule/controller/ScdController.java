package com.schdule.controller;

import com.schdule.dto.ScdDto;
import com.schdule.enitity.Schedule;
import com.schdule.repository.ScdRepository;
import com.schdule.service.ScdService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ScdController {
    ScdService scdService;

@PostMapping
    Schedule scdCreate(
            @RequestBody ScdDto scdDto) {
    return scdService.scdCreate(scdDto);
    }
    //등록 메소드 만들기 서비스 호출
}
