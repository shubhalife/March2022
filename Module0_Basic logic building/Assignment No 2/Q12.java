/*
12. Write a Java program that takes three numbers as input to calculate and print the
average of the numbers.
*/

import java.util.*;

class Q12
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Avgerage of three numbers");
		System.out.println("Enter three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Avgerage of "+a+" "+b+" "+c+" is "+(float)((a+b+c)/3));
		
		
	}
}