package com.dhc.api.vo;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.*;
@Entity
@Table(name = "user")
@Data

@Builder
@AllArgsConstructor
@NoArgsConstructor

public class userVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	@Column
	private String key;
	private String status;
	private String birth;
	private String gender;
	private LocalDateTime firstLoginTime;
	private LocalDateTime lastLoginTime;
	private Integer report;
	private String nickname;
	private Integer codeId;
	
}
