package com.sjy.OA_Sys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NoticeAction {


	@GetMapping("toNotice.do")
	public String toNotice() {
		return "notice::noticeList";
	}
}
