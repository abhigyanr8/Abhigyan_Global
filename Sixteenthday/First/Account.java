package com.Friday_05;

public class Account 
{
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount)
	{
		balance+=amount;
	}
	public void withdraw(double amount)
	{
		if(balance>5000)
		     balance-=amount;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
	

}
