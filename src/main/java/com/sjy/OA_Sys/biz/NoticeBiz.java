package com.sjy.OA_Sys.biz;

import java.util.List;

import com.sjy.OA_Sys.bean.Notice;
import com.sjy.OA_Sys.bean.Result;

public interface NoticeBiz {

	/**
	 * 添加公告
	 * @param notice
	 * @return
	 */
	Result addNotice(Notice notice);
	
	/**
	 * 多条件查询公告
	 * @param notice
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	List<Notice> findNotice(Notice notice, Boolean read, String staffId,Integer pageNum,Integer pageSize);
	
}
