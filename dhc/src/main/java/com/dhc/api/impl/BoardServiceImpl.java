package com.dhc.api.impl;

import java.util.*;

import org.springframework.stereotype.Service;

import com.dhc.api.dao.boardDAO;
import com.dhc.api.service.BoardService;
import com.dhc.api.vo.boardVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
	private final boardDAO boardDAO;
	@Override
	public List<boardVO> selectAll(){
		return boardDAO.findAll();
	}
	@Override
	public void save(boardVO board) {
		boardDAO.save(board);
	}
	@Override
	public boardVO boardDetail(Integer boardId) {
		// TODO Auto-generated method stub
		return boardDAO.findById(boardId).get();
	}
	@Override
	public List<boardVO> myBoard(Integer userId) {
		
		return boardDAO.findAllByUserId(userId);
	}
}
