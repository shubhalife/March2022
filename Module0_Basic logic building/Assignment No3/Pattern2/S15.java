/*
pattern 15

    *
   **
  * *
 *  *
*****
	
*/

class S15
{
	public static void main(String args[])
	{
		
		for(int i=1; i<=4; i++)
		{	
			for(int k=4; k>=i;k--)
			{
				System.out.print(" ");
			}
			
			System.out.print("*");
			for(int j=3; j<=i;j++)
			{
				System.out.print(" ");
			}
			if(i>=2)
			{System.out.print("*");}
			System.out.println();
		}
		for(int j=1; j<=5;j++)
			{
				System.out.print("*");
			}	
	}
}
