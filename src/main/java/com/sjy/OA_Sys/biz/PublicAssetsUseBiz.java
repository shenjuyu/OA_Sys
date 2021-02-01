package com.sjy.OA_Sys.biz;

import java.util.List;

import com.sjy.OA_Sys.bean.PublicAssetsUse;
import com.sjy.OA_Sys.bean.Result;

public interface PublicAssetsUseBiz {

	/**
	 * 查找使用记录
	 * @param assetsUse
	 * @return
	 */
	List<PublicAssetsUse> findPublicAssetsUse(PublicAssetsUse assetsUse,Integer pageNum,Integer pageSize);
	
	/**
	 * 添加使用记录
	 * @param assetsUse
	 * @return
	 */
	Result addPublicAssetsUse(PublicAssetsUse assetsUse);
	
	
	/**
	 * 修改使用记录
	 * @param assetsUse
	 * @return
	 */
	Result updatePublicAssetsUse(PublicAssetsUse assetsUse);
	
}
