package com.sjy.OA_Sys.dao;

import com.sjy.OA_Sys.bean.Process;
import com.sjy.OA_Sys.bean.ProcessExample;
import com.sjy.OA_Sys.bean.ProcessWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ProcessMapper {
    long countByExample(ProcessExample example);

    int deleteByExample(ProcessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProcessWithBLOBs record);

    int insertSelective(ProcessWithBLOBs record);

    List<ProcessWithBLOBs> selectByExampleWithBLOBs(ProcessExample example);

    List<Process> selectByExample(ProcessExample example);

    ProcessWithBLOBs selectByPrimaryKey(Integer id);
    
    ProcessWithBLOBs selectByPrimaryKeyForApproved(Integer id);

    int updateByExampleSelective(@Param("record") ProcessWithBLOBs record, @Param("example") ProcessExample example);

    int updateByExampleWithBLOBs(@Param("record") ProcessWithBLOBs record, @Param("example") ProcessExample example);

    int updateByExample(@Param("record") Process record, @Param("example") ProcessExample example);

    int updateByPrimaryKeySelective(ProcessWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ProcessWithBLOBs record);

    int updateByPrimaryKey(Process record);
    
    @Select(value="select AUTO_INCREMENT from information_schema.TABLES where Table_Schema='oa-sys' and table_name='process' LIMIT 1")
    int getAutoIncrement();
}