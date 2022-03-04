/* 2. Write a Java program to print the sum of two numbers.
Test Data: 74 + 36 */

import java.util.*;

class Q2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Sum program");
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		System.out.println("The sum of the number = "+(a+b));
	}
}