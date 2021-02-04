package com.sjy.OA_Sys.biz.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sjy.OA_Sys.bean.ImportLog;
import com.sjy.OA_Sys.bean.ImportLogExample;
import com.sjy.OA_Sys.bean.ImportLogExample.Criteria;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.biz.ImportLogBiz;
import com.sjy.OA_Sys.dao.ImportLogMapper;

@Service
public class ImportLogBizImpl implements ImportLogBiz {

	@Resource
	private ImportLogMapper ilm;
	
	private ImportLogExample ile = new ImportLogExample();
	
	@Override
	public List<ImportLog> findImportLog(ImportLog importLog, Timestamp arterTime) {
		try {
			Criteria criteria = ile.createCriteria();
			if(importLog!=null) {
				if(importLog.getLogId()!=null) {
					criteria.andLogIdEqualTo(importLog.getLogId());
				}
				if(importLog.getId()!=null) {
					criteria.andIdEqualTo(importLog.getId());
				}
				if(importLog.getLogTime()!=null && arterTime != null) {
					criteria.andLogTimeBetween(importLog.getLogTime(), arterTime);
				}else if(importLog.getLogTime()!=null && arterTime == null) {
					criteria.andLogTimeBetween(importLog.getLogTime(),new Timestamp(System.currentTimeMillis()));
				}
			}
			
			return ilm.selectByExample(ile);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ile.clear();
		}
		return null;
	}

	@Override
	public Result upDateImportLog(ImportLog importLog) {
		ile.createCriteria().andIdEqualTo(importLog.getId());
		int code = ilm.updateByExampleSelective(importLog, ile);
		ile.clear();
		if(code>0) {
			return new Result(1,"修改成功");
		}else {
			return new Result(0,"修改失败");
		}
	}

	@Override
	public Result addImportLog(ImportLog importLog) {
		int code = ilm.insertSelective(importLog);
		if(code>0) {
			return new Result(1,"添加成功");
		}else {
			return new Result(0,"添加失败");
		}
	}

}
