package com.danieldhsd.hruser.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danieldhsd.hruser.model.User;
import com.danieldhsd.hruser.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User findById(Long id) {
		return userRepository.findById(id).orElseThrow();
	}
	
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
}
