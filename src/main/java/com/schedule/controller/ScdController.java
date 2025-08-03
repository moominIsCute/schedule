package com.schedule.controller;

import com.schedule.dto.ScdDeleteRequestDto;
import com.schedule.dto.ScdPatchRequestDto;
import com.schedule.dto.ScdPostRequestDto;
import com.schedule.dto.ScdResponseDto;
import com.schedule.service.ScdService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ScdController {
    private final ScdService scdService;

    @PostMapping
    public ResponseEntity<ScdResponseDto> scdCreate(
            @RequestBody ScdPostRequestDto scdPostRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(scdService.scdCreate(scdPostRequestDto));
    }

    @GetMapping("/schedule")
    public ResponseEntity<List<ScdResponseDto>> scdFindAll(
    ) {
        return ResponseEntity.status(HttpStatus.OK).body(scdService.findAll());
    }

    @GetMapping("/schedule/{Name}")
    public ResponseEntity<List<ScdResponseDto>> scdFindByName(@PathVariable("Name") String name) {
        return ResponseEntity.status(HttpStatus.OK).body(scdService.findByName(name));
    }

    @PatchMapping("/schedule/{id}")
    public ResponseEntity<ScdResponseDto> scdUpdate(@PathVariable("id") Long id, @RequestBody ScdPatchRequestDto scdPatchRequestDto) {
        String password = scdPatchRequestDto.getPassword();
        String title = scdPatchRequestDto.getTitle();
        String name = scdPatchRequestDto.getName();
        return ResponseEntity.status(HttpStatus.OK).body(scdService.update(id, password, title, name));
    }

    @DeleteMapping("schedule/{id}/del")
    public ResponseEntity<List<ScdResponseDto>> scddelete(@PathVariable("id") Long id, @RequestBody ScdDeleteRequestDto scdDeleteRequestDto) {
        String password = scdDeleteRequestDto.getPassword();
        return ResponseEntity.status(HttpStatus.OK).body(scdService.delete(id, password));
    }


}
