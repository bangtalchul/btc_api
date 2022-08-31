package com.dhc.api.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dhc.api.vo.partyVO;

@Repository
public interface partyDAO extends JpaRepository<partyVO, Integer>{
}
