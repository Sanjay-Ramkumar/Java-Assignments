package com.lumen.absdemos;

public class Savings extends Bank {
	

	public Savings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		if(balance<500) {
			System.out.println("Mimimum bank balance should be 500.So withdrawl cannot be completed");
		}
		else if(amount>5000) {
			System.out.println("Enter a  amount lesser than 5000");
		}
		else if (amount>balance) {
			System.out.println("Amount entered is greater than the balance amount");
		}
		else {
			System.out.println("Amount withdrawn successfully");
			balance=balance-amount;
			System.out.println("Available balance "+ balance);
		}
		
	}

	@Override
	void deposit(double amount) {
		if(amount>20000) {
			System.out.println("Amount greater than 20000 cannot be deposited in ATM");
		}
		else {
			System.out.println("Amount deposited successfully");
			balance=balance+amount;
			System.out.println("Available balance "+ balance);
		}
		//System.out.println("New amount "+(balance+amount));
	}

}
