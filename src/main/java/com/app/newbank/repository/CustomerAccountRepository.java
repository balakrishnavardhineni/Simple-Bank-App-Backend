package com.app.newbank.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.newbank.dto.CustomerAccount;
@Repository
public interface CustomerAccountRepository extends JpaRepository<CustomerAccount, Integer>{
}
