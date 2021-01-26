package com.sjy.OA_Sys.dao;

import com.sjy.OA_Sys.bean.AttSheet;
import com.sjy.OA_Sys.bean.AttSheetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttSheetMapper {
    long countByExample(AttSheetExample example);

    int deleteByExample(AttSheetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AttSheet record);

    int insertSelective(AttSheet record);

    List<AttSheet> selectByExample(AttSheetExample example);

    AttSheet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AttSheet record, @Param("example") AttSheetExample example);

    int updateByExample(@Param("record") AttSheet record, @Param("example") AttSheetExample example);

    int updateByPrimaryKeySelective(AttSheet record);

    int updateByPrimaryKey(AttSheet record);
}