package com.gentech.customer.service;

import java.util.List;


import com.gentech.customer.entity.Customer;

public interface CustomerService {

	Customer createCustomer(Customer customer);
	
	List<Customer> getCustomers();
	
	List<Customer> getCustomers(int pageNumber, int pageSize);
	
	List<Customer> getCustomers(int pageNumber, int pageSize, String columnName);
	
	Customer getCustomer(Long id);
	
	Customer updateCustomer(Customer customer, Long id);
	
	void deleteCustomer(Long id);
	
	List<Customer> getAllCustomersByCustomerName(String name);
	
	List<Customer> getAllCustomersByLocation(String name);
	
	List<Customer> getAllCustomersByNameAndLocation(String name, String loc);
	
	List<Customer> getAllCustomersByPartialCustomerName(String name);
}
