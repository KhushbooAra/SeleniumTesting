package com.practice.examples;

public class Account {

	private String Number;
	private double Balance;
	private String name;
	private String email;
	private String phoneNo;

	public Account(String Number, double Balance, String name, String email, String phoneNo) {
		this.Number = Number;
		this.Balance = Balance;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public void DepositMoney(double DepositedMoney) {
		this.Balance += DepositedMoney;
		System.out.println("Deposit is successful, new Balance is " + this.Balance);
	}

	public void Withdraw(double withdrawalMoney) {
		if(this.Balance - withdrawalMoney < 0) {
			System.out.println("Withdraw unsuccessful only "+this.Balance+" is left");
		}
		else {
			this.Balance-=withdrawalMoney;
			System.out.println("Withdraw successful, Current Balance is "+this.Balance);
		}
	}
	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
