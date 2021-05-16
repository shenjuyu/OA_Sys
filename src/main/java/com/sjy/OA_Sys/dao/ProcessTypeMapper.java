package com.sjy.OA_Sys.dao;

import com.sjy.OA_Sys.bean.ProcessType;
import com.sjy.OA_Sys.bean.ProcessTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcessTypeMapper {
    long countByExample(ProcessTypeExample example);

    int deleteByExample(ProcessTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProcessType record);

    int insertSelective(ProcessType record);

    List<ProcessType> selectByExample(ProcessTypeExample example);

    ProcessType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProcessType record, @Param("example") ProcessTypeExample example);

    int updateByExample(@Param("record") ProcessType record, @Param("example") ProcessTypeExample example);

    int updateByPrimaryKeySelective(ProcessType record);

    int updateByPrimaryKey(ProcessType record);
}