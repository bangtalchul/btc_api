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
@Table(name = "reserve")
@Data

@Builder
@AllArgsConstructor
@NoArgsConstructor

public class reserveVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reserveId;
	@Column
	private LocalDateTime createTime;
	private Integer peopleNum;
	private Integer groupId;
	private String status;
	private Integer themeId;
}
