/*
6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/

import java.util.*;
class Q6
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Arithmetic operation of two number");
		System.out.println("Enter the first number");
		int a= sc.nextInt();
		System.out.println("Enter the first number");
		int b= sc.nextInt();
		System.out.println("Sum of "+a+" + "+b+" = "+(a+b));
		System.out.println("Subtraction of "+a+" - "+b+" = "+(a-b));
		System.out.println("Product of "+a+" x "+b+" = "+(a*b));
		if(b==0)
		{
			System.out.println("Divison is not possible as denominator is 0");
		}
		
		else
		{
			System.out.println("Division of "+a+" / "+b+" = "+((float)a/b));
			System.out.println("Remainder of "+a+" % "+b+" = "+(a%b));
		}
	}
}