/*
5. Recursive program to print formula for GCD of n integers. 
Given a function gcd(a, b) to find GCD (Greatest Common Divisor) of two number. 
It is also known that GCD of three elements can be found by 		   
gcd(a, gcd(b, c)), similarly for four element it can find the GCD by gcd(a, gcd(b, gcd(c, d))). 
Given a positive integer n. The task is to 			
print the formula to find the GCD of n integer using given gcd() function.
		Examples: 


		Input : n = 3
		Output : gcd(int, gcd(int, int))

		Input : n = 5
		Output : gcd(int, gcd(int, gcd(int, gcd(int, int))))

*/
import java.util.*;
class Q5{
	static String m1(int n){
		
		if(n==1)
			return "int";
		return "gcd(int, "+ m1(n -1) +")";
		
		
	}
	
	
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(m1(n));
	}
}