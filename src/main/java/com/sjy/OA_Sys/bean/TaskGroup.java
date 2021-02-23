package com.sjy.OA_Sys.bean;

import java.io.Serializable;

public class TaskGroup implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String taskGroupId;

    private String taskGroupName;

    private String staffId;

    private Integer taskGroupPower;
    
    private Staff groupStaff;

    public TaskGroup(Integer id, String taskGroupId, String taskGroupName, String staffId, Integer taskGroupPower) {
        this.id = id;
        this.taskGroupId = taskGroupId;
        this.taskGroupName = taskGroupName;
        this.staffId = staffId;
        this.taskGroupPower = taskGroupPower;
    }

    public TaskGroup() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskGroupId() {
        return taskGroupId;
    }

    public void setTaskGroupId(String taskGroupId) {
        this.taskGroupId = taskGroupId == null ? null : taskGroupId.trim();
    }

    public String getTaskGroupName() {
        return taskGroupName;
    }

    public void setTaskGroupName(String taskGroupName) {
        this.taskGroupName = taskGroupName == null ? null : taskGroupName.trim();
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public Integer getTaskGroupPower() {
        return taskGroupPower;
    }

    public void setTaskGroupPower(Integer taskGroupPower) {
        this.taskGroupPower = taskGroupPower;
    }

	public Staff getGroupStaff() {
		return groupStaff;
	}

	public void setGroupStaff(Staff groupStaff) {
		this.groupStaff = groupStaff;
	}
}