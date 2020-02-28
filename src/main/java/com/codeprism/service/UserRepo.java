package com.codeprism.service;

import com.codeprism.entity.UserDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserDAO,Long> {

}

