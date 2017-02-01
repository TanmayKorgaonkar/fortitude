package com.fortitude.delegate;

import java.sql.SQLException;

import com.fortitude.dto.AccountDto;
import com.fortitude.service.AccountService;

public class LoginDelegate {
	private AccountService accountService;
	
	public AccountService getAccountService(){
		return this.accountService;
	}
	
	public void setAccountService(AccountService accountService){
		this.accountService=accountService;
	}
	
	public boolean isValidAccount(String id, String password)throws SQLException{
		return accountService.isValidAccount(id, password);
	}
	
	public void signupUser(AccountDto accountDto) throws SQLException{
		accountService.addAccount(accountDto);
	}
}
