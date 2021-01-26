package com.sjy.OA_Sys.dao;

import com.sjy.OA_Sys.bean.NoticeNum;
import com.sjy.OA_Sys.bean.NoticeNumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoticeNumMapper {
    long countByExample(NoticeNumExample example);

    int deleteByExample(NoticeNumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NoticeNum record);

    int insertSelective(NoticeNum record);

    List<NoticeNum> selectByExample(NoticeNumExample example);

    NoticeNum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NoticeNum record, @Param("example") NoticeNumExample example);

    int updateByExample(@Param("record") NoticeNum record, @Param("example") NoticeNumExample example);

    int updateByPrimaryKeySelective(NoticeNum record);

    int updateByPrimaryKey(NoticeNum record);
}