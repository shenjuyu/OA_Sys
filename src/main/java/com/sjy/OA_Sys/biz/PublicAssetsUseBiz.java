package com.sjy.OA_Sys.biz;

import java.util.List;

import com.sjy.OA_Sys.bean.PublicAssetsUse;
import com.sjy.OA_Sys.bean.Result;

public interface PublicAssetsUseBiz {

	/**
	 * 查找使用记录
	 * 
	 * @param assetsUse
	 * @return
	 */
	List<PublicAssetsUse> findPublicAssetsUse(PublicAssetsUse assetsUse, Integer pageNum, Integer pageSize);

	/**
	 * 根据资产名称或者资产类型查找
	 * @param pubassName
	 * @param pubassType
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	List<PublicAssetsUse> findPublicAssetsUse(String pubassName, Integer pubassType, Integer pageNum, Integer pageSize);

	/**
	 * 添加使用记录
	 * 
	 * @param assetsUse
	 * @return
	 */
	Result addPublicAssetsUse(PublicAssetsUse assetsUse);

	/**
	 * 修改使用记录
	 * 
	 * @param assetsUse
	 * @return
	 */
	Result updatePublicAssetsUse(PublicAssetsUse assetsUse);

}
