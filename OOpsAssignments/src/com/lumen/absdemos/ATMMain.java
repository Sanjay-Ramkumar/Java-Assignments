package com.lumen.absdemos;
import java.util.Scanner;
public class ATMMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Account type:");
		System.out.println("Type 1: savings");
		System.out.println("Type 2: current");
		System.out.println("Enter the accountype");
		String accountType=scanner.next();
		if(accountType.equals("savings")) {
			Bank savings=new Savings(10000);
			System.out.println("Operations available");
			System.out.println("If entered 1 : Withdraw");
			System.out.println("If entered 1 : Deposit");
			System.out.println("Enter the operation to be performed");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter the money to withdraw");
				int amount=scanner.nextInt();
				savings.withdraw(amount);
				break;
			}
			case 2:{
				System.out.println("Enter the money to deposit");
				int amount=scanner.nextInt();
				savings.deposit(amount);
				break;
			}
			default:{
				System.out.println("Enter a valid choice");
			}
			}
		}else {
			Bank current=new Current(30000);
			System.out.println("Operations available");
			System.out.println("If entered 1 : Withdraw");
			System.out.println("If entered 1 : Deposit");
			System.out.println("Enter the operation to be performed");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter the money to withdraw");
				int amount=scanner.nextInt();
				current.withdraw(amount);
				break;
			}
			case 2:{
				System.out.println("Enter the money to deposit");
				int amount=scanner.nextInt();
				current.deposit(amount);
				break;
			}
			default:{
				System.out.println("Enter a valid choice");
			}
			}
		}
				
	}

}
