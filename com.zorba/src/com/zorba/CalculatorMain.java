package com.zorba;

import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {

		try (Scanner sccan = new Scanner(System.in)) {
			System.out.println("Enter first number");
			int num1 = sccan.nextInt();
			System.out.println("Enter second number");
			int num2 = sccan.nextInt();

			Calculator1 calc1 = new Calculator1();
			calc1.add(num1,num2);
			calc1.sub(num1,num2);
			calc1.div(num1,num2);
			calc1.mul(num1,num2);
			
			
			
			
			
		}

	}

}
