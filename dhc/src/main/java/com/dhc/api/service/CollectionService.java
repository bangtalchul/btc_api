package com.dhc.api.service;

import java.util.*;

import com.dhc.api.vo.boardVO;
import com.dhc.api.vo.collectionVO;
import com.dhc.api.vo.storeVO;

public interface CollectionService {
	public List<collectionVO> selectAll();
	public void save(collectionVO collection);
}
