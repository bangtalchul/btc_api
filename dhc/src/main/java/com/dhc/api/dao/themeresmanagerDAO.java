package com.dhc.api.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dhc.api.vo.boardVO;
import com.dhc.api.vo.storeVO;
import com.dhc.api.vo.themeresmanagerVO;

@Repository
public interface themeresmanagerDAO extends JpaRepository<themeresmanagerVO, Integer>{
}
