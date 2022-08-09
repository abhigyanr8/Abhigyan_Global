package com.Friday_05;

public class Customer 
{
	String first_name;
	String Last_name;
	@Override
	public String toString() {
		return "Customer [first_name=" + first_name + ", Last_name=" + Last_name + ", account=" + account + "]";
	}
	Account account;
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	

}
