/* 1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
Expected Output :
Hello
Alexandra Abramov */
import java.util.*;
 
class Q1
{
	public static void main(String args[])
	{
		
		Scanner sc= new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Hello");
		System.out.println("Name "+name);
	
	}
	
}