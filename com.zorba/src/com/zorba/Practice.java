package com.zorba;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		String name;
		String lastname;
		String Gender;
		String Address;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Name");
		name=sc.next();
		System.out.println("Enter your Last Name");
		lastname=sc.next();
		System.out.println("Enter your Gender");
		Gender=sc.next();
		System.out.println("Enter your Address");
		Address=sc.next();
				
		
		System.out.print ( name    +lastname+Gender+Address);
		int i;
		i=10;
		System.out.println(i);
		
		
		
		
	}

}
