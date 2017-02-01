package com.fortitude.service;

import java.sql.SQLException;
import java.util.List;

import com.fortitude.dto.AccountDto;

public interface AccountService {

	public AccountDto getAccount(String accountId);
	public void addAccount(AccountDto accountDto) throws SQLException;
	public List<AccountDto> getAccounts(String userId);
	public boolean deleteAccount(String accNo);
	public AccountDto updateAccount(AccountDto account );
	public boolean isValidAccount(String id, String password) throws SQLException;
}
