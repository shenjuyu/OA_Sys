package com.sjy.OA_Sys.biz;

import java.sql.Timestamp;
import java.util.List;

import com.sjy.OA_Sys.bean.ImportLog;
import com.sjy.OA_Sys.bean.Result;

public interface ImportLogBiz {

	/**
	 * 查找日志
	 * @param importLog  时间：beforeTime
	 * @param arterTime
	 * @return
	 */
	List<ImportLog> findImportLog(ImportLog importLog,Timestamp arterTime);
	
	/**
	 * 更新日志
	 * @param importLog
	 * @return
	 */
	Result upDateImportLog(ImportLog importLog);
	
	/**
	 * 新增日志
	 * @param importLog
	 * @return
	 */
	Result addImportLog(ImportLog importLog);
}
