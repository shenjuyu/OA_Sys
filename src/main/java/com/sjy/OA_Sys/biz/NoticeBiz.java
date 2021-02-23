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
	 * @param addressee 如果为Null 则根据notice对象中的NoticeStaffAddressee进行查询 如果不为空则根据addressee中的多个数据进行查询
	 * @param read 是否已读，可以为空
	 * @param staffId 若查询是否已读 则必须输入该值
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	List<Notice> findNotice(Notice notice, List<String> addressee, Boolean read, String staffId,Integer pageNum,Integer pageSize);
	
}
