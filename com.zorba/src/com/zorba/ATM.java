package com.zorba;

import java.util.Scanner;

public class ATM {
	static int pinNumber = 1234;
	static double initialAmount = 1000;

	public static void main(String[] args) {

		System.out.println("Wel Come to Bank Of Aerica");
		System.out.println("*******************************************");
		System.out.println("Enter your Pin Number");
		System.out.println("********************************************");
		Scanner Sc = new Scanner(System.in);
		int pin = Sc.nextInt();
		if (pin == pinNumber) {
			System.out.println("Cash Withdraw <CW>| Cash Deposit <CD> | Enquary Balance <EB> ");
			String option = Sc.next();
			if (option.equals("BE")) {
				balanceEnquary();
			} else if (option.equals("CD")) {
				System.out.println("Insert your Amont");
				double depositAmount = Sc.nextDouble();
				cashDeposit(depositAmount);
				balanceEnquary();
			} else if (option.equals("CW")) {
				System.out.println("Enter Your Amount");
				double withdrawAmount = Sc.nextDouble();
				if (withdrawAmount < initialAmount) {
					withdrawBalance(withdrawAmount);
				balanceEnquary();
			} else {
				System.out.println("Withdraw Amount is greater than available Amount");
			} 
	
	
			} else {System.out.println("Incorrect Option Selection");
			}
			}else {System.out.println("Invalid Pin");}
			
	
	
	
	
}

	

	public static void balanceEnquary() {
		System.out.println("Balance in your Account is : " + initialAmount + "$");
	}

	public static void cashDeposit(double depositAmount) {
		initialAmount = initialAmount + depositAmount;
	}

	public static void withdrawBalance(double withdrawBalance) {
		initialAmount = initialAmount - withdrawBalance;
	}
}
