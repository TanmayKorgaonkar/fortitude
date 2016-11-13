package com.fortitude.service;

import java.util.List;

import com.fortitude.dto.AccountDto;

public interface AccountService {

	public AccountDto getAccount(String accNo);
	public List<AccountDto> getAccounts(String userId);
	public boolean deleteAccount(String accNo);
	public AccountDto updateAccount(AccountDto account );
}
