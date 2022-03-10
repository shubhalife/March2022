/*
7. Write a Java program that takes a number as input and prints its multiplication
table upto 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/

import java.util.*;

class Q7
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int a= sc.nextInt();
		if(a!=0)
		 {	
		 System.out.println("Mulitiplication table of "+a);
		   for(int i=1; i<=10 ; i++)
		   {	
		     System.out.println(+a+"x"+i+"="+(a*i));
		   }
		 }
		else
		 {
			System.out.println("Invalid input");
		 }	
	}
}