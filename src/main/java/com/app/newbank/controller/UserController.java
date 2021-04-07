package com.app.newbank.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.newbank.dto.User;
import com.app.newbank.service.UserService;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin
@RequestMapping("/")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> list() {
        return userService.listAllUser();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> get(@PathVariable Integer id) {
        try {
            User user = userService.getUser(id);
            return new ResponseEntity<User>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }
    
    @RequestMapping("/login")
    @ResponseBody
    public boolean get(@RequestBody Map<String, String> requestPayload) {
        try {
        	return userService.getUserByUserID( requestPayload);
        } catch (NoSuchElementException e) {
        	return false;
        }
    }
    @PostMapping("/users/add")
    public void add(@RequestBody User user) {
        userService.saveUser(user);
    }
    @PutMapping("/users/update/{id}")
    public ResponseEntity<?> update(@RequestBody User user, @PathVariable Integer id) {
        try {
            User existUser = userService.getUser(id);
            user.setId(id);            
            userService.saveUser(user);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/users/delete/{id}")
    public void delete(@PathVariable Integer id) {

        userService.deleteUser(id);
    }
}
