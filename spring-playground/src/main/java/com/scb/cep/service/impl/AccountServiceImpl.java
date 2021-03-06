package com.scb.cep.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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

	@Override
	public Account getAccountById(int id) {

		Optional<Account> optional=accountRepository.findById(id);
		Account a=null;
		
		if(optional.isPresent()) {
			a=optional.get();
		}
		
		return a;
	}

	@Override
	public String updateAccount(Account a, int id) {
		Optional<Account> optional=accountRepository.findById(id);
		
		if(optional.isPresent()) {
		a.setAccountNumber(id);
		Account updatedAccount=accountRepository.save(a);
		return "Account Updated for "+a.getName();
		}
		else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer doesn't exist");
		}
	}

	@Override
	public String deleteAccount(int id) {
		
		Optional<Account> optional=accountRepository.findById(id);
		
		if(optional.isPresent()) {
			accountRepository.deleteById(id);
	
		}
		else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer doesn't exist");
		}
		
		return "Account Number:"+id+" is deleted.";
	}

	
}
