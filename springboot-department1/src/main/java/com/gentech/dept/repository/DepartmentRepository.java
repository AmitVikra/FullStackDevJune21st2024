package com.gentech.dept.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gentech.dept.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
