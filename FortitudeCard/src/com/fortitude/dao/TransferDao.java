package com.fortitude.dao;

import java.sql.SQLException;

import com.fortitude.dto.TransferDto;

public interface TransferDao {
	
	public void transferFund(TransferDto transferDto)throws SQLException;

}
