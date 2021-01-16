package com.sasi.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sasi.users.model.User;
import com.sasi.users.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	public UserController(UserService userService) 
	{
		this.userService=userService;
	}
	
	public UserController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/list")
	public Iterable<User> list()
	{
		return userService.list();
	}
}
