package com.example.signinLoginBackEnd.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.signinLoginBackEnd.Entity.LoginResponse;
import com.example.signinLoginBackEnd.Entity.User;
import com.example.signinLoginBackEnd.Repo.UserRepository;

@Service
public class LoginUserService {


@Autowired
UserRepository repo;


public LoginResponse loginService(String email, String password) {

    User userFound = repo.findByEmail(email);
    if(userFound == null) {
        return null;
    }
    String expectedKey = userFound.getPassword();
    if(password.equals(expectedKey)) {
        return userFound;
    }
return null;
}



}
