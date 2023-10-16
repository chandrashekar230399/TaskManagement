package com.chandu.TaskProject.Service;

import java.util.List;

import com.chandu.TaskProject.Payload.TaskDto;

public interface TaskService {
	
	public TaskDto saveTask(long userid,TaskDto taskdto);
	
	public List<TaskDto> getAllTasks(long userid);

}
