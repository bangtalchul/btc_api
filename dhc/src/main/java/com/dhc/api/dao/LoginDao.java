package com.dhc.api.dao;

import com.dhc.api.model.User;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository

public interface LoginDao extends JpaRepository<User, String> {
     Optional<User> findById(String id);

     Optional<User> findByIdAndPwd(String id, String pwd);

    Optional<User> findByIdAndEmail(String id, String email);

    Optional<User> findByIdAndCertifycode(String id, String code);
}
