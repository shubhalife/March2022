/*pattern P8
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5
*/

class P8
{
	public static void main(String args[])
	{
		int m;
		for(int i=5;i>=1; i--)
		{
			m=i;
			for(int j=2; j<=i ;j++)
			{
				System.out.print(" ");
			}
			for(int k=5; k>=i; k--)
			{
				System.out.print(m+" ");
				m++;
			}
			System.out.println();
		}
	}
}
