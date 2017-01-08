package com.fortitude.serviceImpl;

import java.sql.SQLException;

import com.fortitude.dao.TransferDao;
import com.fortitude.dto.TransferDto;
import com.fortitude.service.TransferService;

public class TransferServiceImpl implements TransferService{

	private TransferDao transferDao;
	
	public TransferDao getTransferDao(){
		return transferDao;
	}
	
	public void setTransferDao (TransferDao transferDao){
		this.transferDao=transferDao;
	}
	
	
	@Override
	public void transferFunds(TransferDto transferDto) throws SQLException {
		transferDao.transferFund(transferDto);
	}
	

}

