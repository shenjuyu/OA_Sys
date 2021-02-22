package com.sjy.OA_Sys.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Resource;
import javax.websocket.RemoteEndpoint;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sjy.OA_Sys.bean.ChatRecord;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.biz.impl.ChatRecordBizImpl;

@Component
public class WebSocketUtil {

	private static final Map<String,Session> ONLINE_SESSION = new ConcurrentHashMap<>();
	
	public static void addSession(String userId, Session session){
        // 此处只允许一个用户的session链接。一个用户的多个连接，我们视为无效。
		Session preSession =ONLINE_SESSION.get(userId);
		if(preSession!=null && preSession.isOpen()) {
	        ONLINE_SESSION.putIfAbsent ( userId, session );
		}else {
			ONLINE_SESSION.put ( userId, session );
		}
    }
	
	public static Session getSession(String userId){
        return ONLINE_SESSION.get ( userId );
    }
	
	public static void removeSession(String userId){
        ONLINE_SESSION.remove ( userId );
    }
}
