package com.schedule.enitity;


import jakarta.persistence.*;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


import java.time.LocalDateTime;


@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseSchedule { //시간 고정하기 위한 시도, 그냥 시간 알아서 해준다고 이해하라고 하셨음, 팩트확인 필요함
// 이 클래스 만들고 디티오에 연결해주었음, 기존 엔티티(스케쥴)은 상속을 받음
    @CreatedDate
    @Column(updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createAt;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime modifiedAt;

}
