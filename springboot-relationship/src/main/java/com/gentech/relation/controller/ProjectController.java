package com.gentech.relation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gentech.relation.entity.Project;
import com.gentech.relation.service.ProjectService;

@RestController
@RequestMapping(name = "/api/v1")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@PostMapping("/project")
	public ResponseEntity<Project> createProject(@RequestBody Project project)
	{
		return new ResponseEntity<Project>(projectService.createProject(project), HttpStatus.CREATED);
	}

	@GetMapping("/projects")
	public ResponseEntity<List<Project>> getAllProjects()
	{
		return new ResponseEntity<List<Project>>(projectService.getAllProject(), HttpStatus.OK);
	}
}
