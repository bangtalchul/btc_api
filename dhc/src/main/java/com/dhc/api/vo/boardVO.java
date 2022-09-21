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
@Table(name = "board")
@Data

@Builder
@AllArgsConstructor
@NoArgsConstructor

public class boardVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer boardId;
	@Column
	private String title;
	private String category;
	@Column(name="user_id")
	private String userId;
	private String nickname;
	private LocalDateTime createTime;
	private LocalDateTime editTime;
	private String status;
	private String content;
	private Integer viewCount;
	
}
