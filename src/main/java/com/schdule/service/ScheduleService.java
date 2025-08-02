package com.schdule.service;

import com.schdule.dto.ScheduleRequestDto;
import com.schdule.dto.ScheduleResponseDto;
import com.schdule.enitity.Schedule;
import com.schdule.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    ScheduleRepository scheduleRepository;

    public ScheduleResponseDto createSchedule(ScheduleRequestDto scheduleRequestDto) {
        Schedule schedule = new Schedule(
                scheduleRequestDto.getTitle(),scheduleRequestDto.getName(),
                scheduleRequestDto.getPassword(), scheduleRequestDto.getSetTime());
        return new ScheduleResponseDto(schedule);


    }
}
