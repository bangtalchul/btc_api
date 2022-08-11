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
@Table(name = "theme")
@Data

@Builder
@AllArgsConstructor
@NoArgsConstructor

public class themeVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer themeId;
	@Column
	private LocalDateTime Time;
	private String desc;
	private Integer level;
	private Integer storeId;
	private String status;
	private Integer codeId;
	private String photoUrl;
	private Integer limit;
	
}
