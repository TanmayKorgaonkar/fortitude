package com.fortitude.dto;

import java.util.Date;

public class AccountDto {
	
	private String accountId;
	private String accountFirstName;
	private String accountLastName;
	private String accountNickName;
	private long rank;
	private String dateOfBirth;
	private String gender;
	private String mobileNumber;
	private String country;
	private String email;
	private String liteCoinAddress;
	private String sponsorLink;
	private long totalEarnings;
	private String accountPassword;
	private String passwordConfirmation;
	private String userRole;
	
	/*public AccountDto(String tempDtoId){
	if(tempDtoId=="dto1"){
		this.accountId = "145-485-1548";
		this.accountName = "Tanmay Korgaonkar";
		this.accountNickName = "Tanu";
		this.rank = 2;
		this.dateOfBirth = new Date("12/06/1992");
		this.gender = "Male";
		this.mobileNumber = "8082180301";
		this.country = "India";
		this.email = "5utanmay@gmail.com";
		this.liteCoinAddress = "fucking dont know";
		this.sponsorLink = "fuck sponsors";
		this.totalEarnings = 5000;
	}else if(tempDtoId=="dto2"){
		
	}
	
	}
*/	
		
	public AccountDto() {
		super();
	}

	public AccountDto(String accountId, String accountFirstName, String accountLastName, String accountNickName,
			long rank, String dateOfBirth, String gender, String mobileNumber, String country, String email,
			String liteCoinAddress, String sponsorLink, long totalEarnings, String accountPassword, String passwordConfirmation, String userRole) {
		super();
		this.accountId = accountId;
		this.accountFirstName = accountFirstName;
		this.accountLastName = accountLastName;
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
		this.accountPassword = accountPassword;
		this.passwordConfirmation=passwordConfirmation;
		this.userRole=userRole;
	}
	public AccountDto(String accountId, String accountFirstName, String accountLastName, String accountNickName,
			long rank, String dateOfBirth, String gender, String mobileNumber, String country, String email,
			String liteCoinAddress, String sponsorLink, long totalEarnings, String userRole) {
		super();
		this.accountId = accountId;
		this.accountFirstName = accountFirstName;
		this.accountLastName = accountLastName;
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
		this.userRole=userRole;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountFirstName() {
		return accountFirstName;
	}

	public void setAccountFirstName(String accountFirstName) {
		this.accountFirstName = accountFirstName;
	}

	public String getAccountLastName() {
		return accountLastName;
	}

	public void setAccountLastName(String accountLastName) {
		this.accountLastName = accountLastName;
	}

	public String getAccountNickName() {
		return accountNickName;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
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

	public String getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}

	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}

	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}
	
	

}
