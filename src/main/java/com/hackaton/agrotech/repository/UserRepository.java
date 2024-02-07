package com.hackaton.agrotech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackaton.agrotech.model.User;

public interface UserRepository extends JpaRepository<User, Long> {}
