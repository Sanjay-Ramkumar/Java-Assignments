package com.lumen.absdemos;

public class Current extends Bank {

	public Current(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		if(balance <1000) {
			System.out.println("Mimimum bank balance should be 1000.So withdrawl cannot be completed");
		}
		else if(amount>10000) {
			System.out.println("Enter a  amount lesser than 10000");
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
		if(amount>50000) {
			System.out.println("Amount greater than 50000 cannot be deposited in ATM");
		}
		else {
			System.out.println("Amount deposited successfully");
			balance=balance+amount;
			System.out.println("Available balance "+ balance);
		}
	}
	
	

}
