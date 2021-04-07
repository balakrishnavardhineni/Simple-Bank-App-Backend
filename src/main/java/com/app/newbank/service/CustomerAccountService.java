package com.app.newbank.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.newbank.dto.Customer;
import com.app.newbank.dto.CustomerAccount;
import com.app.newbank.repository.CustomerAccountRepository;
import com.app.newbank.repository.CustomerRepository;

import java.util.List;
import javax.transaction.Transactional;

@Service
@Transactional
public class CustomerAccountService {
    @Autowired
    private CustomerAccountRepository customerRepository;
    
    public List<CustomerAccount> listAllUser() {
        return customerRepository.findAll();
    }

    public void saveUser(CustomerAccount user) {
    	customerRepository.save(user);
    }

    public CustomerAccount getUser(Integer id) {
        return customerRepository.findById(id).get();
    }

    public void deleteUser(Integer id) {
    	customerRepository.deleteById(id);
    }
}
