package com.kodestack.helloworld.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodestack.helloworld.Models.User;
import com.kodestack.helloworld.repo.UserRepository;


@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserRepository userRepoUser;
        
    @GetMapping
    public List<User> getAllUsers() {

        return userRepoUser.findAll();
      
    }
}
