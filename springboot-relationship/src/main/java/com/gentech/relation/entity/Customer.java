package com.gentech.relation.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_customers")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private Long customerId;
	@Column(name = "customer_name")
	private String customerName;
	@Column(name = "customer_description")
	private String customerDescription;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "project_customer_id", referencedColumnName = "customer_id")
	List<Project> projects=new ArrayList<>();

	public Customer() {
		
	}
	public Customer(String customerName, String customerDescription) {
		super();
		this.customerName = customerName;
		this.customerDescription = customerDescription;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerDescription() {
		return customerDescription;
	}
	public void setCustomerDescription(String customerDescription) {
		this.customerDescription = customerDescription;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

}
