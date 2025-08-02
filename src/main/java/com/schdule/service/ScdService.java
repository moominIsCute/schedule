package com.schdule.service;

import com.schdule.dto.ScdDto;
import com.schdule.enitity.Schedule;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ScdService {

    public Schedule scdCreate(ScdDto scdDto) {
        return new Schedule(
                scdDto.getTitle(),
                scdDto.getContents(),
                scdDto.getName(),
                scdDto.getPassword()
                );
    }

    //인풋 값을 디티오로 변환하여 저장하기,,,,컨츠롤의 포스트와 연결

}
