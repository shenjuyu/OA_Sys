package com.sjy.OA_Sys.dao;

import com.sjy.OA_Sys.bean.StaffRank;
import com.sjy.OA_Sys.bean.StaffRankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffRankMapper {
    long countByExample(StaffRankExample example);

    int deleteByExample(StaffRankExample example);

    int deleteByPrimaryKey(Integer rankId);

    int insert(StaffRank record);

    int insertSelective(StaffRank record);

    List<StaffRank> selectByExample(StaffRankExample example);

    StaffRank selectByPrimaryKey(Integer rankId);

    int updateByExampleSelective(@Param("record") StaffRank record, @Param("example") StaffRankExample example);

    int updateByExample(@Param("record") StaffRank record, @Param("example") StaffRankExample example);

    int updateByPrimaryKeySelective(StaffRank record);

    int updateByPrimaryKey(StaffRank record);
}