package com.sjy.OA_Sys.dao;

import com.sjy.OA_Sys.bean.TaskGroup;
import com.sjy.OA_Sys.bean.TaskGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskGroupMapper {
    long countByExample(TaskGroupExample example);

    int deleteByExample(TaskGroupExample example);

    int insert(TaskGroup record);

    int insertSelective(TaskGroup record);

    List<TaskGroup> selectByExample(TaskGroupExample example);

    int updateByExampleSelective(@Param("record") TaskGroup record, @Param("example") TaskGroupExample example);

    int updateByExample(@Param("record") TaskGroup record, @Param("example") TaskGroupExample example);
}