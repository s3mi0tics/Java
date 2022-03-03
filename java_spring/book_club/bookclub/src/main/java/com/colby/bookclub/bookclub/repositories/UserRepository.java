package com.colby.bookclub.bookclub.repositories;
import java.util.List;
import java.util.Optional;

import com.colby.bookclub.bookclub.models.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Long> {
    List<User> findAll();
    Optional<User> findByEmail(String email);
}
