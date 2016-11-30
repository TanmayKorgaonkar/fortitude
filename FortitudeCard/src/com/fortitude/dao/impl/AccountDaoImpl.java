package com.fortitude.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Spliterators;
import java.util.stream.StreamSupport;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

//import com.fortitude.connection.DatabaseConnection;
import com.fortitude.dao.AccountDao;
import com.fortitude.dao.Transaction;
import com.fortitude.dao.UserRoleDao;
import com.fortitude.dto.AccountDto;
//import com.fortitude.util.DatabaseUtil;

public class AccountDaoImpl implements AccountDao{
	DataSource dataSource;
	
	UserRoleDao userRoleDao;
	
	public UserRoleDao getUserRoleDao(){
		return this.userRoleDao;
	}
	
	public void setUserRoleDao(UserRoleDao userRoleDao){
		this.userRoleDao=userRoleDao;
	}
	
	public DataSource getDataSource(){
		return this.dataSource;
	}
	
	public void setDataSource(DataSource dataSource){
		this.dataSource = dataSource;
	}
	
/*	account_id VARCHAR(45) NOT NULL,
	account_first_name VARCHAR(45) NOT NULL,
	account_last_name VARCHAR(45) NOT NULL,
	account_nick_name VARCHAR(45) NOT NULL,
	rank BIGINT,
	date_of_birth DATE NOT NULL, 
	gender VARCHAR(1) NOT NULL,
	mobile_number VARCHAR(16) NOT NULL,
	country VARCHAR(45) NOT NULL,
	email VARCHAR(101) NOT NULL,
	lite_coin_address VARCHAR(1001) NOT NULL,
	sponsor_link VARCHAR(1001) NOT NULL,
	total_earnings BIGINT,
	account_password VARCHAR(99) NOT NULL,
	PRIMARY KEY(account_id, email, account_password)*/
	
	
	
/*	public void addAccount( AccountDto accountDto) {
		}
*/	
	/*AccountDto getMockAccDto(){
		AccountDto accountDto= new AccountDto("dto1");
		return accountDto;
	}*/
	
	
	public void deleteAccount( AccountDto accountDto) {
		try{
			Connection connection = dataSource.getConnection();

			PreparedStatement preparedStatement = connection.prepareStatement(DELETE__USER);
			preparedStatement.setString(1, accountDto.getAccountId());
			preparedStatement.setString(2, accountDto.getEmail());
			preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	
	public void updateAccount( AccountDto accountDto) {
		SimpleDateFormat format = new SimpleDateFormat( "YYYY-MM-DD" );
		java.util.Date birthDate = null;
		
		try {
			birthDate = format.parse(accountDto.getDateOfBirth());
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		java.sql.Date sqlDate = new java.sql.Date(birthDate.getTime()); 
		
		try{
			Connection connection = dataSource.getConnection();

			PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER);
			preparedStatement.setString(1,accountDto.getAccountFirstName());
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

	
	public List<AccountDto> getAllAccounts(  AccountDto accountDto) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<AccountDto> allAccountsList = new ArrayList<AccountDto>();
		try{
			Connection connection = dataSource.getConnection();

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
		String accountId = resultSet.getString(1);
		String accountFirstName = resultSet.getString(2);
		String accountLastName = resultSet.getString(3);
		String accountNickName = resultSet.getString(4);
		long rank = resultSet.getLong(5);
		String dateOfBirth = resultSet.getString(6);
		String gender = resultSet.getString(7);
		String mobileNumber = resultSet.getString(8);
		String country = resultSet.getString(9);
		String email = resultSet.getString(10);
		String liteCoinAddress = resultSet.getString(11);
		String sponsorLink = resultSet.getString(12);
		Long totalEarnings = resultSet.getLong(13);
		String accountPassword = resultSet.getString(14);
		String passwordConfirmation = resultSet.getString(15);
		String userRole = resultSet.getString(16);
		
		AccountDto accountDto = new AccountDto(accountId, accountFirstName,
				accountLastName, accountNickName, rank, dateOfBirth, 
				gender, mobileNumber, country, email, liteCoinAddress, 
				sponsorLink, totalEarnings, userRole);
		return accountDto;
	}
	
	
	
	@Override
	public AccountDto getAccountById(String accountId) throws SQLException {
		
		
		try{
		Connection connection = dataSource.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(GET_ACCOUNT_BY_ID);
		preparedStatement.setString(1, accountId);
		//preparedStatement.setString(2, password);
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next()){
			AccountDto accountDto =  makeAccountDto(resultSet);
		}else{
			return new AccountDto();
		}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}
	


	
	private static String ADD_USER = "insert into accounts(account_id, account_first_name, account_last_name, account_nick_name, rank, date_of_birth, gender, mobile_number, country,"+
"email, lite_coin_address, sponsor_link, total_earnings,account_password, user_role) values(?, ?, ?, ?, ?, ?, ?, ?,?,?, ?, ?, ?, ?,?)";
	private static String GET_ACCOUNT_BY_ID = "SELECT * FROM accounts where account_id = ?";
	private static String DELETE__USER = "DELETE FROM accounts where account_id = ? AND email = ?";
	private static String UPDATE_USER = "UPDATE accounts set account_name = ?, account_nick_name = ?, rank = ?, date_of_birth = ?, gender = ?, mobile_number = ?,country = ?, email = ?, lite_coin_address = ?, sponsor_link = ?, total_earnings = ? where account_id = ? AND email = ?";
	private static String GET_ALL_USERS = "SELECT account_id, account_name, account_nick_name, rank, date_of_birth, gender, mobile_number,country, email, lite_coin_address, sponsor_link, total_earnings FROM accounts ORDER BY account_id";
	
	
	@Override
	public void addAccount(AccountDto accountDto) {
		SimpleDateFormat format = new SimpleDateFormat( "YYYY-MM-DD" );  
		java.util.Date birthDate = null;
		try {
			birthDate = format.parse(accountDto.getDateOfBirth().toString());
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		java.sql.Date sqlBirthDate = new java.sql.Date( birthDate.getTime()); 
		try{
			Connection connection = dataSource.getConnection();

			PreparedStatement preparedStatement = connection.prepareStatement(ADD_USER);
			preparedStatement.setString(1,accountDto.getAccountId());
			preparedStatement.setString(2,accountDto.getAccountFirstName());
			preparedStatement.setString(3, accountDto.getAccountLastName());
			preparedStatement.setString(4,accountDto.getAccountNickName());
			preparedStatement.setLong(5,accountDto.getRank());
			preparedStatement.setDate(6,sqlBirthDate);
			preparedStatement.setString(7,accountDto.getGender());
			preparedStatement.setString(8,accountDto.getMobileNumber());
			preparedStatement.setString(9,accountDto.getCountry());
			preparedStatement.setString(10,accountDto.getEmail());
			preparedStatement.setString(11,accountDto.getLiteCoinAddress());
			preparedStatement.setString(12,accountDto.getSponsorLink());
			preparedStatement.setLong(13,accountDto.getTotalEarnings());
			preparedStatement.setString(14, accountDto.getAccountPassword());
			preparedStatement.setString(15, accountDto.getUserRole());
			preparedStatement.executeUpdate();
			userRoleDao.addUserRole(connection, accountDto.getAccountId(), accountDto.getUserRole());
			
			System.out.println("done");
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	/*@Override
	public void deleteAccount( AccountDto accountDto) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateAccount(AccountDto accountDto) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<AccountDto> getAllAccounts( AccountDto accountDto) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AccountDto getAccountById( AccountDto accountDto) {
		// TODO Auto-generated method stub
		return null;
	}*/
	@Override
	public boolean isValidAccount(String id, String password) throws SQLException {
		String query = "select count(1) from login where account_id_fk = ? and account_password_fk=?";
		
		Connection connection = dataSource.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, id);
		preparedStatement.setString(2, password);
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next()){
			return(resultSet.getInt(1)>0);
		}else{
			return false;
		}
	}

	
}
