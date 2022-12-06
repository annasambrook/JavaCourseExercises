package com.anna.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.anna.entity.Customer;
import com.anna.entity.CustomerList;
import com.anna.service.CustomerService;

@RestController
public class CustomerResource {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping(path = "/customer/{cId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public CustomerList searchCustomerByCustomerIdResource(@PathVariable("cId") int customerId) {
		return new CustomerList(customerService.searchCustomerByCustomerId(customerId));
		
	}
}
