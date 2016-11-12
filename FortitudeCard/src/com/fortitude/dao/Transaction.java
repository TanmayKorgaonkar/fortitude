package com.fortitude.dao;

import java.io.IOException;

public interface Transaction {
		public void begin() throws IOException;
		public void commit() throws IOException;
		public boolean isActive() throws IOException;
		public void rollback() throws TransactionException;
		public<T> T getResource(Class<T> klass);

		public static class TransactionException extends RuntimeException{
			public TransactionException(Exception e){
				super(e);
			}
			private static final long serialVersionUID=1L;
		}	
}
