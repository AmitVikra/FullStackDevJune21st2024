package com.gentech.dept.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	private Long id;
	
	@Column(name = "deptname")
	private String deptName;
	
	@Column(name = "cityname")
	private String cityName;
	
	@Column(name = "statename")
	private String stateName;
	
	@Column(name = "pincode")
	private Long pincode;
	
	public Department() {
		
	}
	
	public Department(String deptName, String cityName, String stateName, Long pincode) {
		super();
		this.deptName = deptName;
		this.cityName = cityName;
		this.stateName = stateName;
		this.pincode = pincode;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	
	
}
