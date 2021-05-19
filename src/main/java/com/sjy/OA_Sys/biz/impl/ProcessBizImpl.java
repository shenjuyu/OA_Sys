package com.sjy.OA_Sys.biz.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.sjy.OA_Sys.bean.Process;
import com.sjy.OA_Sys.bean.ProcessDetails;
import com.sjy.OA_Sys.bean.ProcessExample;
import com.sjy.OA_Sys.bean.ProcessExample.Criteria;
import com.sjy.OA_Sys.bean.ProcessWithBLOBs;
import com.sjy.OA_Sys.bean.Result;
import com.sjy.OA_Sys.bean.Staff;
import com.sjy.OA_Sys.bean.StaffRank;
import com.sjy.OA_Sys.biz.ProcessBiz;
import com.sjy.OA_Sys.dao.ProcessMapper;

@Service
public class ProcessBizImpl implements ProcessBiz {

	@Resource
	private StaffBizImpl sbi;
	@Resource
	private ProcessDetailsBizImpl pdbi;
	
	@Resource
	private ProcessMapper pm;
	
	private ProcessExample pe = new ProcessExample();

	@Override
	public List<ProcessWithBLOBs> findProcess(Process process, Integer pageNum, Integer pageSize) {
		try {
			Criteria ce = pe.createCriteria();
			if (process != null) {
				if (process.getId() != null) {
					ce.andIdEqualTo(process.getId());
				}
				if (process.getProcessType() != null) {
					ce.andProcessTypeEqualTo(process.getProcessType());
				}
				if (process.getProcessFinish() != null) {
					ce.andProcessFinishEqualTo(process.getProcessFinish());
				}
				if (process.getProcessTaskSupervise() != null) {
					ce.andProcessTaskSuperviseEqualTo(process.getProcessTaskSupervise());
				}
				if (process.getProcessTaskToStaff() != null) {
					ce.andProcessTaskToStaffEqualTo(process.getProcessTaskToStaff());
				}
			}

			if (pageNum != null && pageSize != null) {
				PageHelper.startPage(pageNum, pageSize);
				return pm.selectByExampleWithBLOBs(pe);
			}
			return pm.selectByExampleWithBLOBs(pe);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pe.clear();
		}

		return null;
	}

	@Override
	public Result updateOrAddProcess(List<ProcessWithBLOBs> processWithBLOBsList, Staff loginStaff) {
		int flag = 0;
		for (ProcessWithBLOBs processWithBLOBs : processWithBLOBsList) {
			if (processWithBLOBs.getId() == null) { // 新增
				Result processAddResult=null;
				
				// 创建流程详情
				// 1 请假 2 销假 3 出差 4 离职
				// 普通员工需M1~M3同意即可，P4及以上或M1级别的需要M4~M5同时同意才可进行
				
				// 然后让其部门中的M1 M2 M3分别同意该员工的申请
				
				
				// 若员工职级为P或M且级别为4或1及以上，则M4及M5级别的人员参与审核
				// 获取流程的下一个自增主键的值
				int autoIncrement = pm.getAutoIncrement();
				
				// 建立M1~M5的list集合
				List<Staff> staffForM1List = new ArrayList<Staff>();
				List<Staff> staffForM2List = new ArrayList<Staff>();
				List<Staff> staffForM3List = new ArrayList<Staff>();
				List<Staff> staffForM4List = new ArrayList<Staff>();
				List<Staff> staffForM5List = new ArrayList<Staff>();
				
				// 分别查询申请人同部门的职级为M的员工,并分组
				Staff tempStaff = new Staff();
				tempStaff.setDepartId(loginStaff.getDepartId());
				List<Staff> staffList = sbi.findStaff(tempStaff, null, null);// 查找同部门所有员工
				
				for (Staff tempStaffToFor : staffList) {
					StaffRank staffRank = tempStaffToFor.getStaffRank();
					if (staffRank.getRankSequence().equalsIgnoreCase("M")) {
						switch (staffRank.getRankSequenceLevel()) {
						case 1:
							staffForM1List.add(tempStaffToFor);
							break;
						case 2:
							staffForM2List.add(tempStaffToFor);
							break;
						case 3:
							staffForM3List.add(tempStaffToFor);
							break;
						case 4:
							staffForM4List.add(tempStaffToFor);
							break;
						case 5:
							staffForM5List.add(tempStaffToFor);
							break;
						default:
							break;
						}
					}
				}
				
				// 如果员工职级类型为P 且级别为3及以下
				if (loginStaff.getStaffRank().getRankSequence().equalsIgnoreCase("P")
						&& loginStaff.getStaffRank().getRankSequenceLevel() <= 3) {
					// 职级为同一级的为一阶段，阶段数从低至高，M1为第一阶段，M2为第二阶段，M3为第三阶段
					// 所有M1~M3的员工均需参加评审
					ProcessDetails processDetails = null;
					List<ProcessDetails> processDetailsList = new ArrayList<ProcessDetails>();
					for(Staff staffM1: staffForM1List) {
						processDetails = new ProcessDetails();
						processDetails.setApprovedResult(0); // 审核结果 0 未审批，1 同意，2 不同意
						processDetails.setApprovedStaff(staffM1.getStaffId()); // 审核人员
						processDetails.setProcessId(autoIncrement); // 流程编号
						processDetails.setProcessStage(1); // 流程阶段
						
						processDetailsList.add(processDetails);
					}
					for(Staff staffM2: staffForM2List) {
						processDetails = new ProcessDetails();
						processDetails.setApprovedResult(0); // 审核结果 0 未审批，1 同意，2 不同意
						processDetails.setApprovedStaff(staffM2.getStaffId()); // 审核人员
						processDetails.setProcessId(autoIncrement); // 流程编号
						processDetails.setProcessStage(2); // 流程阶段
						
						processDetailsList.add(processDetails);
					}
					for(Staff staffM3: staffForM3List) {
						processDetails = new ProcessDetails();
						processDetails.setApprovedResult(0); // 审核结果 0 未审批，1 同意，2 不同意
						processDetails.setApprovedStaff(staffM3.getStaffId()); // 审核人员
						processDetails.setProcessId(autoIncrement); // 流程编号
						processDetails.setProcessStage(3); // 流程阶段
						
						processDetailsList.add(processDetails);
					}
					
					processAddResult = pdbi.updateOrAddProcessDetails(processDetailsList);

				} else {
					// 职级为同一级的为一阶段，阶段数从低至高，M4为第一阶段，M5为第二阶段
					// 所有M4~M5的员工均需参加评审
					ProcessDetails processDetails = null;
					List<ProcessDetails> processDetailsList = new ArrayList<ProcessDetails>();
					for(Staff staffM4: staffForM4List) {
						processDetails = new ProcessDetails();
						processDetails.setApprovedResult(0); // 审核结果 0 未审批，1 同意，2 不同意
						processDetails.setApprovedStaff(staffM4.getStaffId()); // 审核人员
						processDetails.setProcessId(autoIncrement); // 流程编号
						processDetails.setProcessStage(1); // 流程阶段
						
						processDetailsList.add(processDetails);
					}
					for(Staff staffM5: staffForM5List) {
						processDetails = new ProcessDetails();
						processDetails.setApprovedResult(0); // 审核结果 0 未审批，1 同意，2 不同意
						processDetails.setApprovedStaff(staffM5.getStaffId()); // 审核人员
						processDetails.setProcessId(autoIncrement); // 流程编号
						processDetails.setProcessStage(2); // 流程阶段
						
						processDetailsList.add(processDetails);
					}
					
					processAddResult = pdbi.updateOrAddProcessDetails(processDetailsList);
				}
				if(processAddResult.getSucess()==0) {
					return processAddResult;
				}
				flag += pm.insert(processWithBLOBs);
			} else { // 修改
				flag += pm.updateByPrimaryKeyWithBLOBs(processWithBLOBs);
			}
		}
		if (flag >= processWithBLOBsList.size()) {
			return new Result(1, "成功");
		} else {
			return new Result(1, "失败");
		}
	}

	@Override
	public Result delProcess(String[] ids) {
		int flag = 0;
		for (String string : ids) {
			flag += pm.deleteByPrimaryKey(Integer.parseInt(string));
		}
		if (flag >= ids.length) {
			return new Result(1, "成功");
		} else {
			return new Result(1, "失败");
		}
	}

}
