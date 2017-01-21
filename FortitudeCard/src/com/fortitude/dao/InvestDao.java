package com.fortitude.dao;

import java.sql.SQLException;
import java.util.List;

import com.fortitude.dto.InvestDto;

public interface InvestDao {
	
	public void investInProject(InvestDto investDto) throws SQLException;
	
	public List<InvestDto> getInvestByUserId(String userId) throws SQLException;

}
