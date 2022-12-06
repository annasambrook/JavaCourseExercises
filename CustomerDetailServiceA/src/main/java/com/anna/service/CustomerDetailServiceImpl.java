package com.anna.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.anna.entity.Customer;
import com.anna.entity.CustomerList;
import com.anna.entity.CustomerShare;
import com.anna.entity.Share;

@Service
public class CustomerDetailServiceImpl implements CustomerDetailService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<CustomerShare> getCustomerShareByCustomerId(int customerId) {
		
		List<CustomerShare> customerShareList=new ArrayList<CustomerShare>();
		
		CustomerList customerList=restTemplate.getForObject("http://localhost:8084/customer/"+customerId, CustomerList.class);
		
		for(Customer customer:customerList.getCustomers()) {
			
			Share share=restTemplate.getForObject("http://localhost:8082/shares/"+customer.getCustomerId(), Share.class);
			
			CustomerShare customerShare=new CustomerShare(customer.getCustomerId(), share.getShareID());
			
			customerShareList.add(customerShare);
		}
		return customerShareList;
	}

}
