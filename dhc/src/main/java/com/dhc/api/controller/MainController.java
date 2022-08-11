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
import com.dhc.api.vo.storeVO;

import java.util.*;
import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class MainController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private final BoardService boardService ;
	@GetMapping(value="/board/save")
	public ResponseEntity<HashMap<String, Object>> boardSave(){
		HashMap<String,Object> ret = new HashMap<>();
		try {
			logger.info("Main Controller");
			boardVO boardVo = new boardVO();
			boardVo.setCategory("테스트");
			boardVo.setNickname("닉네임");
			boardService.save(boardVo);
			ret.put("board", boardVo);
			return new ResponseEntity<>(ret, HttpStatus.OK);
		} catch (Exception e) {
			ret.put("error",e);
			return new ResponseEntity<>(ret, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping(value="/board/list")
	public ResponseEntity<HashMap<String, Object>> boardList(){
		HashMap<String,Object> ret = new HashMap<>();
		try {
			logger.info("Main Controller");
			ArrayList<boardVO> boardVo = new ArrayList<>();
			boardVo.addAll(boardService.selectAll());
			ret.put("list", boardVo);
			return new ResponseEntity<>(ret, HttpStatus.OK);
		}
		catch(Exception e){
			ret.put("error",e);
			return new ResponseEntity<>(ret, HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
	}		
	
	@GetMapping(value="/store/save")
	public ResponseEntity<HashMap<String, Object>> storeSave(){
		HashMap<String,Object> ret = new HashMap<>();
		try {
			logger.info("Main Controller");
			storeVO storeVo = new storeVO();
			storeVo.setAddress("부산시 남구 문현동 부산은행 본점");
			storeVo.setName("테스트");
			ret.put("store", storeVo);
			
			return new ResponseEntity<>(ret, HttpStatus.OK);
		} catch (Exception e) {
			ret.put("error",e);
			return new ResponseEntity<>(ret, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
