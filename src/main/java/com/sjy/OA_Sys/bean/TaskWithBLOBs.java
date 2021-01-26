package com.sjy.OA_Sys.bean;

import java.sql.Timestamp;

public class TaskWithBLOBs extends Task {
    private String taskDes;

    private String taskReport;

    public TaskWithBLOBs(Integer taskId, String taskName, Timestamp taskTimeStart, Timestamp taskTimeEnd, String taskRateProgress, Integer taskState, Integer taskGroupId, Integer proId, String taskDes, String taskReport) {
        super(taskId, taskName, taskTimeStart, taskTimeEnd, taskRateProgress, taskState, taskGroupId, proId);
        this.taskDes = taskDes;
        this.taskReport = taskReport;
    }

    public TaskWithBLOBs() {
        super();
    }

    public String getTaskDes() {
        return taskDes;
    }

    public void setTaskDes(String taskDes) {
        this.taskDes = taskDes == null ? null : taskDes.trim();
    }

    public String getTaskReport() {
        return taskReport;
    }

    public void setTaskReport(String taskReport) {
        this.taskReport = taskReport == null ? null : taskReport.trim();
    }
}