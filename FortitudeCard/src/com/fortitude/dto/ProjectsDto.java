package com.fortitude.dto;

public class ProjectsDto {
	private String projectId;
	private String projectName;
	private String projectOwner;
	private Long projectAmount;
	public ProjectsDto(String projectId, String projectName, String projectOwner, Long projectAmount) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectOwner = projectOwner;
		this.projectAmount = projectAmount;
	}
	public ProjectsDto() {
		super();
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectOwner() {
		return projectOwner;
	}
	public void setProjectOwner(String projectOwner) {
		this.projectOwner = projectOwner;
	}
	public Long getProjectAmount() {
		return projectAmount;
	}
	public void setProjectAmount(Long projectAmount) {
		this.projectAmount = projectAmount;
	}

}
