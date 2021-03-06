package com.sjy.OA_Sys.biz;

import java.util.List;

import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.bean.Staff;

public interface StaffBiz {

	/**
	 * 员工登录
	 * @return
	 */
	Result userLogin(Staff staff);
	
	/**
	 * 退出登录
	 * @param user
	 * @return
	 */
	Result userLogout(Staff staff);
	
	/**
	 * 查询员工email
	 * @param loginName
	 * @return
	 */
	String findUserEmail(String staffId);
	
	/**
	 * 查找员工
	 * @param staff
	 * @return
	 */
	List<Staff> findStaff(Staff staff, Integer pageNum, Integer pageSize);
	
	/**
	 * 修改员工密码
	 * @param user
	 * @return
	 */
	Result updateUserPwd(Staff staff);
	
	/**
	 * 查找某个员工的通讯录
	 * @param staff
	 * @return
	 */
	List<Staff> findStaffForComm(Staff staff);
}
