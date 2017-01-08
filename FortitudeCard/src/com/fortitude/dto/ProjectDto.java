package com.fortitude.dto;

import java.util.Date;

public class ProjectDto {
	
	private String projectId;
	private String projectName;
	private String projectCategory;
	private String projectCost;
	private String projectDetails;
	private String projectOwner;
	
	
	


	public ProjectDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProjectDto(String projectId, String projectName, String projectCategory, String projectCost,
			String projectDetails, String projectOwner) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectCategory = projectCategory;
		this.projectCost = projectCost;
		this.projectDetails = projectDetails;
		this.projectOwner = projectOwner;
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

	public String getProjectCategory() {
		return projectCategory;
	}

	public void setProjectCategory(String projectCategory) {
		this.projectCategory = projectCategory;
	}

	public String getProjectCost() {
		return projectCost;
	}

	public void setProjectCost(String projectCost) {
		this.projectCost = projectCost;
	}

	public String getProjectDetails() {
		return projectDetails;
	}

	public void setProjectDetails(String projectDetails) {
		this.projectDetails = projectDetails;
	}
		
	public String getProjectOwner() {
		return projectOwner;
	}

	public void setProjectOwner(String projectOwner) {
		this.projectOwner = projectOwner;
	}


	

}
