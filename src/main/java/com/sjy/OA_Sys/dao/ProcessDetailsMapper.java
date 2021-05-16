package com.sjy.OA_Sys.dao;

import com.sjy.OA_Sys.bean.ProcessDetails;
import com.sjy.OA_Sys.bean.ProcessDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcessDetailsMapper {
    long countByExample(ProcessDetailsExample example);

    int deleteByExample(ProcessDetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProcessDetails record);

    int insertSelective(ProcessDetails record);

    List<ProcessDetails> selectByExampleWithBLOBs(ProcessDetailsExample example);

    List<ProcessDetails> selectByExample(ProcessDetailsExample example);

    ProcessDetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProcessDetails record, @Param("example") ProcessDetailsExample example);

    int updateByExampleWithBLOBs(@Param("record") ProcessDetails record, @Param("example") ProcessDetailsExample example);

    int updateByExample(@Param("record") ProcessDetails record, @Param("example") ProcessDetailsExample example);

    int updateByPrimaryKeySelective(ProcessDetails record);

    int updateByPrimaryKeyWithBLOBs(ProcessDetails record);

    int updateByPrimaryKey(ProcessDetails record);
}