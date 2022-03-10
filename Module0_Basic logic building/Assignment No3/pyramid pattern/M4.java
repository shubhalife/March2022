/*
pattern pyramid pattern4

                1 
              1 2 1
            1 2 3 2 1
          1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
      1 2 3 4 5 6 5 4 3 2 1
    1 2 3 4 5 6 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
   	   
*/

class M4
{
	public static void main(String args[])
	{
	for(int i=1; i<=9; i++)
		{	
			int s=i-1;
		for(int j=8; j>=i; j--)
		{
		System.out.print("  ");
		}
		for(int k=1; k<=i; k++)
		{
		System.out.print(k+" ");
		}
		for(int n=2; n<=i; n++)
		{
		System.out.print(s+" ");
		s--;
		}
		System.out.println();
		}
	}
	
}