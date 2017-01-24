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
	private List<CategoryEnum> projectCategory;
	private String projectDetails;
	// External link to the owner's site
	private String projectExternalLink;
	// Minimum Amount that the user can invest
	private long minimumAmountToInvest;
	// Start date of the project
	private Date projectStartTime;
	// Scheduled end date of the project
	private Date projectScheduledEndTime;
	// Actual end date of the project
	private Date projectActualEndTime;
	// Whether the project goal is met
	private boolean isTargetMet;
	// The return that the project is promising
	private Double returnPromised;
	// The return type of the project, viz. Monthly etc.
	private ReturnTypes returnType;
	
	private long currentInvestment;

	public long getCurrentInvestment() {
		return currentInvestment;
	}
	public void setCurrentInvestment(long currentInvestment) {
		this.currentInvestment = currentInvestment;
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
	public List<CategoryEnum> getProjectCategory() {
		return projectCategory;
	}
	public void setProjectCategory(List<CategoryEnum> projectCategory) {
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
	public Date getProjectStartTime() {
		return projectStartTime;
	}
	public void setProjectStartTime(Date projectStartTime) {
		this.projectStartTime = projectStartTime;
	}
	public Date getProjectScheduledEndTime() {
		return projectScheduledEndTime;
	}
	public void setProjectScheduledEndTime(Date projectScheduledEndTime) {
		this.projectScheduledEndTime = projectScheduledEndTime;
	}
	public Date getProjectActualEndTime() {
		return projectActualEndTime;
	}
	public void setProjectActualEndTime(Date projectActualEndTime) {
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
	public ReturnTypes getReturnType() {
		return returnType;
	}
	public void setReturnType(ReturnTypes returnType) {
		this.returnType = returnType;
	}
	public ProjectDto(String projectId, String projectName, String projectOwner, long projectCost,
			List<CategoryEnum> projectCategory, String projectDetails, String projectExternalLink,
			long minimumAmountToInvest, Date projectStartTime, Date projectScheduledEndTime, Date projectActualEndTime,
			boolean isTargetMet, Double returnPromised, ReturnTypes returnType) {
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
	public ProjectDto() {
		// TODO Auto-generated constructor stub
	}
	
	
}
