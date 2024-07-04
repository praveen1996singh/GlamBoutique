package com.pk.glamboutique.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pk.glamboutique.userservice.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
