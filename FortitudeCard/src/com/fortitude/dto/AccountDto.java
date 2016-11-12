package com.fortitude.dto;

import java.util.Date;

public class AccountDto {
	
	private String accountId;
	private String accountName;
	private String accountNickName;
	private long rank;
	private Date dateOfBirth;
	private String gender;
	private String mobileNumber;
	private String country;
	private String email;
	private String liteCoinAddress;
	private String sponsorLink;
	private long totalEarnings;
	public AccountDto(String accountId, String accountName, String accountNickName, long rank, 
			Date dateOfBirth, String gender, String mobileNumber, String country, String email,
			String liteCoinAddress, String sponsorLink, long totalEarnings) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountNickName = accountNickName;
		this.rank = rank;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.country = country;
		this.email = email;
		this.liteCoinAddress = liteCoinAddress;
		this.sponsorLink = sponsorLink;
		this.totalEarnings = totalEarnings;
	}
	
	
	
	public AccountDto() {
		super();
	}



	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountNickName() {
		return accountNickName;
	}
	public void setAccountNickName(String accountNickName) {
		this.accountNickName = accountNickName;
	}
	public long getRank() {
		return rank;
	}
	public void setRank(long rank) {
		this.rank = rank;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLiteCoinAddress() {
		return liteCoinAddress;
	}
	public void setLiteCoinAddress(String liteCoinAddress) {
		this.liteCoinAddress = liteCoinAddress;
	}
	public String getSponsorLink() {
		return sponsorLink;
	}
	public void setSponsorLink(String sponsorLink) {
		this.sponsorLink = sponsorLink;
	}
	public long getTotalEarnings() {
		return totalEarnings;
	}
	public void setTotalEarnings(long totalEarnings) {
		this.totalEarnings = totalEarnings;
	}
}
