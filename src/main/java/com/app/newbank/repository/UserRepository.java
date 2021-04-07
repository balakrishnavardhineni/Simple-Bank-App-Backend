package com.app.newbank.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.newbank.dto.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	User findByUserIdIgnoreCase(String userId);
}
