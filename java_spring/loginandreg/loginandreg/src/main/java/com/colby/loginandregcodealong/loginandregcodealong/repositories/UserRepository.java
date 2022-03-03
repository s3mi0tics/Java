package com.colby.loginandregcodealong.loginandregcodealong.repositories;

import java.util.Optional;

import com.colby.loginandregcodealong.loginandregcodealong.models.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Long> {
    Optional<User> findByEmail(String email);
}
