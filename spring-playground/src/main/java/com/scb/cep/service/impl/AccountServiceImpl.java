package com.scb.cep.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.cep.entities.Account;
import com.scb.cep.repository.AccountRepository;
import com.scb.cep.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	AccountRepository accountRepository;

	@Override
	public String saveAccount(Account a) {
		Account savedAccount=accountRepository.save(a);
		return "Account created for "+savedAccount.getName(); 
	}

	@Override
	public List<Account> getAllAccounts() {
		List<Account> accounts=accountRepository.findAll();
		return accounts;
	}

	
}
