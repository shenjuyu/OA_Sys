package com.sjy.OA_Sys.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import com.sjy.OA_Sys.bean.NoticeNum;
import com.sjy.OA_Sys.bean.NoticeNumExample;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.biz.NoticeNumBiz;
import com.sjy.OA_Sys.dao.NoticeNumMapper;

public class NoticeNumBizImpl implements NoticeNumBiz {

	@Resource
	private NoticeNumMapper nnm;
	
	private NoticeNumExample nne = new NoticeNumExample();
	
	@Override
	public Result addNoticeNum(NoticeNum noticeNum) {
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
			nne.createCriteria().andNoticeIdEqualTo(noticeNum.getNoticeId());
			return nnm.selectByExample(nne);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			nne.clear();
		}
		return null;
	}

}
