package com.cuixx.provider.controller;

import com.cuixx.provider.dao.UserRepository;
import com.cuixx.provider.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepositroy;

    @GetMapping("/{id}")
    public User findByid(@PathVariable Long id) {
        User user = this.userRepositroy.findOne(id);
        return user;
    }
}
