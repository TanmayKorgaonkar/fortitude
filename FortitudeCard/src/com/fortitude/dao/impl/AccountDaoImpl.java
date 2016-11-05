package com.fortitude.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.fortitude.connection.DatabaseConnection;
import com.fortitude.dao.AccountDao;
import com.fortitude.dto.AccountDto;

public class AccountDaoImpl implements AccountDao{
	
	//1. account_id VARCHAR(45) NOT NULL,
	//2. account_name VARCHAR(45) NOT NULL,
	//3. account_nick_name VARCHAR(45) NOT NULL,
	//4. rank BIGINT,
	//5. date_of_birth DATE NOT NULL, 
	//6. gender VARCHAR(1) NOT NULL,
	//7. mobile_number VARCHAR(16) NOT NULL,
	//8. country VARCHAR(45) NOT NULL,
	//9. email VARCHAR(101) NOT NULL,
	//10. lite_coin_address VARCHAR(1001) NOT NULL,
	//11. sponsor_link VARCHAR(1001) NOT NULL,
	//12. total_earnings BIGINT,
	//PRIMARY KEY(account_id, account_name)
	//Adding db schema with ordering of fields to avoid any mistake in DAO
	
	private Connection connection;
	public AccountDaoImpl(){
		
	}
	
	@Override
	public void addAccount(AccountDto accountDto) {
		SimpleDateFormat format = new SimpleDateFormat( "MM/dd/yyyy" );  
		java.util.Date birthDate = null;
		try {
			birthDate = format.parse(accountDto.getDateOfBirth().toString());
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		java.sql.Date sqlBirthDate = new java.sql.Date( birthDate.getTime()); 
		try{
			connection = DatabaseConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(ADD_USER);
			preparedStatement.setString(1,accountDto.getAccountId());
			preparedStatement.setString(2,accountDto.getAccountName());
			preparedStatement.setString(3,accountDto.getAccountNickName());
			preparedStatement.setLong(4,accountDto.getRank());
			preparedStatement.setDate(5,sqlBirthDate);
			preparedStatement.setString(6,accountDto.getGender());
			preparedStatement.setString(7,accountDto.getMobileNumber());
			preparedStatement.setString(8,accountDto.getCountry());
			preparedStatement.setString(9,accountDto.getEmail());
			preparedStatement.setString(10,accountDto.getLiteCoinAddress());
			preparedStatement.setString(11,accountDto.getSponsorLink());
			preparedStatement.setLong(12,accountDto.getTotalEarnings());
			preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	private static String ADD_USER = "INSERT INTO accounts(account_id, account_name, account_nick_name, rank, date_of_birth, gender, mobile_number,country, email, lite_coin_address, sponsor_link, total_earnings) values (?,?,?,?,?,?,?,?,?,?,?,?)";

}
