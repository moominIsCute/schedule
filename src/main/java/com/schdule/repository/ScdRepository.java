package com.schdule.repository;

import com.schdule.enitity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScdRepository extends JpaRepository<Schedule, Long> {
}
