package com.fortitude.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fortitude.connection.DatabaseConnection;
import com.fortitude.dao.AccountDao;
import com.fortitude.dto.AccountDto;
import com.fortitude.service.AccountService;


@RequestMapping("/listAccounts")
@Controller

public class AccountController extends HttpServlet{
	private static final long serialVersionUID = -182097777927L;
	private static String INSERT_OR_UPDATE_ACCOUNT = "/accounts.jsp";
	private static String LIST_ALL_ACCOUNTS = "/listAccounts.jsp";
	
	@Autowired
	private AccountDao accountDao;
	@Autowired
	private DatabaseConnection transaction;
	
	public AccountController(DatabaseConnection transaction, AccountDao accountDao){
		super();
		this.transaction = transaction;
		this.accountDao = accountDao;
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response, DatabaseConnection transaction) throws SQLException, IOException{
		String forward = "";
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("delete")){
			String userId = request.getParameter("userId");
		//	accountDao.deleteAccount(transaction, accountDto);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response, DatabaseConnection transaction)throws SQLException, IOException, ServletException{
		AccountDto accountDto = new AccountDto();
		accountDto.setAccountId(request.getParameter("accountId"));
		accountDto.setAccountName(request.getParameter("accountName"));
		accountDto.setAccountNickName(request.getParameter("accountNickName"));
		accountDto.setCountry(request.getParameter("country"));
		try{
		Date dateOfBirth = new SimpleDateFormat("MM/dd/yyyy").parse(request.getParameter("dateOfBirth"));
		accountDto.setDateOfBirth(dateOfBirth);
	}catch (java.text.ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		accountDto.setEmail(request.getParameter("email"));
		accountDto.setGender(request.getParameter("gender"));
		accountDto.setLiteCoinAddress(request.getParameter("liteCoinAddress"));
		accountDto.setMobileNumber(request.getParameter("mobileNumber"));
		accountDto.setRank(Integer.parseInt(request.getParameter("rank")));
		accountDto.setSponsorLink(request.getParameter("sponsorLink"));
		accountDto.setTotalEarnings(Integer.parseInt(request.getParameter("totalEarnings")));
		accountDao.addAccount(transaction, accountDto);
		RequestDispatcher view = request.getRequestDispatcher(LIST_ALL_ACCOUNTS);
		request.setAttribute("accounts", accountDao.getAllAccounts(transaction, accountDto));
		view.forward(request, response);
	}
	
	
	
	
	
	// TODO:Write controller this way
	// list page
	@Autowired
	private AccountService accountService;
	
	
	
	@RequestMapping(value = "/indexAdmin", method = RequestMethod.GET)
	public String getAccount(Model model) {
		model.addAttribute("account", accountService.getAccount("temp-account"));
		return "/indexAdmin";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
