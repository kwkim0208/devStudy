package com.millutae.devstudy.entity;

import com.millutae.devstudy.entity.constant.MemberGrade;
import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    @GeneratedValue
    private Long id;
    private String userName;
    private String password;
    @Enumerated(EnumType.STRING)
    private  MemberGrade memberGrade=MemberGrade.bronze;
    @Timestamp
    private LocalDateTime createDate;
    @Timestamp
    private LocalDateTime updateDate;

}
