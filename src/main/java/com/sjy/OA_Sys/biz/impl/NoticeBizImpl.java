package com.sjy.OA_Sys.biz.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.github.pagehelper.PageHelper;
import com.sjy.OA_Sys.bean.Notice;
import com.sjy.OA_Sys.bean.NoticeExample;
import com.sjy.OA_Sys.bean.NoticeExample.Criteria;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.biz.NoticeBiz;
import com.sjy.OA_Sys.dao.NoticeMapper;

public class NoticeBizImpl implements NoticeBiz {

	@Resource
	private NoticeMapper nm;
	
	private NoticeExample ne = new NoticeExample();
	
	@Override
	public Result addNotice(Notice notice) {
		int code = nm.insertSelective(notice);
		if(code>0) {
			return new Result(1, "发布成功");
		}else {
			return new Result(0, "发布失败");
		}
	}

	@Override
	public List<Notice> findNotice(Notice notice, Integer pageNum, Integer pageSize) {
		try {
			Criteria criteria = ne.createCriteria();
			if(notice!=null) {
				if(notice.getNoticeTitle()!=null) {
					criteria.andNoticeTitleEqualTo(notice.getNoticeTitle());
				}
				if(notice.getNoticeStaffAddressee()!=null) {
					criteria.andNoticeStaffAddresseeEqualTo(notice.getNoticeStaffAddressee());
				}
				if(notice.getNoticeStaffSend()!=null) {
					criteria.andNoticeStaffSendEqualTo(notice.getNoticeStaffSend());
				}
				if(notice.getNoticeTime()!=null) {
					criteria.andNoticeTimeBetween(notice.getNoticeTime(), new Timestamp(new Date().getTime()));
				}
			}
			
			// 分页
			if (pageNum != null && pageSize != null) {
				PageHelper.startPage(pageNum, pageSize);
				return nm.selectByExample(ne);
			}
			return nm.selectByExample(ne);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ne.clear();
		}
		return null;
	}

}
