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
@Table(name = "themeresmanager")
@Data

@Builder
@AllArgsConstructor
@NoArgsConstructor

public class themeresmanagerVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer trmId;
	@Column
	private LocalDateTime startTime;
	private LocalDateTime date;
	private String status;
	private LocalDateTime createTime;
	private LocalDateTime editTime;
	private String resStatus;
	private Integer reserveId;
	
}
