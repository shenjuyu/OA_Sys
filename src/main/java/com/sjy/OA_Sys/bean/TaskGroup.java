package com.sjy.OA_Sys.bean;

public class TaskGroup {
    private Integer taskGroupId;

    private String taskGroupName;

    private Integer staffId;

    private Integer taskGroupPower;

    public TaskGroup(Integer taskGroupId, String taskGroupName, Integer staffId, Integer taskGroupPower) {
        this.taskGroupId = taskGroupId;
        this.taskGroupName = taskGroupName;
        this.staffId = staffId;
        this.taskGroupPower = taskGroupPower;
    }

    public TaskGroup() {
        super();
    }

    public Integer getTaskGroupId() {
        return taskGroupId;
    }

    public void setTaskGroupId(Integer taskGroupId) {
        this.taskGroupId = taskGroupId;
    }

    public String getTaskGroupName() {
        return taskGroupName;
    }

    public void setTaskGroupName(String taskGroupName) {
        this.taskGroupName = taskGroupName == null ? null : taskGroupName.trim();
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getTaskGroupPower() {
        return taskGroupPower;
    }

    public void setTaskGroupPower(Integer taskGroupPower) {
        this.taskGroupPower = taskGroupPower;
    }
}