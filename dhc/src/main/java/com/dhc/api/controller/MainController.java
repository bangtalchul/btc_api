package com.dhc.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dhc.api.dao.themeDAO;
import com.dhc.api.service.BoardService;
import com.dhc.api.service.StoreService;
import com.dhc.api.service.ThemeService;
import com.dhc.api.vo.boardVO;
import com.dhc.api.vo.storeVO;
import com.dhc.api.vo.themeVO;

import java.util.*;
import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class MainController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private final BoardService boardService ;
	private final StoreService storeService ;
	private final ThemeService themeService ;
	
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
	@GetMapping(value="/board")
	public ResponseEntity<HashMap<String, Object>> boardDetail(@RequestParam Integer boardId){
		HashMap<String,Object> ret = new HashMap<>();
		try {
			logger.info("board Controller");
			boardVO boardVo = boardService.boardDetail(boardId);
			ret.put("board", boardVo);
			return new ResponseEntity<>(ret, HttpStatus.OK);
		} catch (Exception e) {
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
	@GetMapping(value="/store/best")
	public ResponseEntity<HashMap<String, Object>> storeBest(){
		HashMap<String,Object> ret = new HashMap<>();
		try {
			logger.info("store Controller");
			ArrayList<storeVO> storeVo = new ArrayList<>();
			storeVo.addAll(storeService.bestList());
			ret.put("list", storeVo);
			return new ResponseEntity<>(ret, HttpStatus.OK);
		}
		catch(Exception e){
			ret.put("error",e);
			return new ResponseEntity<>(ret, HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
	}
	
	@GetMapping(value="/store/locate")
	public ResponseEntity<HashMap<String, Object>> storeLocate(@RequestParam String addr){
		HashMap<String,Object> ret = new HashMap<>();
		try {
			logger.info("store Controller");
			ArrayList<storeVO> storeVo = new ArrayList<>();
			storeVo.addAll(storeService.localList(addr));
			ret.put("list", storeVo);
			return new ResponseEntity<>(ret, HttpStatus.OK);
		}
		catch(Exception e){
			ret.put("error",e);
			return new ResponseEntity<>(ret, HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
	}
	@PostMapping(value="/theme/save")
	public ResponseEntity<HashMap<String, Object>> themeSave(@RequestBody themeVO theme){
		HashMap<String,Object> ret = new HashMap<>();
		try {
			logger.info("theme Controller");
			logger.info(theme.toString());
			
			themeVO themeVo = new themeVO();
			themeVo.setCodeId(theme.getCodeId());
			themeVo.setDesc("etst");
			themeVo.setStatus("01");
			themeVo.setPhotoUrl("01");
			
			System.out.println(themeVo);
			themeService.save(themeVo);
			ret.put("theme",themeVo);
			return new ResponseEntity<>(ret, HttpStatus.OK);
		}
		catch(Exception e){
			ret.put("error",e);
			return new ResponseEntity<>(ret, HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
	}	
	@GetMapping(value="/theme/best")
	public ResponseEntity<HashMap<String, Object>> themeBest(){
		HashMap<String,Object> ret = new HashMap<>();
		try {
			logger.info("theme Controller");
			ArrayList<themeVO> themeVo = new ArrayList<>();
			themeVo.addAll(themeService.selectBest());
			ret.put("list", themeVo);
			return new ResponseEntity<>(ret, HttpStatus.OK);
		}
		catch(Exception e){
			ret.put("error",e);
			return new ResponseEntity<>(ret, HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
	}	
}
