package com.app.newbank.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.newbank.dto.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Integer>{
}
