package com.dhc.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhc.api.service.BoardService;
import com.dhc.api.vo.boardVO;

import java.util.*;
import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class MainController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private final BoardService boardService ;
	@GetMapping(value="/save")
	public ResponseEntity<HashMap<String, Object>> save(){
		HashMap<String,Object> ret = new HashMap<>();
		try {
			logger.info("Main Controller");
			boardVO boardVo = new boardVO();
			boardVo.setBoardId(1);
			boardVo.setCategory("테스트");
			boardVo.setNickname("닉네임");
			ret.put("board", boardVo);
			return new ResponseEntity<>(ret, HttpStatus.OK);
		} catch (Exception e) {
			ret.put("error",e);
			return new ResponseEntity<>(ret, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
