package com.anna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.anna.entity.CustomerShare;
import com.anna.service.CustomerDetailService;

@Controller
public class CustomerDetailController {

	@Autowired
	private CustomerDetailService customerDetailService;
	
	@RequestMapping("/")
	public ModelAndView getCustomerInputPage() {
		return new ModelAndView("InputCustomerId");
	}
	
	@RequestMapping("/checkShare")
	public ModelAndView checkShareController(@RequestParam("customerId") int customerId) {
		ModelAndView modelAndView=new ModelAndView();
		
		List<CustomerShare> customerShares=customerDetailService.getCustomerShareByCustomerId(customerId);
		
		modelAndView.addObject("customerShareList", customerShares);
		modelAndView.addObject("customerId", customerId);
		modelAndView.setViewName("ShowShare");
		return modelAndView;
	}
}
