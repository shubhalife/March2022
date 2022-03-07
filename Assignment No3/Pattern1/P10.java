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
		char m;
		for(char i='E'; i>='A'; i--)
		{
			m=i;
			for(char j='B'; j<=i;j++)
			{
				System.out.print(" ");
			}
			for(char k='E' ; k>=i; k--)
			{
				System.out.print(m+" ");
				m++;
			}
			System.out.println();
		}
	}
}
