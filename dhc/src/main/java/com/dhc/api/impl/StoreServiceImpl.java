package com.dhc.api.impl;

import java.util.*;

import org.springframework.stereotype.Service;

import com.dhc.api.dao.storeDAO;
import com.dhc.api.service.StoreService;
import com.dhc.api.vo.storeVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StoreServiceImpl implements StoreService {
	private final storeDAO storeDAO;
	@Override
	public List<storeVO> selectAll(){
		return storeDAO.findAll();
	}
	@Override
	public void save(storeVO store) {
		storeDAO.save(store);
	}
	@Override
	public List<storeVO> bestList() {
		List<storeVO> list = storeDAO.findTop5AllByOrderByReviewCntDesc();
		return list;
	}
	@Override
	public List<storeVO> localList(String addr) {
		// TODO Auto-generated method stub
		List<storeVO> list = storeDAO.findAllByAddressContainingOrderByReviewCntDesc(addr);
		return list;
	}
}
