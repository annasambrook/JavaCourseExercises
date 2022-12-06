package com.anna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anna.entity.Customer;
import com.anna.persistence.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public List<Customer> searchCustomerByCustomerId(int customerId) {
		return customerDao.searchCustomerByCustomerId(customerId);
	}

}
