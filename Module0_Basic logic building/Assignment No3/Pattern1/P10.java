/*
pattern 10
    E
   D E
  C D E
 B C D E
A B C D E 
*/

class P10
{
	public static void main(String args[])
	{
		for(char i='E'; i>='A'; i--)
		{
			
			for(char j='B'; j<=i;j++)
			{
				System.out.print(" ");
			}
			for(char k=i ; k<='E'; k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
