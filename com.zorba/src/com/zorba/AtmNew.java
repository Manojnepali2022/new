package com.zorba;

import java.util.Scanner;

public class AtmNew {
	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter First  Number ");
		double num = Sc.nextInt();
		System.out.println(" Enter Second Number");
		double num1 = Sc.nextInt();
		System.out.println(" Choose The Option <add> <sub> < Mul> <Div>");

		String option = Sc.next();
		if (option.equals("add")) {

			adding(num, num1);
		} else if (option.equals("sub")) {
			subtracting(num, num1);

		} else if (option.equals("Mul")) {
			mul(num, num1);
		} else if (option.equals("div")) {
			div(num, num1);
		} else {
			System.out.println("Please Select The Correct Option");
		}

	}

	public static void adding(double num, double num1) {
		System.out.println("The Sum is : " + (num + num1));
	}

	public static void subtracting(double num, double num1) {
		System.out.println("The Subtraction is: " + (num - num1));
	}

	public static void mul(double num, double num1) {
		System.out.println("Multiply is:" + (num * num1));
	}

	public static void div(double num, double num1) {
		System.out.println("Division is: " + (num / num1));
	}
}
