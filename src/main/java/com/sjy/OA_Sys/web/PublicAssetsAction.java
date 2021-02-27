package com.sjy.OA_Sys.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sjy.OA_Sys.bean.PublicAssets;
import com.sjy.OA_Sys.bean.PublicAssetsUse;
import com.sjy.OA_Sys.bean.Staff;
import com.sjy.OA_Sys.biz.impl.PublicAssetsBizImpl;
import com.sjy.OA_Sys.biz.impl.PublicAssetsUseBizImpl;

@Controller
@SessionAttributes({ "loginStaff", "assetsTypeCache", "publicAssetsCodeNumTody" })
public class PublicAssetsAction {

	@Resource
	private PublicAssetsBizImpl pabi;
	@Resource
	private PublicAssetsUseBizImpl paubi;

	@GetMapping("toPublicAssets.do")
	public String toPublicAssets(@SessionAttribute(value = "loginStaff") Staff loginStaff, Model m) {
		// 个人借用公司资产列表
		PublicAssetsUse assetsUse = new PublicAssetsUse();
		assetsUse.setStaffId(loginStaff.getStaffId());
		assetsUse.setUseState(0);
		List<PublicAssetsUse> assetsUseList = paubi.findPublicAssetsUse(assetsUse, 1, 10);

		// 部门现有资产列表
		PublicAssets assets = new PublicAssets();
		assets.setDepartId(loginStaff.getDepartId());
		List<PublicAssets> assetsList = pabi.findPublicAssets(assets, 1, 10);

		m.addAttribute("assetsUseList", assetsUseList);
		m.addAttribute("assetsList", assetsList);
		return "public-assets::publicAssets";
	}

	@PostMapping("pubassUseShow.do")
	public String topubassUseShow(String pubassName, Integer pubassType,
			@SessionAttribute(value = "loginStaff") Staff loginStaff, Model m) {

		PublicAssetsUse assetsUse = new PublicAssetsUse();
		assetsUse.setStaffId(loginStaff.getStaffId());
		assetsUse.setUseState(0);
		List<PublicAssetsUse> assetsUseList = paubi.findPublicAssetsUse(pubassName, pubassType, 1, 10);

		m.addAttribute("assetsUseList", assetsUseList);
		return "public-assets::pubassUseShowList";
	}

	@PostMapping("toPubAssUsePage.do")
	public String toPubAssUsePage(String pubassName, Integer pubassType, Integer page,
			@SessionAttribute(value = "loginStaff") Staff loginStaff, Model m) {

		PublicAssetsUse assetsUse = new PublicAssetsUse();
		assetsUse.setStaffId(loginStaff.getStaffId());
		assetsUse.setUseState(0);
		List<PublicAssetsUse> assetsUseList = paubi.findPublicAssetsUse(pubassName, pubassType, page, 10);

		m.addAttribute("assetsUseList", assetsUseList);
		return "public-assets::pubassUseShowList";
	}

	@PostMapping("pubassShow.do")
	public String toPubassShow(String pubassName, Integer pubassType,
			@SessionAttribute(value = "loginStaff") Staff loginStaff, Model m) {

		PublicAssets publicAssets = new PublicAssets();
		publicAssets.setPubassName(pubassName);
		if (pubassType != null && pubassType != 0) {
			publicAssets.setPubassType(pubassType);
		}
		List<PublicAssets> assetList = pabi.findPublicAssets(publicAssets, 1, 10);

		m.addAttribute("assetsList", assetList);
		return "public-assets::pubassShowList";
	}

	@PostMapping("toPubAssShowPage.do")
	public String toPubAssShowPage(String pubassName, Integer pubassType, Integer page,
			@SessionAttribute(value = "loginStaff") Staff loginStaff, Model m) {

		PublicAssets publicAssets = new PublicAssets();
		publicAssets.setPubassName(pubassName);
		if (pubassType != null && pubassType != 0) {
			publicAssets.setPubassType(pubassType);
		}
		List<PublicAssets> assetList = pabi.findPublicAssets(publicAssets, page, 10);

		m.addAttribute("assetsList", assetList);
		return "public-assets::pubassShowList";
	}

	@PostMapping("showPubAssUseDetails.do")
	public String toShowPubAssUseDetails(Integer id, Model m) {
		PublicAssetsUse assetsUse = new PublicAssetsUse();
		assetsUse.setId(id);
		List<PublicAssetsUse> assetsUseList = paubi.findPublicAssetsUse(assetsUse, null, null);
		if (assetsUseList == null || assetsUseList.size() != 1) {
			return "error";
		}

		m.addAttribute("assetsUseDetail", assetsUseList.get(0));
		return "plugin::pubAssUseDetail";
	}

	@PostMapping("showPubAssDetails.do")
	public String toShowPubAssDetails(String pubassId, Model m) {
		PublicAssets assets = new PublicAssets();
		assets.setPubassId(pubassId);
		List<PublicAssets> assetsList = pabi.findPublicAssets(assets, null, null);
		if (assetsList == null || assetsList.size() != 1) {
			return "error";
		}

		m.addAttribute("pubAssDetail", assetsList.get(0));
		return "plugin::pubAssDetail";
	}
}
