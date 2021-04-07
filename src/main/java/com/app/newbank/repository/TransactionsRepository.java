package com.app.newbank.repository;
import javax.transaction.Transaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.newbank.dto.Transactions;
import com.app.newbank.dto.User;
@Repository
public interface TransactionsRepository extends JpaRepository<Transactions, Integer>{
}
