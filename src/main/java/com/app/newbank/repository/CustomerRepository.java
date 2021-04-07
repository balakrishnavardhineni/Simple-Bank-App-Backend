package com.app.newbank.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.newbank.dto.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
}
