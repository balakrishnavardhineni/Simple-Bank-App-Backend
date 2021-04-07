package com.app.newbank.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.newbank.dto.User;
import com.app.newbank.repository.UserRepository;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    public List<User> listAllUser() {
        return userRepository.findAll();
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public User getUser(Integer id) {
        return userRepository.findById(id).get();
    }
    
    public boolean getUserByUserID(Map<String, String> requestPayload) {
    	
    	User usr= userRepository.findByUserIdIgnoreCase(requestPayload.get("userId"));
    	if(usr != null && usr.getId() > 0) {
    		if(usr.getPassword().equals(requestPayload.get("password"))) {
    			return true ;
    					}
    		else return false;
    	}
		return false;
    }
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
