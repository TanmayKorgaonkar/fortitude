package com.fortitude.serviceImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.fortitude.connection.DatabaseConnection;
import com.fortitude.dao.AccountDao;
import com.fortitude.dao.impl.AccountDaoImpl;
import com.fortitude.dto.AccountDto;
import com.fortitude.service.AccountService;
//import com.fortitude.util.DatabaseUtil;

//@Service("accountService")
public class AccountServiceImpl implements AccountService {
	
	//@Autowired
	//private static AccountDaoImpl accountDao;
	//@Autowired
	//private static DatabaseUtil transaction1;
	private AccountDao accountDao;
	
	public AccountDao getAccountDao(){
		return this.accountDao;
	}
	
	public void setAccountDao(AccountDao accountDao){
		this.accountDao = accountDao;
	}
	
	@Override
	public boolean isValidAccount(String id, String password)throws SQLException{
		return accountDao.isValidAccount(id, password);
	}
	/*public AccountServiceImpl(DatabaseUtil transaction1, AccountDaoImpl accountDao) {
		this.transaction1 = transaction1;
		this.accountDao = accountDao;
		//super();
		// TODO Auto-generated constructor stub
	}
	*/
	
	@Override
	public AccountDto getAccount(String accountId) {
			// TODO Auto-generated method stub
		//if(accNo.equals("temp-account")){
			//return new AccountDto("dto1");
		//}else{
//			return accountDao.getAllAccounts(transaction, accountDto);
		//}
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

	@Override
	public void addAccount(AccountDto accountDto) throws SQLException {
		accountDao.addAccount(accountDto);
	}
	

	
}
