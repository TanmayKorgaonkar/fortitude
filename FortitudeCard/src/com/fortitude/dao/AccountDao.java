package com.fortitude.dao;

import java.util.List;

import com.fortitude.connection.DatabaseConnection;
import com.fortitude.dto.AccountDto;

public interface AccountDao {
	public void addAccount(DatabaseConnection transaction, AccountDto accountDto);
	public void deleteAccount(DatabaseConnection transaction, AccountDto accountDto);
	public void updateAccount(DatabaseConnection transaction, AccountDto accountDto);
	public List<AccountDto> getAllAccounts(DatabaseConnection transaction, AccountDto accountDto);
	public AccountDto getAccountById(DatabaseConnection transaction, AccountDto accountDto);
}
