package com.sjy.OA_Sys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectAuditAction {

	@GetMapping("toProjectAudit.do")
	public String toProjectAudit() {
		return "project-audit::projectAudit";
	}
}
