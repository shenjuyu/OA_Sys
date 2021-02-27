package com.sjy.OA_Sys.dao;

import com.sjy.OA_Sys.bean.PublicAssets;
import com.sjy.OA_Sys.bean.PublicAssetsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublicAssetsMapper {
    long countByExample(PublicAssetsExample example);

    int deleteByExample(PublicAssetsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PublicAssets record);

    int insertSelective(PublicAssets record);

    List<PublicAssets> selectByExampleWithBLOBs(PublicAssetsExample example);

    List<PublicAssets> selectByExample(PublicAssetsExample example);

    PublicAssets selectByPrimaryKey(Integer id);
    
    PublicAssets selectByPubassId(String pubassId);

    int updateByExampleSelective(@Param("record") PublicAssets record, @Param("example") PublicAssetsExample example);

    int updateByExampleWithBLOBs(@Param("record") PublicAssets record, @Param("example") PublicAssetsExample example);

    int updateByExample(@Param("record") PublicAssets record, @Param("example") PublicAssetsExample example);

    int updateByPrimaryKeySelective(PublicAssets record);

    int updateByPrimaryKeyWithBLOBs(PublicAssets record);

    int updateByPrimaryKey(PublicAssets record);
}