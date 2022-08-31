package com.dhc.api.service;

import java.util.*;

import com.dhc.api.vo.boardVO;
import com.dhc.api.vo.storeVO;

public interface BoardService {
	public List<boardVO> selectAll();
	public void save(boardVO board);
}