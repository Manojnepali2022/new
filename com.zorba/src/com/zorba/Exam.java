package com.zorba;

public class Exam {

	public static void main(String[] args) {

		int i, sum;

		sum = 0;

		for (i = 1; i <= 10; i = i++)
			if ((i % 2) == 0) {

				sum = sum + i;
			}
		double Avg = sum / 5;

		System.out.println("Everage of first 5 number is" + Avg);

	}

}
