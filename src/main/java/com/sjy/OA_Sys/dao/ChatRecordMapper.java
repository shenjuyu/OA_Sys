package com.sjy.OA_Sys.dao;

import com.sjy.OA_Sys.bean.ChatRecord;
import com.sjy.OA_Sys.bean.ChatRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChatRecordMapper {
    long countByExample(ChatRecordExample example);

    int deleteByExample(ChatRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChatRecord record);

    int insertSelective(ChatRecord record);

    List<ChatRecord> selectByExampleWithBLOBs(ChatRecordExample example);

    List<ChatRecord> selectByExample(ChatRecordExample example);

    ChatRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChatRecord record, @Param("example") ChatRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") ChatRecord record, @Param("example") ChatRecordExample example);

    int updateByExample(@Param("record") ChatRecord record, @Param("example") ChatRecordExample example);

    int updateByPrimaryKeySelective(ChatRecord record);

    int updateByPrimaryKeyWithBLOBs(ChatRecord record);

    int updateByPrimaryKey(ChatRecord record);
}