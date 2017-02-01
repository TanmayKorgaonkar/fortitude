package com.fortitude.dto;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.fortitude.enums.CategoryEnum;
import com.fortitude.enums.ReturnTypes;

public class ProjectDto {
	
	private String projectId;
	private String projectName;
	private String projectOwner;
	private long projectCost;
	private List<String> projectCategory;
	//private List<CategoryEnum> projectCategory;
	private String projectDetails;
	// External link to the owner's site
	private String projectExternalLink;
	// Minimum Amount that the user can invest
	private long minimumAmountToInvest;
	// Start date of the project
	private String projectStartTime;
	// Scheduled end date of the project
	private String projectScheduledEndTime;
	// Actual end date of the project
	private String projectActualEndTime;
	// Whether the project goal is met
	private boolean isTargetMet;
	// The return that the project is promising
	private Double returnPromised;
	// The return type of the project, viz. Monthly etc.
	private String returnType;
	private long currentInvestment;

	public long getCurrentInvestment() {
		return currentInvestment;
	}
	public void setCurrentInvestment(long currentInvestment) {
		this.currentInvestment = currentInvestment;
	}
	
	//private ReturnTypes returnType;
	
	
	
	public ProjectDto(String projectId, String projectName, String projectOwner, long projectCost,
			List<String> projectCategory, String projectDetails, String projectExternalLink,
			long minimumAmountToInvest, String projectStartTime, String projectScheduledEndTime,
			String projectActualEndTime, boolean isTargetMet, Double returnPromised, String returnType) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectOwner = projectOwner;
		this.projectCost = projectCost;
		this.projectCategory = projectCategory;
		this.projectDetails = projectDetails;
		this.projectExternalLink = projectExternalLink;
		this.minimumAmountToInvest = minimumAmountToInvest;
		this.projectStartTime = projectStartTime;
		this.projectScheduledEndTime = projectScheduledEndTime;
		this.projectActualEndTime = projectActualEndTime;
		this.isTargetMet = isTargetMet;
		this.returnPromised = returnPromised;
		this.returnType = returnType;
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



	public long getProjectCost() {
		return projectCost;
	}



	public void setProjectCost(long projectCost) {
		this.projectCost = projectCost;
	}



	public List<String> getProjectCategory() {
		return projectCategory;
	}



	public void setProjectCategory(List<String> projectCategory) {
		this.projectCategory = projectCategory;
	}



	public String getProjectDetails() {
		return projectDetails;
	}



	public void setProjectDetails(String projectDetails) {
		this.projectDetails = projectDetails;
	}



	public String getProjectExternalLink() {
		return projectExternalLink;
	}



	public void setProjectExternalLink(String projectExternalLink) {
		this.projectExternalLink = projectExternalLink;
	}



	public long getMinimumAmountToInvest() {
		return minimumAmountToInvest;
	}



	public void setMinimumAmountToInvest(long minimumAmountToInvest) {
		this.minimumAmountToInvest = minimumAmountToInvest;
	}



	public String getProjectStartTime() {
		return projectStartTime;
	}



	public void setProjectStartTime(String projectStartTime) {
		this.projectStartTime = projectStartTime;
	}



	public String getProjectScheduledEndTime() {
		return projectScheduledEndTime;
	}



	public void setProjectScheduledEndTime(String projectScheduledEndTime) {
		this.projectScheduledEndTime = projectScheduledEndTime;
	}



	public String getProjectActualEndTime() {
		return projectActualEndTime;
	}



	public void setProjectActualEndTime(String projectActualEndTime) {
		this.projectActualEndTime = projectActualEndTime;
	}



	public boolean isTargetMet() {
		return isTargetMet;
	}



	public void setTargetMet(boolean isTargetMet) {
		this.isTargetMet = isTargetMet;
	}



	public Double getReturnPromised() {
		return returnPromised;
	}



	public void setReturnPromised(Double returnPromised) {
		this.returnPromised = returnPromised;
	}



	public String getReturnType() {
		return returnType;
	}



	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}



	public ProjectDto() {
		// TODO Auto-generated constructor stub
	}
	
	
}
