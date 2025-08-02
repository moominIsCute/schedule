package com.schedule.controller;

import com.schedule.dto.ScdPostRequestDto;
import com.schedule.dto.ScdResponseDto;
import com.schedule.service.ScdService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ScdController {
    private final ScdService scdService;

    @PostMapping
    ResponseEntity<ScdResponseDto> scdCreate(
            @RequestBody ScdPostRequestDto scdPostRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(scdService.scdCreate(scdPostRequestDto));
    }

    @GetMapping( "/schedule")
    ResponseEntity<List<ScdResponseDto>> scdFindAll(
    ){
        return ResponseEntity.status(HttpStatus.OK).body(scdService.findAll());
    }

    @GetMapping("/schedule/{Name}")
    ResponseEntity<List<ScdResponseDto>> scdFindByName(@PathVariable("Name") String name) {
        return ResponseEntity.status(HttpStatus.OK).body(scdService.findByName(name));
    }


}
