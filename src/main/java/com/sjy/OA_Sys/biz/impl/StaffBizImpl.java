package com.sjy.OA_Sys.biz.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.github.pagehelper.PageHelper;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.bean.Staff;
import com.sjy.OA_Sys.bean.StaffExample;
import com.sjy.OA_Sys.bean.StaffExample.Criteria;
import com.sjy.OA_Sys.bean.TaskGroup;
import com.sjy.OA_Sys.biz.StaffBiz;
import com.sjy.OA_Sys.dao.StaffMapper;
import com.sjy.OA_Sys.util.SendEmail;

@Service
public class StaffBizImpl implements StaffBiz{

	@Resource
	private StaffMapper stm;
	@Resource
	private SendEmail sendEmail;
	@Resource
	private DepartBizImpl dbi;
	@Resource
	private TaskGroupBizImpl tgbi;
	
	private StaffExample stem = new StaffExample();
	
	@Value("${mail.formMail.addr}")
	private String from;
	@Value("${mail.formMail.subject}")
	private String subject;
	@Value("${mail.formMail.adminEmail}")
	private String adminEmail;
	@Value("${mail.formMail.errorContent}")
	private String errorContent;
	@Value("${contentTips.loginPwdTips}")
	private String loginPwdTips;
	@Value("${contentTips.initPwd}")
	private String initPwd;
	
	@Override
	public Result userLogin(Staff staff) {
		
		stem.createCriteria()
			.andStaffIdEqualTo(staff.getStaffId());
		List<Staff> staffs = stm.selectByExample(stem);
		stem.clear();
		
		String md5Password = DigestUtils.md5DigestAsHex(staff.getStaffPwd().getBytes());
		if(staffs.size()>1) {
			// 用户存在重复，要求管理员处理，此处可发送邮件给数据库管理员处理这个情况
			sendEmail.sendEmail(subject, from, adminEmail, errorContent, "员工编号:"+staff.getStaffId()+"出现重复现象请及时处理");
			return new Result(0, "用户存在重复现象,请及时联系管理员",staffs);
		}if(staffs.get(0).getStaffPwd().equals(initPwd) && staffs.get(0).getStaffPwd().equals(staff.getStaffPwd())) {
			return new Result(1,"登陆成功,"+loginPwdTips,staffs.get(0));
		}else if(staffs.get(0).getStaffPwd().equals(staff.getStaffPwd()) ||staffs.get(0).getStaffPwd().equals(md5Password)){
			return new Result(1,"登陆成功",staffs.get(0));
		}
		
		return new Result(0,"用户名或密码错误");
	}

	@Override
	public Result userLogout(Staff staff) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findUserEmail(String staffId) {
		stem.createCriteria().andStaffIdEqualTo(staffId);
		List<Staff> staffs = stm.selectByExample(stem);
		stem.clear();
		if(staffs.size()>1) {
			// 用户存在重复，要求管理员处理，此处可发送邮件给数据库管理员处理这个情况
			return null;
		}
		return staffs.get(0).getStaffEmail();
	}

	@Override
	public Result updateUserPwd(Staff staff) {
		String staffPwdMd5 = DigestUtils.md5DigestAsHex(staff.getStaffPwd().getBytes());
		staff.setStaffPwd(staffPwdMd5);
		stem.createCriteria().andStaffIdEqualTo(staff.getStaffId());
		List<Staff> staffs = stm.selectByExample(stem);
		if(staffs.get(0).getStaffPwd().equals(staffPwdMd5)) {
			return new Result(0, "新密码不能与旧密码相同");
		}
		int flag = stm.updateByExampleSelective(staff, stem);
		stem.clear();
		if(flag>0) {
			return new Result(1, "重置成功");
		}
		return new Result(0, "重置密码失败");
	}

	@Override
	public List<Staff> findStaff(Staff staff, Integer pageNum, Integer pageSize) {
		try {
			Criteria criteria = stem.createCriteria();
			if(staff!=null) {
				if(staff.getDepartId()!=null) {
					criteria.andDepartIdEqualTo(staff.getDepartId());
				}
				if(staff.getStaffId()!=null) {
					criteria.andStaffIdEqualTo(staff.getStaffId());
				}
				if(staff.getStaffName()!=null) {
					criteria.andStaffNameLike(staff.getStaffName());
				}
				if(staff.getStaffState()!=null) {
					criteria.andStaffStateEqualTo(staff.getStaffState());
				}
			}
			
			if(pageNum!=null && pageSize!=null) {
				PageHelper.startPage(pageNum, pageSize);
				return stm.selectByExample(stem);
			}
			return stm.selectByExample(stem);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			stem.clear();
		}
		return null;
	}

	@Override
	public List<Staff> findStaffForComm(Staff staff) {
		// 通讯录 包括 本部门的所有员工 参与的所有任务的小组（任务全部由小组完成）中的所有员工 去重
		List<Staff> mailList = new ArrayList<Staff>();
		
		TaskGroup taskGroup = new TaskGroup();
		taskGroup.setStaffId(staff.getStaffId());
		List<TaskGroup> taskGroups = tgbi.findTaskGroup(taskGroup);
		taskGroup.setStaffId(null);
		List<TaskGroup> taskGroups2 = null;
		for (TaskGroup taskGroup2 : taskGroups) {
			
			taskGroup.setTaskGroupId(taskGroup2.getTaskGroupId());
			taskGroups2 = tgbi.findTaskGroup(taskGroup);
			
			for (TaskGroup taskGroup3 : taskGroups2) {
				mailList.add(taskGroup3.getGroupStaff());
			}
		}
		
		Staff staffDepart = new Staff();
		staffDepart.setDepartId(staff.getDepartId());
		List<Staff> staffList = findStaff(staffDepart, null, null);
		for (Staff staff2 : staffList) { // 去重
			boolean flag = true; // 是否已经存在
			for (int i=0;i<mailList.size();i++) {
				if(staff2.getStaffId().equals(mailList.get(i).getStaffId())) {
					break;
				}
				if(i==mailList.size()-1) {
					flag = false;
				}
			}
			if(flag==false) {
				mailList.add(staff2);
			}
		}
		int removeNum=0;
		for(Staff staff3:mailList) {
			if(staff3.getStaffId()==staff.getStaffId()) {
				removeNum=mailList.indexOf(staff3);
			}
		}
		mailList.remove(removeNum);
		return mailList;
	}

	
}
