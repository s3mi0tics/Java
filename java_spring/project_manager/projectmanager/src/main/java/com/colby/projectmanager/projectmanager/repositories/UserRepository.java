package com.colby.projectmanager.projectmanager.repositories;

import java.util.List;
import java.util.Optional;

import com.colby.projectmanager.projectmanager.models.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Long> {
    List<User> findAll();
    Optional<User> findByEmail(String email);
}

