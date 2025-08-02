package com.schdule.controller;

import com.schdule.repository.ScheduleRepository;
import com.schdule.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final ScheduleService scheduleService;


}
