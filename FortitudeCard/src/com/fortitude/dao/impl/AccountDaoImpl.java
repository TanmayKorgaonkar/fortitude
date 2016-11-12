package com.fortitude.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Spliterators;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;

import com.fortitude.connection.DatabaseConnection;
import com.fortitude.dao.AccountDao;
import com.fortitude.dao.Transaction;
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
	//PRIMARY KEY(account_id, email)
	//Adding db schema with ordering of fields to avoid any mistake in DAO
	
	private Connection connection;
	public AccountDaoImpl(){
		
	}
	
	@Override
	public void addAccount(DatabaseConnection transaction, AccountDto accountDto) {
		SimpleDateFormat format = new SimpleDateFormat( "MM/dd/yyyy" );  
		java.util.Date birthDate = null;
		try {
			birthDate = format.parse(accountDto.getDateOfBirth().toString());
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		java.sql.Date sqlBirthDate = new java.sql.Date( birthDate.getTime()); 
		try{
			connection = transaction.getResource(Connection.class);
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
	
	@Override
	public void deleteAccount(DatabaseConnection transaction, AccountDto accountDto) {
		try{
			connection = transaction.getResource(Connection.class);
			PreparedStatement preparedStatement = connection.prepareStatement(DELETE__USER);
			preparedStatement.setString(1, accountDto.getAccountId());
			preparedStatement.setString(2, accountDto.getAccountName());
			preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	@Override
	public void updateAccount(DatabaseConnection transaction, AccountDto accountDto) {
		SimpleDateFormat format = new SimpleDateFormat( "MM/dd/yyyy" );
		java.util.Date birthDate = null;
		
		try {
			birthDate = format.parse(accountDto.getDateOfBirth().toString());
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		java.sql.Date sqlDate = new java.sql.Date(birthDate.getTime()); 
		
		try{
			connection = transaction.getResource(Connection.class);
			PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER);
			preparedStatement.setString(1,accountDto.getAccountName());
			preparedStatement.setString(2,accountDto.getAccountNickName());
			preparedStatement.setLong(3,accountDto.getRank());
			preparedStatement.setDate(4,sqlDate);
			preparedStatement.setString(5,accountDto.getGender());
			preparedStatement.setString(6,accountDto.getMobileNumber());
			preparedStatement.setString(7,accountDto.getCountry());
			preparedStatement.setString(8,accountDto.getLiteCoinAddress());
			preparedStatement.setString(9,accountDto.getSponsorLink());
			preparedStatement.setLong(10,accountDto.getTotalEarnings());
			preparedStatement.setString(11,accountDto.getAccountId());
			preparedStatement.setString(12,accountDto.getEmail());
			preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	@Override
	public List<AccountDto> getAllAccounts(DatabaseConnection transaction, AccountDto accountDto) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<AccountDto> allAccountsList = new ArrayList<AccountDto>();
		try{
			connection = transaction.getResource(Connection.class);
			preparedStatement = connection.prepareStatement(GET_ALL_USERS);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				allAccountsList.add(makeAccountDto(resultSet));
			}
			return allAccountsList;
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			if(resultSet!=null){
				try{
					resultSet.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
			if(preparedStatement!=null){
				try{
					preparedStatement.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}

		}
		return null;
	}
	
	public AccountDto makeAccountDto(ResultSet resultSet) throws SQLException{
		String account_id = resultSet.getString(1);
		String account_name = resultSet.getString(2);
		String account_nick_name = resultSet.getString(3);
		long rank = resultSet.getLong(4);
		java.util.Date date_of_birth = resultSet.getDate(5);
		String gender = resultSet.getString(6);
		String mobile_number = resultSet.getString(7);
		String country = resultSet.getString(8);
		String email = resultSet.getString(9);
		String lite_coin_address = resultSet.getString(10);
		String sponsor_link = resultSet.getString(11);
		Long total_earnings = resultSet.getLong(12);
		
		AccountDto accountDto = new AccountDto(account_id, account_name, account_nick_name, rank, date_of_birth, gender, mobile_number, country, email, lite_coin_address, sponsor_link, total_earnings);
		return accountDto;
	}
	
	
	
	@Override
	public AccountDto getAccountById(DatabaseConnection transaction, AccountDto accountDto) {
		// TODO Auto-generated method stub
		return null;
	}
	

	private static String ADD_USER = "INSERT INTO accounts(account_id, account_name, account_nick_name, rank, date_of_birth, gender, mobile_number,country, email, lite_coin_address, sponsor_link, total_earnings) values (?,?,?,?,?,?,?,?,?,?,?,?)";
	private static String DELETE__USER = "DELETE FROM accounts where account_id = ? AND email = ?";
	private static String UPDATE_USER = "UPDATE accounts set account_name = ?, account_nick_name = ?, rank = ?, date_of_birth = ?, gender = ?, mobile_number = ?,country = ?, email = ?, lite_coin_address = ?, sponsor_link = ?, total_earnings = ? where account_id = ? AND email = ?";
	private static String GET_ALL_USERS = "SELECT account_id, account_name, account_nick_name, rank, date_of_birth, gender, mobile_number,country, email, lite_coin_address, sponsor_link, total_earnings FROM accounts ORDER BY account_id";
}
