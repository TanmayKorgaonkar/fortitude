package com.fortitude.dto;

import java.time.LocalDate;

public class TransferDto {
	private String fromAccountId;
	private String toAccountId;
	private String message;
	private LocalDate transferTime;
	
	public TransferDto() {
		super();
	}

	public TransferDto(String fromAccountId, String toAccountId, String message, LocalDate transferTime) {
		super();
		this.fromAccountId = fromAccountId;
		this.toAccountId = toAccountId;
		this.message = message;
		this.transferTime = transferTime;
	}

	public String getFromAccountId() {
		return fromAccountId;
	}

	public void setFromAccountId(String fromAccountId) {
		this.fromAccountId = fromAccountId;
	}

	public String getToAccountId() {
		return toAccountId;
	}

	public void setToAccountId(String toAccountId) {
		this.toAccountId = toAccountId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDate getTransferTime() {
		return transferTime;
	}

	public void setTransferTime(LocalDate transferTime) {
		this.transferTime = transferTime;
	}

}
