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
@Table(name = "store")
@Data

@Builder
@AllArgsConstructor
@NoArgsConstructor

public class storeVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer storeId;
	@Column
	private String name;
	private String address;
	private String phoneNumber;
	private String status;
	private String desc;
	private LocalDateTime createTime;
	private Integer userId;
	private LocalDateTime editTime;
	private String photoUrl;
	
}
