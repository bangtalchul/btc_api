package com.dhc.api.service;

import java.util.*;

import com.dhc.api.vo.boardVO;
import com.dhc.api.vo.reviewVO;
import com.dhc.api.vo.storeVO;

public interface ReviewService {
	public List<reviewVO> selectAll();
	public void save(reviewVO review);
}
