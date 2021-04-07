

package com.app.newbank.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.newbank.dto.CustomerAccount;
import com.app.newbank.dto.Transactions;
import com.app.newbank.service.CustomerAccountService;
import com.app.newbank.service.TransactionsService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/")
public class TransactionsController {
    @Autowired
    TransactionsService transactionsService;

    @GetMapping("/transactions")
    public List<Transactions> list() {
        return transactionsService.listAllUser();
    }

    @GetMapping("/transactions/{id}")
    public ResponseEntity<Transactions> get(@PathVariable Integer id) {
        try {
        	Transactions user = transactionsService.getUser(id);
            return new ResponseEntity<Transactions>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Transactions>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/transactions/add")
    public void add(@RequestBody Transactions user) {
    	transactionsService.saveUser(user);
    }
    @PutMapping("/transactions/{id}")
    public ResponseEntity<?> update(@RequestBody Transactions user, @PathVariable Integer id) {
        try {
        	Transactions existUser = transactionsService.getUser(id);
            user.setId(id);            
            transactionsService.saveUser(user);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/transactions/{id}")
    public void delete(@PathVariable Integer id) {

    	transactionsService.deleteUser(id);
    }
}
