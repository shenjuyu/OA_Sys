package com.sjy.OA_Sys.biz;

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
	 * 修改员工密码
	 * @param user
	 * @return
	 */
	Result updateUserPwd(Staff staff);
	
}
