package com.schdule.service;

import com.schdule.dto.ScdPostRequestDto;
import com.schdule.dto.ScdResponseDto;
import com.schdule.enitity.Schedule;
import com.schdule.repository.ScdRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


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
        scdRepository.save(schedule); //디비에 저장하는 로직

        return new ScdResponseDto(schedule);
    }

    //인풋 값을 디티오로 변환하여 저장하기,,,,컨츠롤의 포스트와 연결

}
