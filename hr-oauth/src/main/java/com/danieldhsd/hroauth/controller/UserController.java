package com.danieldhsd.hroauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.danieldhsd.hroauth.model.User;
import com.danieldhsd.hroauth.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping(value = "/search")
	public User findByEmail(@RequestParam String email) {
		return service.findByEmail(email);
	}
}
