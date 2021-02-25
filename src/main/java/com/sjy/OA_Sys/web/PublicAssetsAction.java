package com.sjy.OA_Sys.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sjy.OA_Sys.biz.impl.PublicAssetsBizImpl;

@Controller
@SessionAttributes("loginStaff")
public class PublicAssetsAction {

	@Resource
	private PublicAssetsBizImpl pabi;
	
	@GetMapping("toPublicAssets.do")
	public String toPublicAssets(Model m) {
		
		
		
		return "public-assets::publicAssets";
	}
}
