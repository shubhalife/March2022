/*Pattern P2
A
A B
A B C
A B C D
A B C D E


*/

class P2
{
	public static void main(String args[])
	{
		for(char i='A' ; i<='E' ; i++)//for printing rows
		{
			for(char j='A' ; j<=i ; j++)//for printing columns
			{
				System.out.print(" "+j);
			}
			System.out.println();			
		}
	}
}