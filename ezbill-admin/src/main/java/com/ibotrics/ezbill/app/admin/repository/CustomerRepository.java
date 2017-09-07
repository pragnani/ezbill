package com.ibotrics.ezbill.app.admin.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.ibotrics.ezbill.app.admin.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Serializable>{

	public Customer findById(Integer customerId);

}
