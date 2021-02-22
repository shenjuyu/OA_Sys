package com.sjy.OA_Sys.web;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

import javax.annotation.Resource;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.sjy.OA_Sys.OaSysApplication;
import com.sjy.OA_Sys.bean.ChatRecord;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.biz.impl.ChatRecordBizImpl;
import com.sjy.OA_Sys.util.RedisUtil;
import com.sjy.OA_Sys.util.WebSocketUtil;

@Component
@ServerEndpoint(value = "/websocket/{userId}")
public class WebSocketAction {

	// 此处是解决无法注入的关键
	private static ApplicationContext applicationContext;
	// 要注入的service或者dao
	private RedisUtil redisUtil;
	private ChatRecordBizImpl crb;
	
	public static void setApplicationContext(ApplicationContext applicationContext) {
		WebSocketAction.applicationContext = applicationContext;
	}

	@OnOpen
	public void onOpen(@PathParam(value = "userId") String userId, Session session) {
		// 添加到session的映射关系中
		System.out.println("onOpen sessionId:"+session.getId());
		WebSocketUtil.addSession(userId, session);
	}

	@OnClose
	public void onClose(@PathParam(value = "userId") String userId, Session session) {
		// 删除映射关系
		System.out.println("onClose sessionId:"+session.getId());
		WebSocketUtil.removeSession(userId);
	}

	@OnMessage
	public void onMessage(@PathParam(value = "userId") String userId, Session session, String message) {
		crb=applicationContext.getBean(ChatRecordBizImpl.class);// 手动实例化
		String[] infoArr=message.split("-=-");
		int isGroup = Integer.parseInt(infoArr[0]);
		String addresseeId = infoArr[1];
		String news="";
		if(infoArr.length>3) {
			for(int i =2; i<infoArr.length; i++) {
				news+=infoArr[i];
			}
		}else {
			news= infoArr[2];
		}
		
		ChatRecord chatRecord = new ChatRecord(new Timestamp(System.currentTimeMillis()), userId, addresseeId, isGroup, news);
		
		if(chatRecord.getIsGroup().equals(0)) {// 0 不是小组  1 是小组
			Result result=null;
				result = crb.addChatRecord(chatRecord);
			if(result.getSucess()==1) {
				Session session1 = WebSocketUtil.getSession(chatRecord.getChatReceive());
				if(session1!=null) {
					session1.getAsyncRemote().sendText(chatRecord.getMessage());
				}else {
					session1=WebSocketUtil.getSession(chatRecord.getChatSender());
					session1.getAsyncRemote().sendText("[系统消息]对方不在线...");
				}
				
			}else {
				Session session1 = WebSocketUtil.getSession(chatRecord.getChatSender());
				session1.getAsyncRemote().sendText("[系统消息]"+result.getMessage());
			}
		}else {
		}
	}

	@OnError
	public void onError(Session session, Throwable throwable) {
		try {
			session.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
