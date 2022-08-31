package com.dhc.api.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dhc.api.vo.boardVO;
import com.dhc.api.vo.storeVO;
import com.dhc.api.vo.themeVO;

@Repository
public interface themeDAO extends JpaRepository<themeVO, Integer>{


	List<themeVO> findTop5AllByOrderByReviewCnt();
}
