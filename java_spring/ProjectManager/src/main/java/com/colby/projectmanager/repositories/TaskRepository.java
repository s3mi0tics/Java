package com.colby.projectmanager.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.colby.projectmanager.models.Project;
import com.colby.projectmanager.models.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {

	List<Task> findAll();
	List<Task> findAllByProject(Project project);
}
