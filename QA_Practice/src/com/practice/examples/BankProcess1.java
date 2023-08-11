package com.practice.examples;

public class BankProcess1 {
	
	public static void main(String[] args) {
		
		//Customer name, accountNo, email, Balance, phoneNo
		
		Account KhushsAccount = new Account("12345",0.0,"Khush","khush@xyz.com","1234555");
		
		KhushsAccount.DepositMoney(100);
		KhushsAccount.DepositMoney(150);
		KhushsAccount.Withdraw(300);
		KhushsAccount.Withdraw(250);
	}

}
