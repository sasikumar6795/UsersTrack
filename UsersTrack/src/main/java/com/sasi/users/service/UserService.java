package com.sasi.users.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sasi.users.model.User;
import com.sasi.users.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public UserService() {
		// TODO Auto-generated constructor stub
	}
	
	public UserService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	public Iterable<User> list() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	
	public User save(User user) {
        return userRepository.save(user);
    }

    public void save(List<User> users) {
        userRepository.saveAll(users);
    }

}
