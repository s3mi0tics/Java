package com.colby.projectmanager.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.colby.projectmanager.models.Project;
import com.colby.projectmanager.models.User;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
	List<Project> findAll();
	List<Project> findByUsersNotContaining(User user);
	Optional<Project> findByTitle(String title);
	Optional<Project> findById(Long Id);
}