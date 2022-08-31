package com.dhc.api.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dhc.api.vo.storeVO;

@Repository
public interface storeDAO extends JpaRepository<storeVO, Integer>{

//	List<storeVO> findAllOrderByReviewCnt();

	List<storeVO> findAllByAddressContainingOrderByReviewCnt(String addr);


	List<storeVO> findAllByAddressContainingOrderByReviewCntDesc(String addr);

	List<storeVO> findTop5AllByOrderByReviewCntDesc();


}
