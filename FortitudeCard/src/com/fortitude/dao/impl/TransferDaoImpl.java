package com.fortitude.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.fortitude.dao.TransferDao;
import com.fortitude.dto.TransferDto;

public class TransferDaoImpl implements TransferDao{
	
	DataSource dataSource;
	
	public DataSource getDataSource(){
		return this.dataSource;
	}
	
	public void setDataSource(DataSource dataSource){
		this.dataSource = dataSource;
	}

	@Override
	public void transferFund(TransferDto transferDto) throws SQLException {
		try{
			Connection connection = dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(ADD_FUND);
			preparedStatement.setString(1, transferDto.getFromAccountId());
			preparedStatement.setString(2, transferDto.getToAccountId());
			preparedStatement.setLong(3, transferDto.getTransferAmount());
			preparedStatement.setString(4, transferDto.getMessage());
			preparedStatement.executeUpdate();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	private static final String ADD_FUND = "INSERT INTO transfer (from_account_id, to_account_id, transfer_amount, message) values (?,?,?,?)";
}
