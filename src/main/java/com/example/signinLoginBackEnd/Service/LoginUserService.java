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
        if (userFound == null) {
            LoginResponse response = new LoginResponse(null, LoginResponse.ResponseCode.USUARIO_NAO_ENCONTRADO);
            return response;
        }
        String expectedKey = userFound.getPassword();
        if (password.equals(expectedKey)) {
            LoginResponse response = new LoginResponse(userFound, LoginResponse.ResponseCode.SUCESSO);
            return response;
        }
        LoginResponse response = new LoginResponse(null, LoginResponse.ResponseCode.SENHA_INCORRETA);
        return response;
    }

}
