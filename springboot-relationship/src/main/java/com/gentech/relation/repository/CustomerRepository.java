package com.gentech.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gentech.relation.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
