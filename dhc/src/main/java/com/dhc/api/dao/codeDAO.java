package com.dhc.api.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dhc.api.vo.boardVO;
import com.dhc.api.vo.codeVO;
import com.dhc.api.vo.storeVO;

@Repository
public interface codeDAO extends JpaRepository<codeVO, Integer>{
}
