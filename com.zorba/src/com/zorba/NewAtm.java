package com.zorba;

import java.util.Scanner;

public class NewAtm {
	public static void main(String[] args) {
		System.out.println("Enter Amount");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		{if (num == 10) {
			System.out.println(num + "   Rupees");
		} else if (num == 100) {
			System.out.println(num + " Rupees");
		} else if (num == 1000) {
			System.out.println(num + "   Rupees");
		} else {
			System.out.println(num + "Incorrect Selection");}
		}

	}
}
