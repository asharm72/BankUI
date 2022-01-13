package com.bankui.beans;

import org.springframework.stereotype.Component;

@Component
public class Deposit {

	private String fromAccountNumber;
	private double balance;
	public String getFromAccountNumber() {
		return fromAccountNumber;
	}
	public void setFromAccountNumber(String fromAccountNumber) {
		this.fromAccountNumber = fromAccountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
