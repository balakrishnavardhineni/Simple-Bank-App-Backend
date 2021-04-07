package com.app.newbank.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.newbank.dto.Customer;
import com.app.newbank.dto.User;
import com.app.newbank.service.CustomerServiceImpl;
import com.app.newbank.service.UserService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerServiceImpl customerService;

    @GetMapping("")
    public List<Customer> list() {
        return customerService.listAllUser();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> get(@PathVariable Integer id) {
        try {
        	Customer user = customerService.getUser(id);
            return new ResponseEntity<Customer>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/")
    public void add(@RequestBody Customer user) {
    	customerService.saveUser(user);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Customer user, @PathVariable Integer id) {
        try {
        	Customer existUser = customerService.getUser(id);
            user.setId(id);            
            customerService.saveUser(user);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

    	customerService.deleteUser(id);
    }
}
