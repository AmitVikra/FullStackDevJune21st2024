package com.gentech.relation.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gentech.relation.entity.Project;
import com.gentech.relation.repository.ProjectRepository;
import com.gentech.relation.service.ProjectService;
@Service
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	private ProjectRepository projectRepo;
	
	@Override
	public Project createProject(Project project) {
		return projectRepo.save(project);
	}

	@Override
	public List<Project> getAllProject() {
		return projectRepo.findAll();
	}

}
