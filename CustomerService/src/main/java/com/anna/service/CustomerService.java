package com.anna.service;

import java.util.List;

import com.anna.entity.Customer;

public interface CustomerService {

	List<Customer> searchCustomerByCustomerId(int customerId);
}
