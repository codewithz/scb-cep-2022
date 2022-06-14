package com.scb.cep.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	@Column(name="accountnumber")
	private int accountNumber;
	
	@Column(name="name")
	private String name;
	
	@Column(name="nationality")
	private String nationality;
	
	@Column(name="balance")
	private double balance;
	
	@Column(name="creditlimit")
	private double creditLimit;
	
	@Column(name="accountcreationdate")
	private LocalDate accountCreationDate;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public LocalDate getAccountCreationDate() {
		return accountCreationDate;
	}

	public void setAccountCreationDate(LocalDate accountCreationDate) {
		this.accountCreationDate = accountCreationDate;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", nationality=" + nationality
				+ ", balance=" + balance + ", creditLimit=" + creditLimit + ", accountCreationDate="
				+ accountCreationDate + "]";
	}
	
	
	
	
	
	
	
}
