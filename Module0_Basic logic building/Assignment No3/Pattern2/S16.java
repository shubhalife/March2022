/*
pattern 16

*
**
* *
*  *
*****
	
*/

class S16
{
	public static void main(String args[])
	{
	for(int i=1; i<=4; i++)
		{	
		System.out.print("*");
	for(int j=3; j<=i; j++)
		{
		System.out.print(" ");
		}
		if(i>=2){System.out.print("*");}
		System.out.println();
		}
		for(int i=1; i<=5; i++)
		{
		System.out.print("*");
		}
	}
	
}
		