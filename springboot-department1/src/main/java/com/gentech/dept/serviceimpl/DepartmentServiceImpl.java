package com.gentech.dept.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gentech.dept.entity.Department;
import com.gentech.dept.repository.DepartmentRepository;
import com.gentech.dept.service.DepartmentService;
@Service
public class DepartmentServiceImpl implements DepartmentService{

	private DepartmentRepository deptRepository;

	public DepartmentServiceImpl(DepartmentRepository deptRepository) {
		super();
		this.deptRepository = deptRepository;
	}

	@Override
	public List<Department> getDepartments() {
		return deptRepository.findAll();
	}

	@Override
	public Department getParticularDepartment(Long id) throws Exception
	{
		Optional<Department> dept=deptRepository.findById(id);
		if(dept.isPresent())
		{
			return dept.get();
		}
		throw new Exception("The Department id "+id+" has not available in the database table");

	}

	@Override
	public Department createDepartment(Department department)throws Exception {
		if(department.getDeptName().length() >=5)
		{
			throw new Exception("Department Name should not exceeds more than 4 characters");
		}
		return deptRepository.save(department);
	}

	@Override
	public Department updateDepartment(Department department) {
		return deptRepository.save(department);
	}

	@Override
	public void deleteDepartment(Long id) {
		deptRepository.deleteById(id);
	}

}
