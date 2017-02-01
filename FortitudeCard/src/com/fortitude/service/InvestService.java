package com.fortitude.service;

import java.sql.SQLException;
import java.util.List;

import com.fortitude.dto.InvestDto;

public interface InvestService {
	public void investInProject(InvestDto investDto) throws SQLException;
	
	public List<InvestDto> getInvestByUser(String userId) throws SQLException;

}
