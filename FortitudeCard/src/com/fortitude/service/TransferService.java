package com.fortitude.service;

import java.sql.SQLException;

import com.fortitude.dto.TransferDto;

public interface TransferService {
	
	public void transferFunds(TransferDto transferDto) throws SQLException;

}
