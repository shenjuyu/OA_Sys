package com.sjy.OA_Sys.biz;

import java.util.List;

import com.sjy.OA_Sys.bean.ChatRecord;
import com.sjy.OA_Sys.bean.Result;

public interface ChatRecordBiz {

	/**
	 * 添加单条消息记录
	 * @param chatRecord
	 * @return
	 */
	Result addChatRecord(ChatRecord chatRecord);
	
	/**
	 * 批量添加消息记录
	 * @param chatRecord
	 * @return
	 */
	Result addChatRecordForList(List<ChatRecord> chatRecord);
	
	/**
	 * 查找消息记录
	 * 需要：发送者ID   接收者ID  接收者是否是小组
	 * @param chatRecord
	 * @return
	 */
	List<ChatRecord> findChatRecord(ChatRecord chatRecord,Integer pageNum,Integer pageSize);
}
