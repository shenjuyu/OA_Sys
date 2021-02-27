package com.sjy.OA_Sys.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sjy.OA_Sys.bean.PublicAssetsType;
import com.sjy.OA_Sys.bean.PublicAssetsTypeExample;
import com.sjy.OA_Sys.bean.PublicAssetsTypeExample.Criteria;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.dao.PublicAssetsTypeMapper;

@Service
public class PublicAssetsTypeBizImpl implements com.sjy.OA_Sys.biz.PublicAssetsTypeBiz {

	@Resource
	private PublicAssetsTypeMapper patm;
	
	private PublicAssetsTypeExample pate = new PublicAssetsTypeExample();
	
	@Override
	public List<PublicAssetsType> find(PublicAssetsType assetsType) {
		try {
			Criteria criteria = pate.createCriteria();
			if(assetsType!=null) {
				if(assetsType.getId()!=null) {
					criteria.andIdEqualTo(assetsType.getId());
				}
				if(assetsType.getTypeName()!=null) {
					criteria.andTypeNameLike(assetsType.getTypeName());
				}
				if(assetsType.getState()!=null) {
					criteria.andStateEqualTo(assetsType.getState());
				}
			}
			return patm.selectByExample(pate);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			pate.clear();
		}
		return null;
	}

	@Override
	public Result addPublicAssetsType(PublicAssetsType assetsType) {
		int code = patm.insertSelective(assetsType);
		if(code>=1) {
			return new Result(1, "添加成功");
		}
		return new Result(0, "添加失败");
	}

	@Override
	public Result updatePublicAssetsType(PublicAssetsType assetsType) {
		int code = patm.updateByPrimaryKeySelective(assetsType);
		if(code>=1) {
			return new Result(1, "修改成功");
		}
		return new Result(0, "修改失败");
	}

}
