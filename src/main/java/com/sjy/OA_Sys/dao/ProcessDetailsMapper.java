package com.sjy.OA_Sys.dao;

import com.sjy.OA_Sys.bean.Process;
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
    
    List<ProcessDetails> selectByProcessId(Integer processId);
    
    /**
     * 
     * @param approvedStaff 审核人
     * @param approvedResult 审核结果或审核状态
     * @param processApplicant 申请人
     * @param processTaskToStaff 任务转交人
     * @param processType 流程类型
     * @param processTaskSupervise 任务监督人 
     * String approvedStaff, Integer approvedResult,String processApplicant,
     * String processTaskToStaff, Integer processType, String processTaskSupervise
     * @return
     */
    List<ProcessDetails> selectForApprovedStaff(ProcessDetails processDetails,Process process);

    int updateByExampleSelective(@Param("record") ProcessDetails record, @Param("example") ProcessDetailsExample example);

    int updateByExampleWithBLOBs(@Param("record") ProcessDetails record, @Param("example") ProcessDetailsExample example);

    int updateByExample(@Param("record") ProcessDetails record, @Param("example") ProcessDetailsExample example);

    int updateByPrimaryKeySelective(ProcessDetails record);

    int updateByPrimaryKeyWithBLOBs(ProcessDetails record);

    int updateByPrimaryKey(ProcessDetails record);
}