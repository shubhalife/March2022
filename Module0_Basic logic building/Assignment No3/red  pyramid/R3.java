/*
 pattern 3
 
* * * * * *
 * * * * *
  * * * *
   * * *
    * *
     *

*/
class R3
{
public static void main(String args[])
{
	for(int i=6 ; i>=1 ; i--)
	{
		for(int k=5 ; k>=i ; k--)
		{
			System.out.print(" ");
		}
		for(int j=1 ; j<=i ; j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}