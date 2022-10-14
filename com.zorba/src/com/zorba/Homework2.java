package com.zorba;

// Q2. Write a Java program to take  name and roll number from user and generate username by adding name and roll number. Also print the username
import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {

		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Write Your Name and Roll Number");
			System.out.println("EnterYourName");
			String Name = scn.next();
			System.out.println("EnterYourRollNo");
			int RollNo = scn.nextInt();
			System.out.println("Your Name and Roll No is:  " + Name);
			System.out.println("your Roll Number is:  " + RollNo);
		}

	}

}
