package com.gentech.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gentech.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
