package com.varuni.bank.Repository;

import org.springframework.dao.DataAccessException;

public interface BankAccountReposiroty {
	public double getBalance(long accountId) throws DataAccessException;
	public boolean updateBalance(long accountId, double newBalance)throws DataAccessException;

}
