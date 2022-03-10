/* 3. Write a Java program to divide two numbers and print on the screen.
Test Data : 50/3
Expected Output : 16 */

import java.util.*;
 
class Q3
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Division program ");
		System.out.println("Enter the numerator ");
		int a= sc.nextInt();
		System.out.println("Enter the denominator ");
		int b= sc.nextInt();
		if(b==0)
		{
			System.out.println("Denominator cannot be zero ");
		}
		else
		{
			float c = (float)a/b;
			System.out.println("Division is "+c);
		}	
	}	
}