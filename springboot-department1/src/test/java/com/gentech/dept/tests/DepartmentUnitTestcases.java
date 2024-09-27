package com.gentech.dept.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

import com.gentech.dept.entity.Department;
import com.gentech.dept.repository.DepartmentRepository;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DepartmentUnitTestcases {
	
	@LocalServerPort
	private int port;
	
	private String baseURL="http://localhost";
	
	private static RestTemplate restTeamplate;
	
	@Autowired
	private DepartmentRepository deptRepository;
	
	
	
	@BeforeAll
	public static void initialization()
	{
		restTeamplate=new RestTemplate();
	}
	
	@BeforeEach
	public void setUp()
	{
		baseURL=baseURL+":"+port+"/v1/api/departments";
	}
	
	@AfterEach
	public void tearDown()
	{
		deptRepository.deleteAll();
	}

	@Test
	public void shouldcreatedepartmentest()
	{
		Department dept1=new Department();
		dept1.setDeptName("Research");
		dept1.setCityName("Bangalore");
		dept1.setStateName("Karnataka");
		dept1.setPincode(Long.valueOf(560021));
		
		Department newDepartment=restTeamplate.postForObject(baseURL, dept1, Department.class);
		
		//Validation
		assertNotNull(newDepartment);
		assertThat(newDepartment.getId()).isNotNull();
		assertEquals("Research", newDepartment.getDeptName());
		
		//teardown
	//	deptRepository.deleteById(newDepartment.getId());
		
	}
	
	@Test
	public void shoulddisplayalldepartmenttest()
	{
		Department dept1=new Department();
		dept1.setDeptName("Research");
		dept1.setCityName("Bangalore");
		dept1.setStateName("Karnataka");
		dept1.setPincode(Long.valueOf(560021));
		
		Department dept2=new Department();
		dept2.setDeptName("Accounting");
		dept2.setCityName("Hyderabad");
		dept2.setStateName("Andrapradesh");
		dept2.setPincode(Long.valueOf(580044));
		
		Department research=restTeamplate.postForObject(baseURL, dept1, Department.class);
		Department accounting=restTeamplate.postForObject(baseURL, dept2, Department.class);
		
		List<Department> list=restTeamplate.getForObject(baseURL, List.class);
		
		//validation
		assertNotNull(list);
		assertThat(list.size()).isEqualTo(2);
	}
	
	@Test
	public void shoulddisplayonedeaprtmenttest()
	{
		Department dept1=new Department();
		dept1.setDeptName("Research");
		dept1.setCityName("Bangalore");
		dept1.setStateName("Karnataka");
		dept1.setPincode(Long.valueOf(560021));
		
		Department research=restTeamplate.postForObject(baseURL, dept1, Department.class);
		
		Department existingDept=restTeamplate.getForObject(baseURL+"/"+research.getId(), Department.class);
		
		//Validation
		assertNotNull(existingDept);
		assertEquals("Research", existingDept.getDeptName());
	}
	
	@Test
	public void shouldupdateexistingdepartmenttest()
	{
		Department dept1=new Department();
		dept1.setDeptName("Research");
		dept1.setCityName("Bangalore");
		dept1.setStateName("Karnataka");
		dept1.setPincode(Long.valueOf(560021));
		
		Department research=restTeamplate.postForObject(baseURL, dept1, Department.class);

		research.setDeptName("Operations");
		
		restTeamplate.put(baseURL+"/"+research.getId(), research, Department.class);
		
		//Validation
		assertEquals("Operations", research.getDeptName());
		
	}
	
	@Test
	public void shoulddeletedepartmenttest()
	{
		Department dept1=new Department();
		dept1.setDeptName("Research");
		dept1.setCityName("Bangalore");
		dept1.setStateName("Karnataka");
		dept1.setPincode(Long.valueOf(560021));
		
		Department dept2=new Department();
		dept2.setDeptName("Accounting");
		dept2.setCityName("Hyderabad");
		dept2.setStateName("Andrapradesh");
		dept2.setPincode(Long.valueOf(580044));
		
		Department research=restTeamplate.postForObject(baseURL, dept1, Department.class);
		Department accounting=restTeamplate.postForObject(baseURL, dept2, Department.class);
		
		restTeamplate.delete(baseURL+"/"+research.getId());
		
		//validation
		assertThat(deptRepository.findAll().size()).isEqualTo(1);
		
		
	}
}
