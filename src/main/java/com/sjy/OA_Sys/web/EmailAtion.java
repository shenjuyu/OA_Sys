package com.sjy.OA_Sys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmailAtion {

	
	@GetMapping("toEmail.do")
	public String toEmail() {
		return "email::emailList";
	}
}
