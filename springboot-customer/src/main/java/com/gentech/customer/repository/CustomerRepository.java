package com.gentech.customer.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.gentech.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>, PagingAndSortingRepository<Customer, Long>{

	List<Customer> findByCustomerName(String name);
	
	List<Customer> findByLocation(String name);
	
	List<Customer> findByCustomerNameAndLocation(String name, String loc);
	
	List<Customer> findByCustomerNameContaining(String partialName);
	
	
	
}
