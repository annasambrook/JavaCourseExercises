package com.anna.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.anna.entity.CustomerShareList;
import com.anna.service.CustomerDetailService;

@RestController
public class CustomerDetailResource {

	@Autowired
	private CustomerDetailService customerDetailService;
	
	@GetMapping(path="/customer/shares/{cId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public CustomerShareList getCustomerShareRatingByCustomerIdResource(@PathVariable("cId") int customerId) {
		return new CustomerShareList(customerDetailService.getCustomerShareByCustomerId(customerId));
	}
}
