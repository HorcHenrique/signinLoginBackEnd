package com.example.signinLoginBackEnd.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.signinLoginBackEnd.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {


public User findByEmail(String email);


}
