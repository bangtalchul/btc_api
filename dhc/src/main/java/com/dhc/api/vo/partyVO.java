package com.dhc.api.vo;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.*;
@Entity
@Table(name = "party")
@Data

@Builder
@AllArgsConstructor
@NoArgsConstructor

public class partyVO {
	@Id
	private Integer userId;
	private Integer groupId;
	
}
