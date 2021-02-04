package com.sjy.OA_Sys.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sjy.OA_Sys.bean.Staff;
import com.sjy.OA_Sys.biz.impl.StaffBizImpl;

@Controller
@SessionAttributes("loginStaff")
public class PersonnelAction {
	
	@Resource
	private StaffBizImpl sbi;
	

	@GetMapping("toPersonnel.do")
	public String toPersonnel(@SessionAttribute(value="loginStaff") Staff loginStaff, Model m) {
		
		// 查询本部门的所有员工
		List<Staff> departStaffs = sbi.findStaff(loginStaff,1,8);
		m.addAttribute("departStaffs", departStaffs);
		m.addAttribute("oneStaff", null);
		return "personnel::personnelList";
	}
	
	@PostMapping("staffFind.do")
	public String toStaffFind(Staff staff, @SessionAttribute(value="loginStaff") Staff loginStaff, Model m) {
		if(staff.getStaffId()!=null && staff.getStaffId()=="") {
			staff.setStaffId(null);
		}
		if(staff.getStaffName()!=null && staff.getStaffName()=="") {
			staff.setStaffName(null);
		}
		if(staff.getStaffState()==4) {
			staff.setStaffState(null);
		}
		System.out.println(staff.getStaffId()+"==="+staff.getStaffName()+"==="+staff.getStaffState());
		staff.setDepartId(loginStaff.getDepartId());
		m.addAttribute("departStaffs", sbi.findStaff(staff, 1, 8));
		return "personnel::staffShowTable";
	}
	
	@PostMapping("staffShowToPage.do")
	public String userShowToPage(Staff staff,int page, @SessionAttribute(value="loginStaff") Staff loginStaff, Model m) {
		if(staff.getStaffId()!=null && staff.getStaffId()=="") {
			staff.setStaffId(null);
		}
		if(staff.getStaffName()!=null && staff.getStaffName()=="") {
			staff.setStaffName(null);
		}
		if(staff.getStaffState()==4) {
			staff.setStaffState(null);
		}
		staff.setDepartId(loginStaff.getDepartId());
		m.addAttribute("departStaffs", sbi.findStaff(staff, page, 8));
		return "personnel::staffShowTable";
	}
	
	@ResponseBody
	@PostMapping("toShowStaffDetils.do")
	public Staff toShowStaffDetils(Staff staff) {
		return sbi.findStaff(staff,null,null).get(0);
	}
}
