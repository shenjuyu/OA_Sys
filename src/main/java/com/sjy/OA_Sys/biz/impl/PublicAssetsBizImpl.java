package com.sjy.OA_Sys.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.sjy.OA_Sys.bean.PublicAssets;
import com.sjy.OA_Sys.bean.PublicAssetsExample;
import com.sjy.OA_Sys.bean.PublicAssetsExample.Criteria;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.biz.PublicAssetsBiz;
import com.sjy.OA_Sys.dao.PublicAssetsMapper;

@Service
public class PublicAssetsBizImpl implements PublicAssetsBiz {

	@Resource
	private PublicAssetsMapper pam;
	
	private PublicAssetsExample pae = new PublicAssetsExample();
	
	@Override
	public List<PublicAssets> findPublicAssets(PublicAssets publicAssets,Integer pageNum,Integer pageSize) {
		try {
			Criteria criteria = pae.createCriteria();
			
			if(publicAssets!=null) {
				if(publicAssets.getPubassId()!=null) {
					criteria.andPubassIdEqualTo(publicAssets.getPubassId());
				}
				if(publicAssets.getPubassName()!=null) {
					criteria.andPubassNameLike(publicAssets.getPubassName());
				}
				if(publicAssets.getPubassType()!=null) {
					criteria.andPubassTypeEqualTo(publicAssets.getPubassType());
				}
				if(publicAssets.getDepartId()!=null) {
					criteria.andDepartIdEqualTo(publicAssets.getDepartId());
				}
			}
			
			if(pageNum!=null && pageSize!=null) {
				PageHelper.startPage(pageNum, pageSize);
				return pam.selectByExampleWithBLOBs(pae);
			}
			return pam.selectByExampleWithBLOBs(pae);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			pae.clear();
		}
		return null;
	}

	@Override
	public Result addPublicAssets(PublicAssets publicAssets) {
		int code = pam.insertSelective(publicAssets);
		if(code>0) {
			return new Result(1,"添加成功");
		}else {
			return new Result(0,"添加失败");
		}
	}

	@Override
	public Result updatePublicAssets(PublicAssets publicAssets) {
		pae.createCriteria().andPubassIdEqualTo(publicAssets.getPubassId());
		int code = pam.updateByExampleSelective(publicAssets, pae);
		pae.clear();
		if(code>0) {
			return new Result(1,"添加成功");
		}else {
			return new Result(0,"添加失败");
		}
	}

}
