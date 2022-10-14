package com.zorba;

import java.util.Scanner;

public class Exam2 {

	
	public static void main(String[] args) {
		
	
	
		System.out.println("Enter The Alphabet");
		
		char ch;
		
		Scanner Sc=new Scanner(System.in);
		ch=Sc.next().charAt(0);
		switch(ch) {
		case 'a','e','i','o','u','A','E','I','O','U':
			
			System.out.println("Vowel");
		
			break;
	
			default:
				System.out.println("Consonant");
			
		}
		
	
	}
}
