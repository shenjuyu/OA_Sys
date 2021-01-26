package com.sjy.OA_Sys.bean;

import java.sql.Timestamp;

public class Task {
    private Integer taskId;

    private String taskName;

    private Timestamp taskTimeStart;

    private Timestamp taskTimeEnd;

    private String taskRateProgress;

    private Integer taskState;

    private Integer taskGroupId;

    private Integer proId;

    public Task(Integer taskId, String taskName, Timestamp taskTimeStart, Timestamp taskTimeEnd, String taskRateProgress, Integer taskState, Integer taskGroupId, Integer proId) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskTimeStart = taskTimeStart;
        this.taskTimeEnd = taskTimeEnd;
        this.taskRateProgress = taskRateProgress;
        this.taskState = taskState;
        this.taskGroupId = taskGroupId;
        this.proId = proId;
    }

    public Task() {
        super();
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public Timestamp getTaskTimeStart() {
        return taskTimeStart;
    }

    public void setTaskTimeStart(Timestamp taskTimeStart) {
        this.taskTimeStart = taskTimeStart;
    }

    public Timestamp getTaskTimeEnd() {
        return taskTimeEnd;
    }

    public void setTaskTimeEnd(Timestamp taskTimeEnd) {
        this.taskTimeEnd = taskTimeEnd;
    }

    public String getTaskRateProgress() {
        return taskRateProgress;
    }

    public void setTaskRateProgress(String taskRateProgress) {
        this.taskRateProgress = taskRateProgress == null ? null : taskRateProgress.trim();
    }

    public Integer getTaskState() {
        return taskState;
    }

    public void setTaskState(Integer taskState) {
        this.taskState = taskState;
    }

    public Integer getTaskGroupId() {
        return taskGroupId;
    }

    public void setTaskGroupId(Integer taskGroupId) {
        this.taskGroupId = taskGroupId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }
}