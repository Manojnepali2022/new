package com.zorba;

import java.util.Scanner;

public class Switch {
public static void main(String[] args) {
	int num;
	System.out.println("Enter The Number");
	Scanner Sc= new Scanner(System.in);
	num= Sc.nextInt();
	switch(num) {
	case 1:
		System.out.println("Sunday");
		break;
	case 2:
		System.out.println("Monday");
		break;
	case 3:
		System.out.println("Tuesday");
		break;
	case 4:
		System.out.println("Wenesday");
		break;
	case 5:
		System.out.println("Thuersday");
		break;
	case 6:
		System.out.println("Friday");
		break;
	case 7:
		System.out.println("Saturday");
		default:
			System.out.println("Incorrect Switch");
	}
		
}
}
