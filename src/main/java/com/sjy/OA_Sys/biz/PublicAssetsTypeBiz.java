package com.sjy.OA_Sys.biz;

import java.util.List;

import com.sjy.OA_Sys.bean.PublicAssetsType;
import com.sjy.OA_Sys.bean.Result;

public interface PublicAssetsTypeBiz {

	/**
	 * 查询商品类型
	 * @param assetsType
	 * @return
	 */
	public List<PublicAssetsType> find(PublicAssetsType assetsType);
	
	/**
	 * 新增
	 * @param assetsType
	 * @return
	 */
	public Result addPublicAssetsType(PublicAssetsType assetsType);

	/**
	 * 修改
	 * @param assetsType
	 * @return
	 */
	public Result updatePublicAssetsType(PublicAssetsType assetsType);
}
