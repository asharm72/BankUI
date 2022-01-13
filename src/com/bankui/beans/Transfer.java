package com.bankui.beans;

import org.springframework.stereotype.Component;

@Component
public class Transfer {
	private String toAccountNumber;
	private double balance;

	public String getToAccountNumber() {
		return toAccountNumber;
	}

	public void setToAccountNumber(String toAccountNumber) {
		this.toAccountNumber = toAccountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Transfer [toAccountNumber=" + toAccountNumber + ", balance=" + balance + "]";
	}

	
	
}