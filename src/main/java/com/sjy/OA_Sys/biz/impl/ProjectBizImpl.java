package com.sjy.OA_Sys.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.sjy.OA_Sys.bean.Mail;
import com.sjy.OA_Sys.bean.Project;
import com.sjy.OA_Sys.bean.ProjectExample;
import com.sjy.OA_Sys.bean.ProjectExample.Criteria;
import com.sjy.OA_Sys.bean.ProjectWithBLOBs;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.bean.TaskWithBLOBs;
import com.sjy.OA_Sys.biz.ProjectBiz;
import com.sjy.OA_Sys.dao.ProjectMapper;
import com.sjy.OA_Sys.util.CreateSequenceCodeUtil;

@Service
public class ProjectBizImpl implements ProjectBiz {

	@Resource
	private ProjectMapper pm;
	@Resource
	private TaskBizImpl tbi;

	@Resource
	private CreateSequenceCodeUtil codeUtil;
	
	private ProjectExample pe = new ProjectExample();
	
	@Override
	public Result addProject(ProjectWithBLOBs project, List<TaskWithBLOBs> taskWithBLOBs) {
		Result re = null;
		project.setProId(codeUtil.createCode("project"));
		int code = pm.insertSelective(project);
		if(taskWithBLOBs!=null && taskWithBLOBs.size()>0) {
			re = tbi.addTaskForList(taskWithBLOBs,project.getProId());
		}
		if(re.getSucess()==1) {
			code++;
		}
		if(code>=2) {
			return new Result(1,"添加成功");
		}else {
			return new Result(0,"添加失败");
		}
	}

	@Override
	public List<?> findProject(Project project, Boolean withBLOB, Integer pageNum, Integer pageSize) {
		try {
			Criteria criteria = pe.createCriteria();
			if(project!=null) {
				if(project.getId()!=null) {
					criteria.andIdEqualTo(project.getId());
				}
				if(project.getStaffId()!=null) {
					criteria.andStaffIdEqualTo(project.getStaffId());
				}
				if(project.getProName()!=null) {
					criteria.andProNameLike(project.getProName());
				}
				if(project.getProState()!=null) {
					criteria.andProStateEqualTo(project.getProState());
				}
				if(project.getProRateProgress()!=null) {
					criteria.andProRateProgressEqualTo(project.getProRateProgress());
				}
				if(project.getProId()!=null) {
					criteria.andProIdEqualTo(project.getProId());
				}
			}
			
			if(pageNum!=null && pageSize!=null) {
				if(withBLOB) {
					PageHelper.startPage(pageNum, pageSize);
					return pm.selectByExampleWithBLOBs(pe);
				}else {
					return pm.selectByExample(pe);
				}
			}
			if(withBLOB) {
				return pm.selectByExampleWithBLOBs(pe);
			}else {
				return pm.selectByExample(pe);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			pe.clear();
		}
		return null;
	}

	@Override
	public Result updateProject(ProjectWithBLOBs project) {
		pe.createCriteria()
			.andProIdEqualTo(project.getProId());
		int code = pm.updateByExampleSelective(project, pe);
		pe.clear();
		if(code>0) {
			return new Result(1,"更新成功");
		}else {
			return new Result(0,"更新失败");
		}
	}

	@Override
	public Project findLastPro() {
		pe.setOrderByClause("id desc");
		List<Project> projects = pm.selectByExample(pe);
		if(projects.size()<1) {
			return null;
		}
		return projects.get(0);
	}
}
