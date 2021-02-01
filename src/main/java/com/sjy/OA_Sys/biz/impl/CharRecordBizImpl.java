package com.sjy.OA_Sys.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import com.github.pagehelper.PageHelper;
import com.sjy.OA_Sys.bean.ChatRecord;
import com.sjy.OA_Sys.bean.ChatRecordExample;
import com.sjy.OA_Sys.bean.ChatRecordExample.Criteria;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.biz.CharRecordBiz;
import com.sjy.OA_Sys.dao.ChatRecordMapper;

public class CharRecordBizImpl implements CharRecordBiz {

	@Resource
	private ChatRecordMapper crm;
	
	private ChatRecordExample cre = new ChatRecordExample();
	
	@Override
	public Result addChatRecord(ChatRecord chatRecord) {
		int code = crm.insertSelective(chatRecord);
		if(code>0) {
			return new Result(1,"添加成功");
		}else {
			return new Result(0,"添加失败");
		}
	}

	@Override
	public Result addChatRecordForList(List<ChatRecord> chatRecordList) {
		if(chatRecordList.size()<1) {
			return new Result(0,"无记录");
		}
		if(chatRecordList.size()==1) {
			return addChatRecord(chatRecordList.get(0));
		}
		int code = 0 ;
		for(ChatRecord record : chatRecordList) {
			crm.insertSelective(record);
		}
		if(code==chatRecordList.size()) {
			return new Result(1,"批量添加成功");
		}else {
			return new Result(0,"批量添加失败");
		}
		
	}

	@Override
	public List<ChatRecord> findChatRecord(ChatRecord chatRecord,Integer pageNum,Integer pageSize) {
		try {
			Criteria criteria = cre.createCriteria();
			cre.setOrderByClause("CHAT_TIME_SEND desc");
			
			if(chatRecord!=null) {
				if(chatRecord.getChatSender()!=null) {
					criteria.andChatSenderEqualTo(chatRecord.getChatSender());
				}
				if(chatRecord.getChatReceive()!=null) {
					criteria.andChatReceiveEqualTo(chatRecord.getChatReceive());
				}
				if(chatRecord.getIsGroup()!=null) {
					criteria.andIsGroupEqualTo(chatRecord.getIsGroup());
				}
			}
			
			if(pageNum != null && pageSize != null) {
				PageHelper.startPage(pageNum, pageSize);
				return crm.selectByExampleWithBLOBs(cre);
			}
			return crm.selectByExampleWithBLOBs(cre);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			cre.clear();
		}
		return null;
	}

}
