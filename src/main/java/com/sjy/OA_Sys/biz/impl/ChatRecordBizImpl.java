package com.sjy.OA_Sys.biz.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sjy.OA_Sys.bean.ChatRecord;
import com.sjy.OA_Sys.bean.ChatRecordExample;
import com.sjy.OA_Sys.bean.ChatRecordExample.Criteria;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.biz.ChatRecordBiz;
import com.sjy.OA_Sys.dao.ChatRecordMapper;

@Service
public class ChatRecordBizImpl implements ChatRecordBiz {

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
				if(chatRecord.getChatSender()!=null && chatRecord.getChatReceive()!=null) {
					List<String> values = new ArrayList<String>();
					values.add(chatRecord.getChatReceive());
					values.add(chatRecord.getChatSender());
					criteria.andChatSenderIn(values);
					criteria.andChatReceiveIn(values);
				}
				if(chatRecord.getIsGroup()!=null) {
					criteria.andIsGroupEqualTo(chatRecord.getIsGroup());
				}
			}
			
			if(pageNum != null && pageSize != null) {
				PageHelper.startPage(pageNum, pageSize);
				List<ChatRecord> chatRecords = crm.selectByExampleWithBLOBs(cre);
				chatRecords=new ArrayList<>(chatRecords);
				Collections.reverse(chatRecords);
				return chatRecords;
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
