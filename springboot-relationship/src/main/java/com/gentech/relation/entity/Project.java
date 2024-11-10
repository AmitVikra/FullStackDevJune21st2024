package com.gentech.relation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_projects")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "project_id")
	private Long projectId;
	@Column(name = "project_domain")
	private String projectDomain;
	@Column(name = "project_description")
	private String projectDescription;
	
	@Column(name = "project_customer_id")
	private Long projectCustomerId;

	public Project() {
		
	}
	public Project(String projectDomain, String projectDescription, Long projectCustomerId) {
		super();
		this.projectDomain = projectDomain;
		this.projectDescription = projectDescription;
		this.projectCustomerId = projectCustomerId;
	}
	public Long getProjectId() {
		return projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	public String getProjectDomain() {
		return projectDomain;
	}
	public void setProjectDomain(String projectDomain) {
		this.projectDomain = projectDomain;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public Long getProjectCustomerId() {
		return projectCustomerId;
	}
	public void setProjectCustomerId(Long projectCustomerId) {
		this.projectCustomerId = projectCustomerId;
	}
}
