/*
 pattern 6
 
******
*   *
*  *
* *
**
*

*/
class R6
{
public static void main(String args[])
{
	for(int i=1 ; i<=6 ; i++)
	{
		System.out.print("*");
	}
	System.out.println();
	for(int i=5 ; i>=1 ; i--)
	{
		System.out.print("*");
		for(int m=3 ; m<=i ; m++)
		{
			System.out.print(" ");
		}
		if(i!=1){System.out.print("*");}
		System.out.println();
	}
	
}
}