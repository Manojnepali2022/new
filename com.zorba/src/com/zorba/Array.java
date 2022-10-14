package com.zorba;

public class Array {
public static void main(String[] args) {
	// Array declaration with size
	//double[] numbers =new double[9];
	double[]numbers= {40,55,63,17,50};
	numbers[2]=99;
	//assigning values to index areas
	//numbers[0]=40;
	//numbers[1]=55;
	//numbers[2]=63;
	//numbers[3]=17;
// System.out.println(numbers[2]);
 //System.out.println(numbers.length);
// System.out.println(numbers);}
	String[]names= {"ram, Hari, shyam,a ,b,c"};
	
//for(int i=0; i<numbers.length;i++){
//System.out.println(numbers[i]);

for(int i=0;i<names.length;i=i+2) {
	System.out.println(names[i]);



}
//for(String data:names) {
//System.out.println(data);}

//advance for loop
//for(double data:numbers) {
	//System.out.println(data);
}
}
//}
