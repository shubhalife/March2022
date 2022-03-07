/*
pattern 1
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/
class P1
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)//for printing rows
		{
			for(int j=1;j<=i;j++)//for printing columns
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}	
	}
}

