package com.sjy.OA_Sys.biz.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.sjy.OA_Sys.bean.PublicAssets;
import com.sjy.OA_Sys.bean.PublicAssetsType;
import com.sjy.OA_Sys.bean.PublicAssetsUse;
import com.sjy.OA_Sys.bean.PublicAssetsUseExample;
import com.sjy.OA_Sys.bean.PublicAssetsUseExample.Criteria;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.biz.PublicAssetsUseBiz;
import com.sjy.OA_Sys.dao.PublicAssetsTypeMapper;
import com.sjy.OA_Sys.dao.PublicAssetsUseMapper;

@Service
public class PublicAssetsUseBizImpl implements PublicAssetsUseBiz {

	@Resource
	private PublicAssetsUseMapper paum;
	
	@Resource
	private PublicAssetsBizImpl pabi;
	
	private PublicAssetsUseExample paue = new PublicAssetsUseExample();
	
	@Override
	public List<PublicAssetsUse> findPublicAssetsUse(PublicAssetsUse assetsUse,Integer pageNum,Integer pageSize) {
		try {
			Criteria criteria = paue.createCriteria();
			if(assetsUse!=null) {
				if(assetsUse.getPubassId()!=null) {
					criteria.andPubassIdEqualTo(assetsUse.getPubassId());
				}
				if(assetsUse.getStaffId()!=null) {
					criteria.andStaffIdEqualTo(assetsUse.getStaffId());
				}
				if(assetsUse.getId()!=null) {
					criteria.andIdEqualTo(assetsUse.getId());
				}
				if(assetsUse.getUseState()!=null) {
					criteria.andUseStateEqualTo(assetsUse.getUseState());
				}
			}
			
			if(pageNum!=null && pageSize!=null) {
				PageHelper.startPage(pageNum, pageSize);
				return paum.selectByExample(paue);
			}
			return paum.selectByExample(paue);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			paue.clear();
		}
		return null;
	}
	

	@Override
	public List<PublicAssetsUse> findPublicAssetsUse(String pubassName, Integer pubassType, Integer pageNum,
			Integer pageSize) {
		try {
			PublicAssets publicAssets = new PublicAssets();
			publicAssets.setPubassName(pubassName);
			if(pubassType!=null && pubassType != 0) {
				publicAssets.setPubassType(pubassType);
			}
			List<PublicAssets> assetList = pabi.findPublicAssets(publicAssets, null, null);
			List<String> values=null;
			if(assetList!=null && assetList.size()>0) {
				values=new ArrayList<String>();
				for (int i=0;i<assetList.size();i++) {
					values.add(assetList.get(i).getPubassId());
				}
			}
			
			if(values!=null && values.size()>0) {
				paue.createCriteria().andPubassIdIn(values);
			}
			
			if(pageNum!=null && pageSize!=null) {
				PageHelper.startPage(pageNum, pageSize);
				return paum.selectByExample(paue);
			}else {
				return paum.selectByExample(paue);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			paue.clear();
		}
		return null;
	}

	@Override
	public Result addPublicAssetsUse(PublicAssetsUse assetsUse) {
		int code = paum.insertSelective(assetsUse);
		if(code>0) {
			return new Result(1, "添加成功");
		}else {
			return new Result(0, "添加失败");
		}
	}

	@Override
	public Result updatePublicAssetsUse(PublicAssetsUse assetsUse) {
		paue.createCriteria()
			.andPubassIdEqualTo(assetsUse.getPubassId());
		int code = paum.updateByExampleSelective(assetsUse, paue);
		paue.clear();
		if(code>0) {
			return new Result(1, "修改成功");
		}else {
			return new Result(0, "修改失败");
		}
	}

}
