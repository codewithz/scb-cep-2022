package com.scb.cep.service;

import java.util.List;

import com.scb.cep.entities.Account;

public interface AccountService {
	
	public String saveAccount(Account a);
	public List<Account> getAllAccounts();
	public Account getAccountById(int id);
	public String updateAccount(Account a,int id);
	public String deleteAccount(int id);

}
