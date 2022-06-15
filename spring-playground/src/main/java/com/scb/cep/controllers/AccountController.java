package com.scb.cep.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.scb.cep.config.ApiSuccessResponse;
import com.scb.cep.entities.Account;
import com.scb.cep.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;

	@PostMapping("/accounts")
	public ResponseEntity<ApiSuccessResponse> saveAccount(@RequestBody Account account) {
		
		String result=accountService.saveAccount(account);
		ApiSuccessResponse successResponse=ApiSuccessResponse.build(result, result, HttpStatus.CREATED);
		ResponseEntity<ApiSuccessResponse> response=new ResponseEntity<ApiSuccessResponse>(successResponse, HttpStatus.CREATED);
		return response;
	}
	
	@GetMapping("/accounts")
	public ResponseEntity<ApiSuccessResponse> getAllAccounts(){
		List<Account> accounts=accountService.getAllAccounts();
		
		ApiSuccessResponse successResponse=ApiSuccessResponse.build(accounts, "Accounts Found", HttpStatus.OK);
		
		ResponseEntity<ApiSuccessResponse> response=new ResponseEntity<ApiSuccessResponse>(successResponse, HttpStatus.OK);
		
		return response;
	}
	
	@GetMapping("/accounts/{id}")
	public ResponseEntity<ApiSuccessResponse> getAccountById(@PathVariable int id) {
	Account a =accountService.getAccountById(id);

	ApiSuccessResponse successResponse=ApiSuccessResponse.build(a, "Account Found", HttpStatus.OK);
	
	ResponseEntity<ApiSuccessResponse> response=new ResponseEntity<ApiSuccessResponse>(successResponse, HttpStatus.OK);
	
	return response;
	}
	
	@PutMapping("/accounts/{id}")
	public ResponseEntity<ApiSuccessResponse> updateAccount(@RequestBody Account a, @PathVariable int id) {
		String result=accountService.updateAccount(a, id);
		ApiSuccessResponse successResponse=ApiSuccessResponse.build(result, result, HttpStatus.CREATED);
		ResponseEntity<ApiSuccessResponse> response=new ResponseEntity<ApiSuccessResponse>(successResponse, HttpStatus.CREATED);
		return response;
		
	}
	
	@DeleteMapping("/accounts/{id}")
	public ResponseEntity<ApiSuccessResponse> deleteAccount(@PathVariable int id) {
		String result=accountService.deleteAccount(id);
		ApiSuccessResponse successResponse=ApiSuccessResponse.build(result, result, HttpStatus.CREATED);
		ResponseEntity<ApiSuccessResponse> response=new ResponseEntity<ApiSuccessResponse>(successResponse, HttpStatus.CREATED);
		return response;
	}
}
