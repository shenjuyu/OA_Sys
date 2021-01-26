package com.sjy.OA_Sys.dao;

import com.sjy.OA_Sys.bean.PublicAssetsUse;
import com.sjy.OA_Sys.bean.PublicAssetsUseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublicAssetsUseMapper {
    long countByExample(PublicAssetsUseExample example);

    int deleteByExample(PublicAssetsUseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PublicAssetsUse record);

    int insertSelective(PublicAssetsUse record);

    List<PublicAssetsUse> selectByExample(PublicAssetsUseExample example);

    PublicAssetsUse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PublicAssetsUse record, @Param("example") PublicAssetsUseExample example);

    int updateByExample(@Param("record") PublicAssetsUse record, @Param("example") PublicAssetsUseExample example);

    int updateByPrimaryKeySelective(PublicAssetsUse record);

    int updateByPrimaryKey(PublicAssetsUse record);
}