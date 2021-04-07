
package com.app.newbank.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.newbank.dto.Customer;
import com.app.newbank.dto.Transactions;
import com.app.newbank.dto.User;
import com.app.newbank.repository.CustomerRepository;
import com.app.newbank.repository.TransactionsRepository;
import com.app.newbank.repository.UserRepository;

import java.util.List;
import javax.transaction.Transactional;

@Service
@Transactional
public class TransactionsService {
    @Autowired
    private TransactionsRepository transactionsRepository;
    
    public List<Transactions> listAllUser() {
        return transactionsRepository.findAll();
    }

    public void saveUser(Transactions user) {
    	transactionsRepository.save(user);
    }

    public Transactions getUser(Integer id) {
        return transactionsRepository.findById(id).get();
    }

    public void deleteUser(Integer id) {
    	transactionsRepository.deleteById(id);
    }
}
