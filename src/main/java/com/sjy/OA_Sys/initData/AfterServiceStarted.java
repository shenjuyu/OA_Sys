package com.sjy.OA_Sys.initData;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sjy.OA_Sys.bean.Depart;
import com.sjy.OA_Sys.bean.Mail;
import com.sjy.OA_Sys.bean.Project;
import com.sjy.OA_Sys.bean.PublicAssets;
import com.sjy.OA_Sys.bean.PublicAssetsType;
import com.sjy.OA_Sys.bean.Task;
import com.sjy.OA_Sys.biz.impl.DepartBizImpl;
import com.sjy.OA_Sys.biz.impl.MailBizImpl;
import com.sjy.OA_Sys.biz.impl.ProjectBizImpl;
import com.sjy.OA_Sys.biz.impl.PublicAssetsBizImpl;
import com.sjy.OA_Sys.biz.impl.PublicAssetsTypeBizImpl;
import com.sjy.OA_Sys.biz.impl.TaskBizImpl;
import com.sjy.OA_Sys.util.RedisUtil;

@Service
public class AfterServiceStarted implements ApplicationRunner {

	@Resource
	private MailBizImpl mbi;
	@Resource
	private ProjectBizImpl pbi;
	@Resource
	private TaskBizImpl tbi;
	@Resource
	private DepartBizImpl dbi;
	@Resource
	private PublicAssetsBizImpl pabi;
	@Resource
	private PublicAssetsTypeBizImpl patbi;
	@Resource
	private RedisUtil redisUtil;
	@Resource
	private ObjectMapper mapper;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// 初始化邮箱编码
		Mail mail = mbi.findLastMail();
		if (mail == null) {
			redisUtil.set("emailCodeNumTody", 0);
		} else {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
			Date date = new Date(System.currentTimeMillis());
			int nowEmailCode = Integer.parseInt(formatter.format(date));
			String emailCodeNumTody = mail.getMailId();
			int emailCodePre = Integer.parseInt(emailCodeNumTody.substring(0, 8));

			if (emailCodePre < nowEmailCode) {
				redisUtil.set("emailCodeNumTody", 0);
			} else {
				emailCodeNumTody = emailCodeNumTody.substring(8);
				redisUtil.set("emailCodeNumTody", Integer.parseInt(emailCodeNumTody));
			}
		}

		// 初始化项目编码
		Project project = pbi.findLastPro();
		if (project == null) {
			redisUtil.set("projectCodeNumTody", 0);
		} else {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
			Date date = new Date(System.currentTimeMillis());
			int nowProjectCode = Integer.parseInt(formatter.format(date));
			String projectCodeNumTody = project.getProId();
			int projectCodePre = Integer.parseInt(projectCodeNumTody.substring(0, 8));

			if (projectCodePre < nowProjectCode) {
				redisUtil.set("projectCodeNumTody", 0);
			} else {
				projectCodeNumTody = projectCodeNumTody.substring(8);
				redisUtil.set("projectCodeNumTody", Integer.parseInt(projectCodeNumTody));
			}
		}

		// 初始化任务编码
		Task task = tbi.findLastTask();
		if (task == null) {
			redisUtil.set("taskCodeNumTody", 0);
		} else {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
			Date date = new Date(System.currentTimeMillis());
			int nowTaskCode = Integer.parseInt(formatter.format(date));
			String taskCodeNumTody = task.getTaskId();
			int taskCodePre = Integer.parseInt(taskCodeNumTody.substring(0, 8));

			if (taskCodePre < nowTaskCode) {
				redisUtil.set("taskCodeNumTody", 0);
			} else {
				taskCodeNumTody = taskCodeNumTody.substring(8);
				redisUtil.set("taskCodeNumTody", Integer.parseInt(taskCodeNumTody));
			}
		}

		// 初始化任务编码
		PublicAssets publicAssets = pabi.findLastPublicAssets();
		if (publicAssets == null) {
			redisUtil.set("publicAssetsCodeNumTody", 0);
		} else {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
			Date date = new Date(System.currentTimeMillis());
			int nowPublicAssetsCode = Integer.parseInt(formatter.format(date));
			String publicAssetsCodeNumTody = publicAssets.getPubassId();
			int publicAssetsCodePre = Integer.parseInt(publicAssetsCodeNumTody.substring(0, 8));

			if (publicAssetsCodePre < nowPublicAssetsCode) {
				redisUtil.set("publicAssetsCodeNumTody", 0);
			} else {
				publicAssetsCodeNumTody = publicAssetsCodeNumTody.substring(8);
				redisUtil.set("publicAssetsCodeNumTody", Integer.parseInt(publicAssetsCodeNumTody));
			}
		}

		// 初始化部门信息
		List<Depart> departs = dbi.findDepart(null);
		redisUtil.set("departCache", mapper.writeValueAsString(departs));

		// 初始化资产类型信息
		List<PublicAssetsType> assetsTypes = patbi.find(null);
		redisUtil.set("assetsTypeCache", mapper.writeValueAsString(assetsTypes));
	}

}
