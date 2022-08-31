package com.dhc.api.service;

import java.util.*;

import com.dhc.api.vo.boardVO;
import com.dhc.api.vo.storeVO;

public interface StoreService {
	public List<storeVO> selectAll();

	public void save(storeVO board);
	
	public List<storeVO> bestList();
	

	public List<storeVO> localList(String addr);
}
