package com.codeprism.service;

import com.codeprism.entity.UserDAO;
import com.codeprism.model.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface RegistrationService extends  UserDetailsService {
    public UserDAO save(UserDTO userDTO);
}
