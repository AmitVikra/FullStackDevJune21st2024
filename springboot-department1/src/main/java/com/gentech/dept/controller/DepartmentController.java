package com.gentech.dept.controller;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gentech.dept.entity.Department;
import com.gentech.dept.service.DepartmentService;

@RestController
@RequestMapping("/v1/api")
public class DepartmentController {

	private DepartmentService deptService;

	public DepartmentController(DepartmentService deptService) {
		super();
		this.deptService = deptService;
	}
	
	@GetMapping("/departments")
	public List<Department> getAllDepartments()
	{
		return deptService.getDepartments();
		
	}
	
	@GetMapping("/departments/{id}")
	public Department getOneDepartment(@PathVariable Long id) throws Exception
	{
		return deptService.getParticularDepartment(id);
	}
	
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department department)throws Exception
	{
		return deptService.createDepartment(department);
	}
	
	@PutMapping("/departments/{id}")
	public Department updateSpecificDepartment(@PathVariable Long id, 
			@RequestBody Department department)
	{
		department.setId(id);
		return deptService.updateDepartment(department);
	}
	
	@DeleteMapping("/departments/{id}")
	public String deleteSpeciifcDepartment(@PathVariable Long id)
	{
		deptService.deleteDepartment(id);
		return "The Department with id value "+id+" has deleted succcessfully";
	}
}
