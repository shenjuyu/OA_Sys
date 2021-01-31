package com.sjy.OA_Sys.biz.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.sjy.OA_Sys.bean.Mail;
import com.sjy.OA_Sys.bean.MailExample;
import com.sjy.OA_Sys.bean.MailWithBLOBs;
import com.sjy.OA_Sys.bean.MailExample.Criteria;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.biz.MailBiz;
import com.sjy.OA_Sys.dao.MailMapper;

@Service
public class MailBizImpl implements MailBiz {

	@Resource
	private MailMapper mm;

	private MailExample me = new MailExample();

	@Override
	public List<?> findUnreadMail(String staffId, Boolean withBLOBS) {
		try {
			me.createCriteria().andMailStaffAddresseeEqualTo(staffId).andMailSituationEqualTo(1);
			if (withBLOBS) {
				return mm.selectByExampleWithBLOBs(me);
			} else {
				return mm.selectByExample(me);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			me.clear();
		}
		return null;
	}

	@Override
	public List<?> findMail(Mail mail, Integer pageNum, Integer pageSize, Boolean withBLOB) {
		try {
			Criteria criteria = me.createCriteria();
			if (mail != null) {
				if (mail.getMailId() != null) {
					criteria.andMailIdEqualTo(mail.getMailId());
				}
				if (mail.getMailSituation() != null) {
					criteria.andMailSituationEqualTo(mail.getMailSituation());
				}
				if (mail.getMailStaffAddressee() != null) {
					criteria.andMailStaffAddresseeEqualTo(mail.getMailStaffAddressee());
				}
				if (mail.getMailStaffSend() != null) {
					criteria.andMailStaffSendEqualTo(mail.getMailStaffSend());
				}
				if (mail.getMailTimeSend() != null) {
					criteria.andMailTimeSendEqualTo(mail.getMailTimeSend());
				}
				if (mail.getMailTitle() != null) {
					criteria.andMailTitleEqualTo(mail.getMailTitle());
				}

				// 分页
				if (pageNum != null && pageSize != null) {
					PageHelper.startPage(pageNum, pageSize);
					// 分页 && 是否需要邮件详情
					if (withBLOB) {
						return mm.selectByExampleWithBLOBs(me);
					} else {
						return mm.selectByExample(me);
					}
				}

				// 是否需要邮件详情
				if (withBLOB) {
					return mm.selectByExampleWithBLOBs(me);
				} else {
					return mm.selectByExample(me);
				}
			}
			// 是否需要邮件详情
			if (withBLOB) {
				return mm.selectByExampleWithBLOBs(me);
			} else {
				return mm.selectByExample(me);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			me.clear();
		}
		return null;
	}

	@Override
	public Result addMail(MailWithBLOBs mail) {
		mail.setMailTimeSend(new Timestamp(new Date().getTime()));
		
		if(mail.getId()!=null) {	//如果是已有草稿
			mail.setMailSituation(1);
			return updateMailSituation(mail);
		}
		
		int code = mm.insertSelective(mail); //发送或添加草稿
		if(code>0) {
			return new Result(1, "发送成功");
		}else {
			return new Result(0, "发送失败");
		}
	}

	@Override
	public Result updateMailSituation(Mail mail) {
		me.createCriteria().andMailIdEqualTo(mail.getMailId());
		int code = mm.updateByExample(mail, me);
		me.clear();
		if(code>0) {
			return new Result(1, "修改成功");
		}else {
			return new Result(0, "修改失败");
		}
	}

	@Override
	public Result updateMail(MailWithBLOBs mail) {
		me.createCriteria().andMailIdEqualTo(mail.getMailId());
		int code = mm.updateByExample(mail, me);
		me.clear();
		if(code>0) {
			return new Result(1, "保存成功");
		}else {
			return new Result(0, "保存失败");
		}
	}

}
