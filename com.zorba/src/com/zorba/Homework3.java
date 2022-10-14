package com.zorba;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter First Number");
			int FirstNo = sc.nextInt();
			System.out.println("Enter Second Number");
			int SecondNo= sc.nextInt();
			System.out.println("Enter Name");
			String name=sc.next();
			System.out.println("Print:  " +FirstNo +name +SecondNo);
		}
				
				
	}
	
	
	}
