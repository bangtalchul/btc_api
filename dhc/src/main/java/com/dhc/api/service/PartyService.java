package com.dhc.api.service;

import java.util.*;

import com.dhc.api.vo.boardVO;
import com.dhc.api.vo.partyVO;
import com.dhc.api.vo.storeVO;

public interface PartyService {
	public List<partyVO> selectAll();
	public void save(partyVO party);
}
