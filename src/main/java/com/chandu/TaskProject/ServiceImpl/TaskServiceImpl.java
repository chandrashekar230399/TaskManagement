package com.chandu.TaskProject.ServiceImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandu.TaskProject.Entity.Task;
import com.chandu.TaskProject.Entity.Users;
import com.chandu.TaskProject.Exceptions.UserNotFound;
import com.chandu.TaskProject.Payload.TaskDto;
import com.chandu.TaskProject.Repository.TaskRepository;
import com.chandu.TaskProject.Repository.UserRepository;
import com.chandu.TaskProject.Service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private TaskRepository taskRepo;

	@Override
	public TaskDto saveTask(long userid, TaskDto taskdto) {
		 Users user =userRepo.findById(userid).orElseThrow(
				 ()-> new UserNotFound(String.format("User ID is not Found",userid)));
		
		 Task task = modelMapper.map(taskdto, Task.class);
		task.setUsers(user);
		Task savedTask = taskRepo.save(task);
		return modelMapper.map(savedTask,TaskDto.class);
	}

	@Override        
	public List<TaskDto> getAllTasks(long userid) {
		
		return null;
	}

}
