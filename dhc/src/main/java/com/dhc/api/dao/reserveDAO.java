package com.dhc.api.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dhc.api.vo.reserveVO;

@Repository
public interface reserveDAO extends JpaRepository<reserveVO, Integer>{
}
