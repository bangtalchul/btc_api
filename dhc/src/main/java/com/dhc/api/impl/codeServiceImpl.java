package com.dhc.api.impl;

import java.util.*;

import org.springframework.stereotype.Service;

import com.dhc.api.dao.boardDAO;
import com.dhc.api.dao.codeDAO;
import com.dhc.api.service.BoardService;
import com.dhc.api.service.CodeService;
import com.dhc.api.vo.boardVO;
import com.dhc.api.vo.codeVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class codeServiceImpl implements CodeService {
	private final codeDAO codeDao;
	@Override
	public List<codeVO> selectAll(){
		return codeDao.findAll();
	}
	@Override
	public void save(codeVO code) {
		codeDao.save(code);
	}
}
