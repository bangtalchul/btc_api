package com.dhc.api.service;

import java.util.*;

import com.dhc.api.vo.boardVO;
import com.dhc.api.vo.storeVO;
import com.dhc.api.vo.themeVO;

public interface ThemeService {
	public List<themeVO> selectAll();
	public void save(themeVO theme);
}
