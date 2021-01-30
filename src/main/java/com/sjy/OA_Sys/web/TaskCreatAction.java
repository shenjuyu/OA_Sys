package com.sjy.OA_Sys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskCreatAction {

	@GetMapping("toTaskCreat.do")
	public String toTaskCreat() {
		return "task-creat::taskCreat";
	}
}
