package com.zorba;

public class Modulus {
	
	
	
	
	
	public static void main(String[] args) {
		
		
		int num1=6789;
		System.out.println(num1/1000);
		int num2=num1%1000;
		System.out.println(num2/100);
		int num3=num2%100;
		System.out.println(num3/10);
		int num4=num3%10;
		System.out.println(num4);
		//post
		int a=10;
		int b=a++;
		System.out.println("a is  "+a);
		System.out.println("b is  "+b);
		// pre
		int c=10;
		int d= ++c;
		System.out.println("c is"+c);
		System.out.println("d is" +d);
		
		int e = 10;
	    int f = e;
		System.out.println(f);//
		f= ++e;
		System.out.println(f);// 12
		b= e--;
		System.out.println(f);// 12
		System.out.println(e);
		f=--e;
		System.out.println(f);//


		
			
		
		
	}

}
