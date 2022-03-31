//import java.lang.Math;

class Calculator{
	static double num1=5,num2=8;
	
	//static int num3=2,num4=6;
	//static double powerInt(double num1 , double num2)
	
	static double powerDouble()
	{	
		return Math.pow(num1,num2);
	}
	
	static int powerInt()
	{
		//return (int)Math.pow(num3,num4);
		
		return (int)Math.pow((int)num1,(int)num2);
	}
}
class CalculatorDemo{
	public static void main(String args[])
	{
			//System.out.println(Calculator.powerInt(Calculator.num1,Calculator.num2));
			System.out.println("Power of Double " +Calculator.powerDouble());
			System.out.println("Power of Int "+Calculator.powerInt());
	}
}