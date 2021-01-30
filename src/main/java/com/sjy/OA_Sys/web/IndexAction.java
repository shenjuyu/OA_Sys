package com.sjy.OA_Sys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexAction {

	@GetMapping({"/","/index","/index.*"})
	public String toIndex() {
		return "index";
	}
}
