package com.sjy.OA_Sys.dao;

import com.sjy.OA_Sys.bean.Mail;
import com.sjy.OA_Sys.bean.MailExample;
import com.sjy.OA_Sys.bean.MailWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MailMapper {
    long countByExample(MailExample example);

    int deleteByExample(MailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MailWithBLOBs record);

    int insertSelective(MailWithBLOBs record);

    List<MailWithBLOBs> selectByExampleWithBLOBs(MailExample example);

    List<Mail> selectByExample(MailExample example);

    MailWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MailWithBLOBs record, @Param("example") MailExample example);

    int updateByExampleWithBLOBs(@Param("record") MailWithBLOBs record, @Param("example") MailExample example);

    int updateByExample(@Param("record") Mail record, @Param("example") MailExample example);

    int updateByPrimaryKeySelective(MailWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MailWithBLOBs record);

    int updateByPrimaryKey(Mail record);
}