package com.schedule.service;

import com.schedule.dto.ScdPostRequestDto;
import com.schedule.dto.ScdResponseDto;
import com.schedule.enitity.Schedule;
import com.schedule.repository.ScdRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class ScdService {

    private final ScdRepository scdRepository;

    public ScdResponseDto scdCreate(ScdPostRequestDto scdPostRequestDto) {
        Schedule schedule = new Schedule(
                scdPostRequestDto.getTitle(),
                scdPostRequestDto.getContents(),
                scdPostRequestDto.getName(),
                scdPostRequestDto.getPassword()
        );
        Schedule postSch = scdRepository.save(schedule); //디비에 저장하는 로직

        return new ScdResponseDto(postSch);
    }
    @Transactional(readOnly = true)
    public List<ScdResponseDto> findAll() {
        List<Schedule> schedules = scdRepository.findAll();
        List<ScdResponseDto> scdResponseDtos = new ArrayList<>();
        for (Schedule schedule : schedules) {
            scdResponseDtos.add(new ScdResponseDto(schedule));
        }
        return scdResponseDtos;
    }

    //인풋 값을 디티오로 변환하여 저장하기,,,,컨츠롤의 포스트와 연결
}