package com.chandu.TaskProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chandu.TaskProject.Payload.TaskDto;
import com.chandu.TaskProject.Service.TaskService;

@RestController
@RequestMapping("/api")
public class TaskController {
	
	@Autowired
	private TaskService taskservice;
	
	@PostMapping("/{usersid}/tasks")
	public ResponseEntity<TaskDto> saveTask(
			@PathVariable(name="usersid")long userid,
			@RequestBody TaskDto taskdto) {
		return new ResponseEntity<>(taskservice.saveTask(userid, taskdto),HttpStatus.CREATED);
		 
		 
	}
		
	

}
