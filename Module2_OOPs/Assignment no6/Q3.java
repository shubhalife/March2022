/*
3
Write a class MathOperation which accepts integers from command line.
Create an array using these parameters. 
Loop through the array and obtain the sum and average of all the elements.
Display the result. 
Check for various exceptions that may arise like ArithmeticException,
NumberFormatException, and so on.
For example: The class would be invoked as follows: C:>java MathOperation 1900, 4560, 0, 32500

*/

class Q3{
	public static void main(String... args){// java Q3 10 20 40
		int l= args.length;
		int arr[] = new int[l];
		int sum=0;
		int avg;
		try{
		for(int i=0 ;i<arr.length; i++){
			arr[i]=Integer.parseInt(args[i]);
			sum += arr[i];
		}
		avg=sum/l;
		System.out.println("The sum is "+sum+" and the average "+avg);
		System.out.println("Work done Successfully");
		}catch(NumberFormatException e){
			System.out.println("java.lang.NumberFormatException");
			System.out.println(e.getMessage());
		}catch(ArithmeticException e){
			System.out.println("java.lang.ArithmeticException");
			System.out.println(e.getMessage());
		}catch(Exception e){
			System.out.println("java.lang.Exception");
		}
		
	}
}