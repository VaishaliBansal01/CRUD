package com.spring.demo.SpringCRUD.controller;

import com.spring.demo.SpringCRUD.entity.User;
import com.spring.demo.SpringCRUD.repo.UserRepo;
import com.spring.demo.SpringCRUD.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    UserRepo userRepo;
    @PostMapping("/user")
    public User createUser(@RequestBody User user)
    {
        return userService.createUser(user);
    }
    @GetMapping("/{id}")
    public Optional<User> getById (@PathVariable Long id)
    {
        return userService.getById(id);
    }
     @PutMapping("/update/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user)
    {
       return userService.updateUser(user,id);
    }
     @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id)
    {
        userService.deleteUser(id);
    }

}
