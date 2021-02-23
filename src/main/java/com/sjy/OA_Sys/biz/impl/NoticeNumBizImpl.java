package com.sjy.OA_Sys.biz.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sjy.OA_Sys.bean.NoticeNum;
import com.sjy.OA_Sys.bean.NoticeNumExample;
import com.sjy.OA_Sys.bean.NoticeNumExample.Criteria;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.biz.NoticeNumBiz;
import com.sjy.OA_Sys.dao.NoticeNumMapper;

@Service
public class NoticeNumBizImpl implements NoticeNumBiz {

	@Resource
	private NoticeNumMapper nnm;
	
	private NoticeNumExample nne = new NoticeNumExample();
	
	@Override
	public Result addNoticeNum(NoticeNum noticeNum) {
		List<NoticeNum> noticeNums = findNoticeNum(noticeNum);
		if(noticeNums!=null && noticeNums.size()>0) {
			return new Result(1, "已读");
		}
		
		noticeNum.setReadTime(new Timestamp(System.currentTimeMillis()));
		int code = nnm.insertSelective(noticeNum);
		if(code>0) {
			return new Result(1, "添加成功");
		}else {
			return new Result(0, "添加失败");
		}
	}

	@Override
	public List<NoticeNum> findNoticeNum(NoticeNum noticeNum) {
		try {
			Criteria criteria = nne.createCriteria();
			if(noticeNum!=null) {
				if(noticeNum.getNoticeId()!=null) {
					criteria.andNoticeIdEqualTo(noticeNum.getNoticeId());
				}
				if(noticeNum.getStaffId()!=null) {
					criteria.andStaffIdEqualTo(noticeNum.getStaffId());
				}
			}
			return nnm.selectByExample(nne);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			nne.clear();
		}
		return null;
	}

	@Override
	public Long countByExample(NoticeNum noticeNum) {
		nne.createCriteria().andNoticeIdEqualTo(noticeNum.getNoticeId());
		return nnm.countByExample(nne);
	}

}
