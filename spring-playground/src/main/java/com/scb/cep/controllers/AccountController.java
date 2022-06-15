package com.scb.cep.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/accounts/{id}")
	public Account getAccountById(@PathVariable int id) {
	Account a =accountService.getAccountById(id);
	return a;
	}
	
	@PutMapping("/accounts/{id}")
	public String updateAccount(@RequestBody Account a, @PathVariable int id) {
		String result=accountService.updateAccount(a, id);
		return result;
	}
	
	@DeleteMapping("/accounts/{id}")
	public String deleteAccount(@PathVariable int id) {
		String result=accountService.deleteAccount(id);
		return result;
	}
}
