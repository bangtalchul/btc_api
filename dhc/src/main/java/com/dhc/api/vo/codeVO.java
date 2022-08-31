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
@Table(name = "code")
@Data

@Builder
@AllArgsConstructor
@NoArgsConstructor

public class codeVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codeId;
	@Column
	private Integer type;
	private String desc;
	
}
