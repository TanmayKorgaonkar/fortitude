package com.fortitude.enums;

public enum ReturnTypes {
	MONTHLY("monthly"),
	TWO_MONTHS("two_months"),
	SEMI_ANNUAL("semi_annual"),
	HALF_YEAR("half_year"),
	YEARLY("yearly");
	
	public String returnTypes;
	
	ReturnTypes(String returnTypes){
		this.returnTypes=returnTypes;
	}
	
	public String getReturnTypes(){
		return this.returnTypes;
	}
}
