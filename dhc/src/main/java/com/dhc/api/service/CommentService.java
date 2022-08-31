package com.dhc.api.service;

import java.util.*;

import com.dhc.api.vo.boardVO;
import com.dhc.api.vo.commentVO;
import com.dhc.api.vo.storeVO;

public interface CommentService {
	public List<commentVO> selectAll();
	public void save(commentVO comment);
}
