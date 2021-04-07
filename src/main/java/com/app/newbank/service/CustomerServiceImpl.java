
package com.app.newbank.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.newbank.dto.Customer;
import com.app.newbank.dto.User;
import com.app.newbank.repository.CustomerRepository;
import com.app.newbank.repository.UserRepository;

import java.util.List;
import javax.transaction.Transactional;

@Service
@Transactional
public class CustomerServiceImpl {
    @Autowired
    private CustomerRepository customerRepository;
    
    public List<Customer> listAllUser() {
        return customerRepository.findAll();
    }

    public void saveUser(Customer user) {
    	customerRepository.save(user);
    }

    public Customer getUser(Integer id) {
        return customerRepository.findById(id).get();
    }

    public void deleteUser(Integer id) {
    	customerRepository.deleteById(id);
    }
}
