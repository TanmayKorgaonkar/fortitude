package com.fortitude.dto;


import java.time.LocalDate;
import java.util.Date;

public class InvestDto {
	
	String userId;
	String projectId;
	long investmentAmount;
	float interestPerMonth;
	Date dateOfInvestment;
	boolean isActive;
	
	
	public InvestDto(String userId, String projectId, long investmentAmount, float interestPerMonth,
			Date dateOfInvestment, boolean isActive) {
		super();
		this.userId = userId;
		this.projectId = projectId;
		this.investmentAmount = investmentAmount;
		this.interestPerMonth = interestPerMonth;
		this.dateOfInvestment = dateOfInvestment;
		this.isActive = isActive;
	}
	
	
	public InvestDto() {
		// TODO Auto-generated constructor stub
	}


	public InvestDto(String projectId2, long investmentAmount2, float interestPerMonth2, Date dateOfInvestment2,
			boolean isActive2) {
		this.projectId=projectId2;
		this.investmentAmount=investmentAmount2;
		this.interestPerMonth=interestPerMonth2;
		this.dateOfInvestment=dateOfInvestment2;
		this.isActive=isActive2;
	}


	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public long getInvestmentAmount() {
		return investmentAmount;
	}
	public void setInvestmentAmount(long investmentAmount) {
		this.investmentAmount = investmentAmount;
	}
	public float getInterestPerMonth() {
		return interestPerMonth;
	}
	public void setInterestPerMonth(float interestPerMonth) {
		this.interestPerMonth = interestPerMonth;
	}
	public Date getDateOfInvestment() {
		return dateOfInvestment;
	}
	public void setDateOfInvestment(Date dateOfInvestment) {
		this.dateOfInvestment = dateOfInvestment;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	

}
