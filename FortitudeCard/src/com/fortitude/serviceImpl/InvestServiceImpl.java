package com.fortitude.serviceImpl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fortitude.dao.InvestDao;
import com.fortitude.dto.InvestDto;
import com.fortitude.service.InvestService;

public class InvestServiceImpl implements InvestService{

	@Autowired
	InvestDao investDao;
	
	public InvestDao getInvestDao() {
		return investDao;
	}

	public void setInvestDao(InvestDao investDao) {
		this.investDao = investDao;
	}



	@Override
	public void investInProject(InvestDto investDto) throws SQLException {
		investDao.investInProject(investDto);
		
	}

	@Override
	public List<InvestDto> getInvestByUser(String userId) throws SQLException {
		return investDao.getInvestByUserId(userId);
	}

}
