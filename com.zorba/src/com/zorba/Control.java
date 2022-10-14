package com.zorba;

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter Amount");
		Scanner sc=new Scanner(System.in);
		num= sc.nextInt();
		if(num==10) {System.out.println(num + "  Rupee dispatched");}
		
		else if (num==100) {System.out.println(num +"  Rupee dispatched");}
	
		else if (num==200) {System.out.println(num + "  Rupee dispacthed");}
		
		
		else {System.out.println( "Incorrect");}
		
		
		switch(num) {
		case 10:
			System.out.println("10 Rupee");
			break;
		case 100:
			System.out.println("100 Rupee");
			break;
		case 200:
			System.out.println("200 Rupees");
			default:
				System.out.println("incorrect switch");
		}
		
		
	
		}
		}
		
		
	


