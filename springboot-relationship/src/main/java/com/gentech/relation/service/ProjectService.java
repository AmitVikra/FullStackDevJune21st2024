package com.gentech.relation.service;

import java.util.List;

import com.gentech.relation.entity.Project;

public interface ProjectService {
	
	Project createProject(Project project);

	List<Project> getAllProject();
}
