package com.valtech.account.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.account.entity.Customer;
import com.valtech.account.service.CustomerService;

@RestController
public class CustomerRestController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/api/Customer")
	public Customer createCustomer(@RequestBody Customer c){
		return customerService.createCustomer(c);
	}
	

}
