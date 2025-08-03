package com.schedule.service;

import com.schedule.dto.ScdPatchRequestDto;
import com.schedule.dto.ScdPostRequestDto;
import com.schedule.dto.ScdResponseDto;
import com.schedule.enitity.Schedule;
import com.schedule.repository.ScdRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
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

    //스프링 스럽지 못하다는것은 알지만 내가 아는데로 풀어봤다.
    public List<ScdResponseDto> findByName(String name) {
        List<Schedule> schedules = scdRepository.findAll();
        List<ScdResponseDto> scdResponseDtos = new ArrayList<>();
        for (Schedule schedule : schedules) {
            if (schedule.getName().equals(name)) {
                scdResponseDtos.add(new ScdResponseDto(schedule));
            }
        }
        return scdResponseDtos;
    }

    public ScdResponseDto update(Long id, String password,String title,String name) {
        List<Schedule> schedules = scdRepository.findAll();
        ScdResponseDto scdResponseDto = null;

        for (Schedule schedule : schedules) {
            if (schedule.getId().equals(id)&& schedule.getPassword().equals(password)) {
                schedule.setTitle(title);
                schedule.setName(name);
                scdResponseDto =  new ScdResponseDto( scdRepository.save(schedule));
            }
        }
        return scdResponseDto;
    }





}