package com.schedule.repository;

import com.schedule.enitity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScdRepository extends JpaRepository<Schedule, Long> {

}
