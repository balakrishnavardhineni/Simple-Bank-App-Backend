
package com.app.newbank.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.newbank.dto.Customer;
import com.app.newbank.dto.CustomerAccount;
import com.app.newbank.service.CustomerAccountService;
import com.app.newbank.service.CustomerServiceImpl;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/customerAccounts")
public class CustomerAccountController {
    @Autowired
    CustomerAccountService customerService;

    @GetMapping("")
    public List<CustomerAccount> list() {
        return customerService.listAllUser();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerAccount> get(@PathVariable Integer id) {
        try {
        	CustomerAccount user = customerService.getUser(id);
            return new ResponseEntity<CustomerAccount>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<CustomerAccount>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/add")
    public void add(@RequestBody CustomerAccount user) {
    	customerService.saveUser(user);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody CustomerAccount user, @PathVariable Integer id) {
        try {
        	CustomerAccount existUser = customerService.getUser(id);
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
