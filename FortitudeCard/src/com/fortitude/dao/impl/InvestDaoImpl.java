package com.fortitude.dao.impl;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import com.fortitude.dao.InvestDao;
import com.fortitude.dto.InvestDto;

public class InvestDaoImpl implements InvestDao{
	
	DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}



	@Override
	public void investInProject(InvestDto investDto) throws SQLException {
		Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now());
		try{
			Connection connection = dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(ADD_INVEST);
			preparedStatement.setString(1, investDto.getUserId());
			preparedStatement.setString(2, investDto.getProjectId());
			preparedStatement.setLong(3, investDto.getInvestmentAmount());
			preparedStatement.setFloat(4, investDto.getInterestPerMonth());
			preparedStatement.setTimestamp(5, timestamp);
			preparedStatement.setBoolean(6, true);
			System.out.println("Invested in project");
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	private static final String ADD_INVEST = "INSERT INTO invest (user_id,project_id, investment_amount, interest_per_month, date_of_investment, is_active ) values (?,?,?,?,?,?)";
	private static final String GET_INVEST_BY_USER = "SELECT project_id, investment_amount, interest_per_month, date_of_investment, is_active FROM invest WHERE user_id = ?";

	@Override
	public List<InvestDto> getInvestByUserId(String userId) throws SQLException {
		InvestDto investDto = new InvestDto();
		try{
			Connection connection = dataSource.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(GET_INVEST_BY_USER);
			preparedStatement.setString(1, userId);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			List<InvestDto> investList = new ArrayList<>();
			while(resultSet.next()){
				InvestDto investDto1 = new InvestDto();
				investDto1 = makeInvestDto(resultSet);
				investList.add(investDto1);
			}
			System.out.println(investList.size());
			return investList;
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}

	private InvestDto makeInvestDto(ResultSet resultSet) throws SQLException {
	//	String userId = resultSet.getString(1);
		String projectId = resultSet.getString(1);
		long investmentAmount = resultSet.getLong(2);
		float interestPerMonth = resultSet.getFloat(3);
		Date dateOfInvestment = resultSet.getDate(4);
		boolean isActive = resultSet.getBoolean(5);
		InvestDto investDto = new InvestDto(projectId, investmentAmount, interestPerMonth, dateOfInvestment, isActive);
		return investDto;
	}
}
