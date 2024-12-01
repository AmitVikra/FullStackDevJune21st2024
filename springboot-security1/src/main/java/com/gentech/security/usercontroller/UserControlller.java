package com.gentech.security.usercontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserControlller {
	
	@GetMapping("/home")
	public String handleHomePage()
	{
		return "Home Page has displayed Successfully";
	}

	@GetMapping("/user/home")
	public String handleUserHomePage()
	{
		return "The User Home Page has displayed Successfully";
	}
	
	@GetMapping("/admin/home")
	public String handleAdminHomePage()
	{
		return "The Admin Home Page has displayed Successfully";
	}
}
