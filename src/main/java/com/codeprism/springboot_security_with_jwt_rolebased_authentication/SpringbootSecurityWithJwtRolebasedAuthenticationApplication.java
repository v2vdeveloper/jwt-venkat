package com.codeprism.springboot_security_with_jwt_rolebased_authentication;

import com.codeprism.entity.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootSecurityWithJwtRolebasedAuthenticationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSecurityWithJwtRolebasedAuthenticationApplication.class, args);
        System.out.println(userDAO.toString());
    }
    @Autowired
   static private UserDAO userDAO;



}
