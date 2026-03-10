package com.example.signinLoginBackEnd.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.signinLoginBackEnd.Service.CreateUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class LoginController {

    @Autowired
    CreateUserService createUserService;

    @PostMapping("path/create")
    public void postMethodName(@RequestBody String name, String lastName, String email, String password) {
        createUserService.createUser(name, lastName, email, password);
    }

}
