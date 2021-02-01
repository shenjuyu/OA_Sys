package com.sjy.OA_Sys.biz;

import java.util.List;

import com.sjy.OA_Sys.bean.PublicAssets;
import com.sjy.OA_Sys.bean.Result;

public interface PublicAssetsBiz {

	/**
	 * 查找公共资产
	 * @param publicAssets
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	List<PublicAssets> findPublicAssets(PublicAssets publicAssets,Integer pageNum,Integer pageSize);
	
	/**
	 * 添加公共资产
	 * @param publicAssets
	 * @return
	 */
	Result addPublicAssets(PublicAssets publicAssets);
	
	/**
	 * 修改公共资产
	 * @param publicAssets
	 * @return
	 */
	Result updatePublicAssets(PublicAssets publicAssets);
	
}
