package com.gentech.relation.service;

import java.util.List;

import com.gentech.relation.entity.Customer;

public interface CustomerService {
	
	Customer createCustomer(Customer customer);
	
	List<Customer> getAllCustomers();

}
