package com.sjy.OA_Sys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectCreatAction {

	@GetMapping("toProjectCreat.do")
	public String toProjectCreat() {
		return "project-creat::projectCreat";
	}
}
