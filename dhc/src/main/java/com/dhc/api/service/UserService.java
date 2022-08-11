package com.dhc.api.service;

import java.util.*;

import com.dhc.api.vo.boardVO;
import com.dhc.api.vo.storeVO;
import com.dhc.api.vo.userVO;

public interface UserService {
	public List<userVO> selectAll();
	public void save(userVO board);
}
