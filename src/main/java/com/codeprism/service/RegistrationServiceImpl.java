package com.codeprism.service;

import com.codeprism.entity.UserDAO;
import com.codeprism.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDAO save(UserDTO userDTO) {
       UserDAO userDAO = new UserDAO();
        userDAO.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        userDAO.setUsername(userDTO.getUsername());
        return userRepo.save(userDAO);
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

           return null;
    }
}
