/*
15. Write a Java program to swap two variables.
*/

import java.util.*;
class Q15
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n1");
		int n1=sc.nextInt();
		System.out.println("Enter n2");
		int n2=sc.nextInt();
		System.out.println("before swapping");
		System.out.println("n1 = " +n1);
		System.out.println("n2 = " +n2);
		n1=n1 + n2;
		n2 = n1 - n2;
		n1 = n1 -n2;
		System.out.println("After swapping");
		System.out.println("n1 = " +n1);
		System.out.println("n2 = " +n2);
		
		
		
		
	}
}