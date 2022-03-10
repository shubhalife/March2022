/*
pattern 13
    A
   B B
  C C C
 D D D D
E E E E E   
*/

class P13
{
	public static void main(String args[])
	{
		
		for(char i='A'; i<='E'; i++)
		{
			
			for(char j='D'; j>=i;j--)
			{
				System.out.print(" ");
			}
			for(char k='A' ; k<=i; k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
