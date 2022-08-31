package com.dhc.api.impl;

import java.util.*;

import org.springframework.stereotype.Service;

import com.dhc.api.dao.collectionDAO;
import com.dhc.api.dao.storeDAO;
import com.dhc.api.service.CollectionService;
import com.dhc.api.service.StoreService;
import com.dhc.api.vo.collectionVO;
import com.dhc.api.vo.storeVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CollectionServiceImpl implements CollectionService {
	private final collectionDAO collectionDao;
	@Override
	public List<collectionVO> selectAll(){
		return collectionDao.findAll();
	}
	@Override
	public void save(collectionVO collection) {
		collectionDao.save(collection);
	}
}
