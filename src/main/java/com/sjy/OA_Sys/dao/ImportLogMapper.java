package com.sjy.OA_Sys.dao;

import com.sjy.OA_Sys.bean.ImportLog;
import com.sjy.OA_Sys.bean.ImportLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImportLogMapper {
    long countByExample(ImportLogExample example);

    int deleteByExample(ImportLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImportLog record);

    int insertSelective(ImportLog record);

    List<ImportLog> selectByExampleWithBLOBs(ImportLogExample example);

    List<ImportLog> selectByExample(ImportLogExample example);

    ImportLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImportLog record, @Param("example") ImportLogExample example);

    int updateByExampleWithBLOBs(@Param("record") ImportLog record, @Param("example") ImportLogExample example);

    int updateByExample(@Param("record") ImportLog record, @Param("example") ImportLogExample example);

    int updateByPrimaryKeySelective(ImportLog record);

    int updateByPrimaryKeyWithBLOBs(ImportLog record);

    int updateByPrimaryKey(ImportLog record);
}