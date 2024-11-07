package com.gentech.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gentech.user.entity.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long>{

}
