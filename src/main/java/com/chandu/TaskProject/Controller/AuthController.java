package com.chandu.TaskProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chandu.TaskProject.Payload .UserDto;
import com.chandu.TaskProject.Service.UserService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	
	@Autowired 
	private UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userdto) {
		return new ResponseEntity<>(userService.createUser(userdto),HttpStatus.CREATED);	
	}

}
