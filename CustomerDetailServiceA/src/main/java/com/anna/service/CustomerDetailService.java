package com.anna.service;

import java.util.List;

import com.anna.entity.CustomerShare;

public interface CustomerDetailService {

	List<CustomerShare> getCustomerShareByCustomerId(int customerId);
}
