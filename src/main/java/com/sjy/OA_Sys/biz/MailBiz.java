package com.sjy.OA_Sys.biz;

import java.util.List;

import com.sjy.OA_Sys.bean.Mail;
import com.sjy.OA_Sys.bean.MailWithBLOBs;
import com.sjy.OA_Sys.bean.Result;

public interface MailBiz {

	/**
	 * 发现用户未读邮件
	 * @param staff
	 * @return
	 */
	List<?> findUnreadMail(String staffId,Boolean withBLOBS);
	
	/**
	 * 多条件查找邮件
	 * @param staffId
	 * @param mail
	 * @return
	 */
	List<?> findMail(Mail mail,Integer pageNum,Integer pageSize,Boolean withBLOB);
	
	/**
	 * 发送邮件/添加草稿
	 * @param mail
	 * @param isDraft 是否为新增草稿
	 * @return
	 */
	Result addMail(MailWithBLOBs mail);
	
	/**
	 * 修改邮件收发读状态
	 * 0 草稿	1 未读	 2 已读
	 * 3 垃圾桶	4 已对用户不可见
	 * 
	 * @param mail
	 * @return
	 */
	Result updateMailSituation(Mail mail);
	
	/**
	 * 修改草稿邮件
	 * @param mail
	 * @return
	 */
	Result updateMail(MailWithBLOBs mail);
}
