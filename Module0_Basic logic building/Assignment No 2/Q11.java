/*
11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
*/

import java.util.*;

class Q11
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		double r=sc.nextDouble();
		//final double pi = 22.0/7;
		double area = Math.PI*r*r;
		double p = Math.PI*2*r;
		System.out.println("Area of circle with radius "+r+" = "+area);
        System.out.println("perimeter of circle with radius "+r+" = "+p);
		
	}
	
}