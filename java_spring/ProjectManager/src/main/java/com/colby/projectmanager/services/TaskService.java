package com.colby.projectmanager.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.colby.projectmanager.models.Task;
import com.colby.projectmanager.repositories.TaskRepository;

public class TaskService {
    
	@Autowired
	private TaskRepository taskRepository;
	
	//__________Create__________________
    public Task createTask(Task t) {
        return taskRepository.save(t);
    }
}
