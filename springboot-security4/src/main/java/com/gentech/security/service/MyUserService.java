package com.gentech.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.gentech.security.entity.MyUser;
import com.gentech.security.repository.MyUserRepository;

@Service
public class MyUserService {
	
	@Autowired
	private MyUserRepository repository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	public MyUser registerUser(MyUser user)
	{
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return repository.save(user);
	}

}
