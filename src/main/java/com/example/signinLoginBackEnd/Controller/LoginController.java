package com.example.signinLoginBackEnd.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.signinLoginBackEnd.Entity.LoginResponse;
import com.example.signinLoginBackEnd.Service.LoginUserService;

@RestController
public class LoginController {

    @Autowired
    LoginUserService service;


    @GetMapping("/login")
    public LoginResponse login(@RequestBody String email, String password) {
    LoginResponse response = service.loginService(email, password);
    return response;
    }

}
