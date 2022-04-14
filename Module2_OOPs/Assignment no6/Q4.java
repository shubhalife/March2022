/*
4
Write a program to accept name and age of a person from the command prompt
(passed as arguments when you execute the class) and ensure that the age entered is >=18 and < 60.
Display proper error messages. 
The program must exit gracefully after displaying the error message in case the arguments passed are not proper.
(Hint : Create a user defined exception class for handling errors.)

*/
class MyException extends Exception{
	MyException(String s){
		super(s);
	}
	
}

class Q4{
	public static void main(String... args){
		try{
		String s = args[0];
		int age  = Integer.parseInt(args[1]);
		if(age >= 18 && age <60){
			System.out.println(s+" is "+age+" years old");
		}
		else{
			throw new MyException("person age out of limit");
		}
		}catch(NumberFormatException e){
			System.out.println("java.lang.NumberFormatException: "+e.getMessage());
		}catch(MyException e){
			System.out.println(e.getMessage());
		}
	}
}