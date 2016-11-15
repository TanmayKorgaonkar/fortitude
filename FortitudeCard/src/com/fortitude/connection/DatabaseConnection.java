package com.fortitude.connection;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import javax.ejb.Stateful;

import javax.annotation.PreDestroy;
//import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;

import com.fortitude.dao.Transaction;
import com.fortitude.util.DatabaseUtil;



@Stateful
//@RequestScoped
public class DatabaseConnection implements Transaction, Serializable{
	private static final long serialVersionUID=-7828715984476316619L;

	private static Connection connection;
	
	@Override
	public void begin() throws TransactionException{
		if(connection==null){
			try{
				connection =DatabaseUtil.getConnection();
				connection.setAutoCommit(false);
			}catch(SQLException e){
				throw new TransactionException (e);
			}
		}
	}

	@Override
	public void commit() throws TransactionException{
		try{
			if(connection!=null){
				connection.commit();
			}
		}catch(SQLException e){
			throw new TransactionException(e);
		}
	}

	@Override
	public void rollback() throws TransactionException{
		try{
			if(connection!=null){
				connection.rollback();
			}
		}catch(SQLException e){
			throw new TransactionException(e);
		}
	}

	@Override
	public boolean isActive() throws TransactionException{
		try{
			if(connection!=null && connection.isClosed()){
				connection=null;
				return false;
			}
		}catch(SQLException e){
			throw new TransactionException(e);
		}
		return true;
	}

	@PreDestroy
	public void preDestroy(){
		if(connection!=null){
			try{
				connection.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
			connection=null;
		}
	}

	@Override
	public <T> T getResource(Class<T> klass){
		if(klass.equals(Connection.class)){
			@SuppressWarnings("unchecked")
			T con=(T) connection;
			return con;
		}
		throw new IllegalArgumentException();
	}




}
