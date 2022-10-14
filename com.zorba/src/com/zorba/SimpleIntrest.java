package com.zorba;

import java.util.Scanner;

public class SimpleIntrest {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Principle Amount");
			int P= sc.nextInt();
			System.out.println("Enter Intrest Rate");
			double R=sc.nextDouble();
			System.out.println("Enter Time");
			int T= sc.nextInt();
			double SI= (P*(1+R*T)/100);
			System.out.println("Simple Intrest Rate is:  " + SI);
		}
	
		
	}

}
