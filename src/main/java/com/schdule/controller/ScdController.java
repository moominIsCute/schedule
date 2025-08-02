package com.schdule.controller;

import com.schdule.service.ScdService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ScdController {
    ScdService scdService;

    @PostMapping
    //등록 메소드 만들기 서비스 호출
}
