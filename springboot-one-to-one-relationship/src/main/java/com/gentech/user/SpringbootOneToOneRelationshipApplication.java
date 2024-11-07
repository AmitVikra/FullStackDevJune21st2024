package com.gentech.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gentech.user.entity.User;
import com.gentech.user.entity.UserProfile;
import com.gentech.user.repository.UserProfileRepository;
import com.gentech.user.repository.UserRepository;

@SpringBootApplication
public class SpringbootOneToOneRelationshipApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootOneToOneRelationshipApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private UserProfileRepository userProfileRepo;

	@Override
	public void run(String... args) throws Exception {
		//Create User
		User oUser=new User();
		oUser.setUserName("Richard");
		oUser.setJobName("Sales Manager");
		
		//Create UserProfile
		UserProfile oUserProfile=new UserProfile();
		oUserProfile.setEmailId("richard@gss.com");
		oUserProfile.setPhoneNumber(9012314580L);
		oUserProfile.setAddress("Lake Street Road California" );
		
		oUser.setUserProfile(oUserProfile);
		oUserProfile.setUser(oUser);
		
		userRepo.save(oUser);
	}

	
	
	
	
	
}
