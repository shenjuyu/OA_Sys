package com.sjy.OA_Sys.biz.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Timestamp;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sjy.OA_Sys.OaSysApplication;
import com.sjy.OA_Sys.bean.ChatRecord;
import com.sjy.OA_Sys.bean.Result;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=OaSysApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ChatRecordBizImplTest {

	@Resource
	private ChatRecordBizImpl crb;
	
	@Test
	public void addChatRecordTest() {
		ChatRecord chatRecord = new ChatRecord(new Timestamp(System.currentTimeMillis()), "202101300101001", "202102040101001", 0, "asdf");
		Result result = crb.addChatRecord(chatRecord);
		assertEquals(result.getSucess(), 1);
	}
}
