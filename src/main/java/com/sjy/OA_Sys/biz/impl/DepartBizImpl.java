package com.sjy.OA_Sys.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sjy.OA_Sys.bean.Depart;
import com.sjy.OA_Sys.bean.DepartExample;
import com.sjy.OA_Sys.bean.DepartExample.Criteria;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.dao.DepartMapper;

@Service
public class DepartBizImpl implements com.sjy.OA_Sys.biz.DepartBiz {

	@Resource
	private DepartMapper dm;
	
	private DepartExample de = new DepartExample();
	
	@Override
	public List<Depart> findDepart(Depart depart) {
		try {
			Criteria criteria = de.createCriteria();
			if(depart!=null) {
				if(depart.getDepartId()!=null) {
					criteria.andDepartIdEqualTo(depart.getDepartId());
				}
				if(depart.getDepartAddr()!=null) {
					criteria.andDepartAddrEqualTo(depart.getDepartAddr());
				}
				if(depart.getDepartName()!=null) {
					criteria.andDepartNameLike(depart.getDepartName());
				}
			}
			
			return dm.selectByExample(de);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			de.clear();
		}
		return null;
	}

	@Override
	public Result upDateDepart(Depart depart) {
		de.createCriteria().andDepartIdEqualTo(depart.getDepartId());
		int code = dm.updateByExampleSelective(depart, de);
		de.clear();
		if(code>0) {
			return new Result(1,"修改成功");
		}else {
			return new Result(0,"修改失败");
		}
	}

	@Override
	public Result addDepart(Depart de) {
		int code = dm.insertSelective(de);
		if(code>0) {
			return new Result(1,"添加成功");
		}else {
			return new Result(0,"添加失败");
		}
	}

}
