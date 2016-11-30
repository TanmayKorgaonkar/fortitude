package com.fortitude.dto;

import java.time.LocalDate;

public class LoginDto {
	
	private String id;
	private String password;
	private LocalDate time;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getTime() {
		return time;
	}
	public void setTime(LocalDate time) {
		this.time = time;
	}

}
