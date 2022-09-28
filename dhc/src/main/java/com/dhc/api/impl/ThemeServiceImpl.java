package com.dhc.api.impl;

import java.util.*;

import org.springframework.stereotype.Service;

import com.dhc.api.dao.collectionDAO;
import com.dhc.api.dao.storeDAO;
import com.dhc.api.dao.themeDAO;
import com.dhc.api.service.CollectionService;
import com.dhc.api.service.StoreService;
import com.dhc.api.service.ThemeService;
import com.dhc.api.vo.collectionVO;
import com.dhc.api.vo.storeVO;
import com.dhc.api.vo.themeVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ThemeServiceImpl implements ThemeService {
	private final themeDAO themeDao;
	@Override
	public List<themeVO> selectBest() {
		return themeDao.findTop5AllByOrderByReviewCnt();
	}
	@Override
	public void save(themeVO theme) {
		// TODO Auto-generated method stub
		themeDao.save(theme);
	}
	@Override
	public List<themeVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
