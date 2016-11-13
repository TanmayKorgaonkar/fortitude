package com.fortitude.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fortitude.connection.DatabaseConnection;
import com.fortitude.dao.AccountDao;
import com.fortitude.dto.AccountDto;
import com.fortitude.service.AccountService;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountDao accountDao;
	@Autowired
	private DatabaseConnection transaction;
	
	
	public AccountServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public AccountDto getAccount(String accNo) {
		// TODO Auto-generated method stub
		if(accNo.equals("temp-account")){
			return new AccountDto("dto1");
		}else{
//			return accountDao.getAllAccounts(transaction, accountDto);
		}
		return null;
	}

	@Override
	public List<AccountDto> getAccounts(String userId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean deleteAccount(String accNo) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public AccountDto updateAccount(AccountDto account) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
