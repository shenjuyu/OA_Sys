package com.sjy.OA_Sys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerServiceAction {
	
	@GetMapping("toCustomerService.do")
	public String toCustomerService() {
		return "customer-service::customerService";
	}
}
