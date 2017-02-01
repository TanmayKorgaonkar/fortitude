package com.fortitude.enums;

public enum CategoryEnum {
	REAL_ESTATE("real_estate"),
	TECHNICAL("technical"),
	FINTECH("fintech"),
	RENEWABLE_ENERGY("renewable_energy"),
	DIGITAL_CURRENCIES("digital_currencies"),
	MUSIC("music"),
	FOOD_AND_DINING("food_and_dining"),
	WINES_AND_LIQUOR("wines_and_liquor");
	
	public  String enumString;
	
	CategoryEnum(String enumString){
		this.enumString = enumString;
	}
	
	public String getEnumString(){
		return this.enumString;
	}
	
	
};
