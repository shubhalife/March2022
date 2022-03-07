/*
 pattern 1
*
**
***
****
*****
******
*/
class R1
{
public static void main(String args[])
{
	for(int i=1 ; i<=6 ; i++)
	{
		for(int j=1 ; j<=i ; j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
