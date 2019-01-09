package com.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.domain.User;
import com.api.service.UserService;

@RestController
@RequestMapping("/api")
public class UserPortalController {

	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public List<User> getAll() {
		return userService.getAll();
	}
}
