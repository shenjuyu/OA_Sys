package com.sjy.OA_Sys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonnelAction {

	@GetMapping("toPersonnel.do")
	public String toPersonnel() {
		return "personnel::personnelList";
	}
}
