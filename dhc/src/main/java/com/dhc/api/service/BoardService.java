package com.dhc.api.service;

import java.util.*;

import com.dhc.api.vo.boardVO;

public interface BoardService {
	public List<boardVO> selectAll();

	public void save(boardVO board);
}
