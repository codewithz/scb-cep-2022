package com.scb.cep.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.scb.cep.entities.Account;
import com.scb.cep.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;

	@PostMapping("/accounts")
	public String saveAccount(@RequestBody Account account) {
		
		String result=accountService.saveAccount(account);
		return result;
	}
	
	@GetMapping("/accounts")
	public List<Account> getAllAccounts(){
		List<Account> accounts=accountService.getAllAccounts();
		return accounts;
	}
	
}
