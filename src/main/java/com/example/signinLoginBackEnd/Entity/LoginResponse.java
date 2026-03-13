package com.example.signinLoginBackEnd.Entity;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;

@Entity
public class LoginResponse {
    
public enum ResponseCode {
		SUCESSO,
		USUARIO_NAO_ENCONTRADO,
		SENHA_INCORRETA
	}

    @Autowired
    User user;
    ResponseCode code;
    
public LoginResponse(User user, ResponseCode code) {
    this.user = user;
    this.code = code;
}



}
