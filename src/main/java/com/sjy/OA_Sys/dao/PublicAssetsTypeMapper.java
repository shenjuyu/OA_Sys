package com.sjy.OA_Sys.dao;

import com.sjy.OA_Sys.bean.PublicAssetsType;
import com.sjy.OA_Sys.bean.PublicAssetsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublicAssetsTypeMapper {
    long countByExample(PublicAssetsTypeExample example);

    int deleteByExample(PublicAssetsTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PublicAssetsType record);

    int insertSelective(PublicAssetsType record);

    List<PublicAssetsType> selectByExample(PublicAssetsTypeExample example);

    PublicAssetsType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PublicAssetsType record, @Param("example") PublicAssetsTypeExample example);

    int updateByExample(@Param("record") PublicAssetsType record, @Param("example") PublicAssetsTypeExample example);

    int updateByPrimaryKeySelective(PublicAssetsType record);

    int updateByPrimaryKey(PublicAssetsType record);
}