package com.example.signinLoginBackEnd.Service;

import org.springframework.stereotype.Service;

import com.example.signinLoginBackEnd.Entity.User;
import com.example.signinLoginBackEnd.Repo.UserRepository;

@Service
public class CreateUserService {

    private final UserRepository userRepository;

    public CreateUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(String nome, String lastName, String password) {
        User user = new User(nome, lastName, password);
        userRepository.save(user);
    }

}
