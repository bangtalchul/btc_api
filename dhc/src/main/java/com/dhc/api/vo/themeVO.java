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
	private LocalDateTime time;
	private String desc;
	private Integer level;
	@Column(name = "store_id")
	private Integer storeId;
	private String status;
	@Column(name = "code_id")
	private Integer codeId;
	@Column(name = "photo_url")
	private String photoUrl;
	private Integer limit;
	@Column(name = "review_cnt")
	private Integer reviewCnt;
}
