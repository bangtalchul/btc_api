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
@Table(name = "comment")
@Data

@Builder
@AllArgsConstructor
@NoArgsConstructor

public class commentVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer commentId;
	@Column
	private Integer userId;
	private String content;
	private LocalDateTime createTime;
	private LocalDateTime editTime;
	private String status;
	private Integer boardId;
}
