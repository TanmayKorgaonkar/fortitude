package com.fortitude.dto;

import java.time.LocalDate;

public class TransferDto {
	private String fromAccountId;
	private String toAccountId;
	private long transferAmount;
	private String message;
	private LocalDate transferTime;
	
	public TransferDto() {
		super();
	}

	public TransferDto(String fromAccountId, String toAccountId,long transferAmount, String message, LocalDate transferTime) {
		super();
		this.fromAccountId = fromAccountId;
		this.toAccountId = toAccountId;
		this.transferAmount = transferAmount;
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
	
	public long getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(long transferAmount) {
		this.transferAmount = transferAmount;
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
