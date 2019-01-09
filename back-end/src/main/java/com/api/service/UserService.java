package com.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.api.domain.User;

@Service
public class UserService {

	List<User> users = new ArrayList<>();

	public List<User> getAll() {
		User user = new User();
		user.setEmail("abc@gmail.com");
		user.setfName("Harry");
		user.setlName("Porter");
		user.setId(1);
		user.setUsername("hportal");

		User user1 = new User();
		user1.setEmail("xyz@gmail.com");
		user1.setfName("Porter");
		user1.setlName("Harry");
		user1.setId(2);
		user1.setUsername("pharry");
		users.add(user);
		users.add(user1);
		return users;
	}

}
