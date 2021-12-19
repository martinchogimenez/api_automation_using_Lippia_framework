package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Hour {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("projectId")
    private String projectId;
    @JsonProperty("assigneeIds")
    private List<String> assigneeIds;
    @JsonProperty("assigneeId")
    private String assigneeId;
    @JsonProperty("userGroupIds")
    private List<String> userGroupIds;
    @JsonProperty("estimate")
    private String estimate;
    @JsonProperty("status")
    private String status;
    @JsonProperty("duration")
    private String duration;
    @JsonProperty("billable")
    private Boolean billable;
    @JsonProperty("hourlyRate")
    private String hourlyRate;
    @JsonProperty("costRate")
    private String costRate;
    @JsonProperty("taskId")
    private String taskId;





    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public List<String> getAssigneeIds() {
        return assigneeIds;
    }

    public void setAssigneeIds(List<String> assigneeIds) {
        this.assigneeIds = assigneeIds;
    }

    public String getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId;
    }

    public List<String> getUserGroupIds() {
        return userGroupIds;
    }

    public void setUserGroupIds(List<String> userGroupIds) {this.userGroupIds = userGroupIds;}

    public String getEstimate() {return estimate;}

    public void setEstimate(String estimate) {
        this.estimate = estimate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Boolean getBillable() {
        return billable;
    }

    public void setBillable(Boolean billable) {this.billable = billable;}

    public String getHourlyRate() {return hourlyRate;}

    public void setHourlyRate(String hourlyRate) {this.hourlyRate = hourlyRate;}

    public String getCostRate() {return costRate;}

    public void setCostRate(String costRate) {
        this.costRate = costRate;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
}
