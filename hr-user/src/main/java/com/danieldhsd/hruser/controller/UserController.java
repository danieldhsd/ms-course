package com.danieldhsd.hruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.danieldhsd.hruser.model.User;
import com.danieldhsd.hruser.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id) {
		return userService.findById(id);
	}	

	@GetMapping(value = "/search")
	public User findByEmail(@RequestParam String email) {
		return userService.findByEmail(email);
	}
}
