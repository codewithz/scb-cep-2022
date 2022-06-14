package com.scb.cep.service;

import java.util.List;

import com.scb.cep.entities.Account;

public interface AccountService {
	
	public String saveAccount(Account a);
	public List<Account> getAllAccounts();

}
