package com.fortitude.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

//import com.fortitude.connection.DatabaseConnection;
import com.fortitude.dto.AccountDto;
//import com.fortitude.util.DatabaseUtil;

public interface AccountDao {
	public void deleteAccount(AccountDto accountDto);
	public void updateAccount( AccountDto accountDto);
	public List<AccountDto> getAllAccounts( AccountDto accountDto);
	public AccountDto getAccountById(String accountId) throws SQLException;
	public boolean isValidAccount(String id, String password) throws SQLException;
	public void addAccount(AccountDto accountDto) throws SQLException;
}
