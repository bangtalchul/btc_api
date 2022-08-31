package com.dhc.api.service;

import java.util.*;

import com.dhc.api.vo.boardVO;
import com.dhc.api.vo.reserveVO;
import com.dhc.api.vo.storeVO;

public interface ReserveService {
	public List<reserveVO> selectAll();
	public void save(reserveVO reserve);
}
