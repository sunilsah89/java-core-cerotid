package com.cerotid.assignment;

import java.util.Scanner;

public class Assignment001 {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter First number  : ");
		
		int firstNumber=myObj.nextInt();
		System.out.print("Enter Second number : ");
		int secondNumber=myObj.nextInt();
		
		addition(firstNumber,secondNumber);
		subtract(secondNumber,firstNumber);
		muntiply(firstNumber,secondNumber);
		divide(firstNumber,secondNumber);
		

	}
	
	public static void addition(int x, int y) {
		int add=x+y;
		System.out.println("Addition of "+x+" and "+y+" : " +add);
	}
	public static void subtract(int x, int y) {
		int sub=x-y;
		System.out.println("Subtract of "+x+" and "+y+" : " +sub);
	}
	public static void muntiply(int x, int y) {
		int mun=x*y;
		System.out.println("Muntiply of "+x+" and "+y+" : " +mun);
	}
	public static void divide(int x, int y) {
		int div=x/y;
		System.out.println("Divide of "+x+" and "+y+" : " +div);
	}
	

}
