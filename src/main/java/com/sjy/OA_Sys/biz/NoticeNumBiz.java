package com.sjy.OA_Sys.biz;

import java.util.List;

import com.sjy.OA_Sys.bean.NoticeNum;
import com.sjy.OA_Sys.bean.Result;

public interface NoticeNumBiz {

	/**
	 * 添加已读信息
	 * @param noticeNum
	 * @return
	 */
	Result addNoticeNum(NoticeNum noticeNum); 
	
	/**
	 * 查找已读信息
	 * @param noticeNum
	 * @return
	 */
	List<NoticeNum> findNoticeNum(NoticeNum noticeNum);
}
