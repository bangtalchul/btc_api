package com.dhc.api.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dhc.api.vo.boardVO;

@Repository
public interface boardDAO extends JpaRepository<boardVO, Integer>{

	List<boardVO> findAllByUserId(Integer userId);
}
