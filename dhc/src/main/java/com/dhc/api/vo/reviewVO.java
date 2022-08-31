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
@Table(name = "review")
@Data

@Builder
@AllArgsConstructor
@NoArgsConstructor

public class reviewVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reviewId;
	@Column
	private Integer userId;
	private Integer rating;
	private Integer themeId;
	private Integer storeId;
	private LocalDateTime createTime;
	private LocalDateTime editTime;
	private String status;
	private Float q1;
	private Float q2;
	private Float q3;
	private Float q4;
	private String successYn;
}
