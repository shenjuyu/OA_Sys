package com.sjy.OA_Sys.dao;

import com.sjy.OA_Sys.bean.Depart;
import com.sjy.OA_Sys.bean.DepartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartMapper {
    long countByExample(DepartExample example);

    int deleteByExample(DepartExample example);

    int deleteByPrimaryKey(Integer departId);

    int insert(Depart record);

    int insertSelective(Depart record);

    List<Depart> selectByExample(DepartExample example);

    Depart selectByPrimaryKey(Integer departId);

    int updateByExampleSelective(@Param("record") Depart record, @Param("example") DepartExample example);

    int updateByExample(@Param("record") Depart record, @Param("example") DepartExample example);

    int updateByPrimaryKeySelective(Depart record);

    int updateByPrimaryKey(Depart record);
}