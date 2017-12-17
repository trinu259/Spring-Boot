package com.javapoint.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("/hello")
	public User1 hello() {
		User1 user = new User1();
		user.setName("Trinesh");
		user.setPassword("password1");
		return user;
	}

}
