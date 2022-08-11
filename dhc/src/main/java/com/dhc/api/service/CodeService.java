package com.dhc.api.service;

import java.util.*;

import com.dhc.api.vo.boardVO;
import com.dhc.api.vo.codeVO;
import com.dhc.api.vo.storeVO;

public interface CodeService {
	public List<codeVO> selectAll();
	public void save(codeVO code);
}
