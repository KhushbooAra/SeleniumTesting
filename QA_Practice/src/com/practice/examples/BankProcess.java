package com.practice.examples;

public class BankProcess {
	
	int value = 10000;

	public static void main(String[] args) {
		
		BankProcess obj = new BankProcess();
		Amount amt = new Amount();
		
		System.out.println("The amount remaining in account :"+ obj.withdraw(300));

	}
	
	int withdraw(int amount){
		
		
		value = value - amount;
		
		return value;
		
	}

}
