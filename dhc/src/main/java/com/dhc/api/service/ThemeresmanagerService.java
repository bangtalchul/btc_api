package com.dhc.api.service;

import java.util.*;

import com.dhc.api.vo.boardVO;
import com.dhc.api.vo.storeVO;
import com.dhc.api.vo.themeresmanagerVO;

public interface ThemeresmanagerService {
	public List<themeresmanagerVO> selectAll();
	public void save(themeresmanagerVO themeresmanager);
}
