package com.sjy.OA_Sys.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class Task implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String taskId;

    private String taskName;

    private Timestamp taskTimeStart;

    private Timestamp taskTimeEnd;

    private String taskRateProgress;

    private Integer taskState;

    private String taskGroupId;

    private String proId;
    
    private List<TaskGroup> taskGroup;

    public Task(Integer id, String taskId, String taskName, Timestamp taskTimeStart, Timestamp taskTimeEnd, String taskRateProgress, Integer taskState, String taskGroupId, String proId) {
        this.id = id;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
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

    public String getTaskGroupId() {
        return taskGroupId;
    }

    public void setTaskGroupId(String taskGroupId) {
        this.taskGroupId = taskGroupId == null ? null : taskGroupId.trim();
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId == null ? null : proId.trim();
    }

	public List<TaskGroup> getTaskGroup() {
		return taskGroup;
	}

	public void setTaskGroup(List<TaskGroup> taskGroup) {
		this.taskGroup = taskGroup;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", taskId=" + taskId + ", taskName=" + taskName + ", taskTimeStart=" + taskTimeStart
				+ ", taskTimeEnd=" + taskTimeEnd + ", taskRateProgress=" + taskRateProgress + ", taskState=" + taskState
				+ ", taskGroupId=" + taskGroupId + ", proId=" + proId + "]";
	}
    
}