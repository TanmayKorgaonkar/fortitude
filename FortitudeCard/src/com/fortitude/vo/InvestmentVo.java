package com.fortitude.vo;

import java.util.List;

public class InvestmentVo {
	String userId;
	List<String> projectId;
	Double totalInterest;
	long numberOfProjectsInvested;
	Double totalInvestmentsMade;
	public Double getTotalInvestmentsMade() {
		return totalInvestmentsMade;
	}
	public void setTotalInvestmentsMade(Double totalInvestmentsMade) {
		this.totalInvestmentsMade = totalInvestmentsMade;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<String> getProjectId() {
		return projectId;
	}
	public void setProjectId(List<String> projectId) {
		this.projectId = projectId;
	}
	public Double getTotalInterest() {
		return totalInterest;
	}
	public void setTotalInterest(Double totalInterest) {
		this.totalInterest = totalInterest;
	}
	public long getNumberOfProjectsInvested() {
		return numberOfProjectsInvested;
	}
	public void setNumberOfProjectsInvested(long numberOfProjectsInvested) {
		this.numberOfProjectsInvested = numberOfProjectsInvested;
	}
	public InvestmentVo(String userId, List<String> projectId, Double totalInterest, int numberOfProjectsInvested, Double totalInvestmentsMade) {
		super();
		this.userId = userId;
		this.projectId = projectId;
		this.totalInterest = totalInterest;
		this.numberOfProjectsInvested = numberOfProjectsInvested;
		this.totalInvestmentsMade=totalInvestmentsMade;
	}
	public InvestmentVo() {
		// TODO Auto-generated constructor stub
	}

}
