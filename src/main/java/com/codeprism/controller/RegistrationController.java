package com.codeprism.controller;

import com.codeprism.entity.UserDAO;
import com.codeprism.model.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
        @PostMapping("/registration")
        public void registration(@RequestBody UserDTO userDTO){

        }

}

