package com.gentech.dept.service;

import java.util.List;

import com.gentech.dept.entity.Department;

public interface DepartmentService {
	
	List<Department> getDepartments();
	
	Department getParticularDepartment(Long id) throws Exception;
	
	Department createDepartment(Department department) throws Exception;
	
	Department updateDepartment(Department department);
	
	void deleteDepartment(Long id);

}
