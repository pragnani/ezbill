package com.ibotrics.ezbill.app.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibotrics.ezbill.app.admin.model.Customer;
import com.ibotrics.ezbill.app.admin.repository.CustomerRepository;

@RestController
public class EzBillAdminController {
	
	@Autowired
	CustomerRepository customerRepository;
	@RequestMapping("/create")
	public Integer createCustomer(@RequestBody Customer customer){
		customerRepository.save(customer);
		return customer.getId();
	}
	@RequestMapping("/update")
	public Integer updateCustomer(@RequestBody Customer customer){
		customerRepository.save(customer);
		return customer.getId();
	}
	@RequestMapping("/getCustomer")
	public Customer getCustomer(Integer customerId){
		Customer customer = customerRepository.findById(customerId);
		return customer;
	}
	@RequestMapping("/deleteCustomer")
	public String deleteCustomer(Integer customerId){
		customerRepository.delete(customerId);
		return "Customer record delete successfully.";
	}

}
