/*
pattern pyramid pattern5

                9 
              8 9 8
            7 8 9 8 7
          6 7 8 9 8 7 6
        5 6 7 8 9 8 7 6 5
      4 5 6 7 8 9 8 7 6 5 4
    3 4 5 6 7 8 9 8 7 6 5 4 3
  2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
   	   
*/

class M5
{
	public static void main(String args[])
	{ 
	for(int i=9; i>=1; i--)
		{	
		  int m=i;
		  int n=i-1;
		for(int j=1; j<=i; j++)
		{
		System.out.print("  ");
		}
		for(int k=9; k>=i; k--)
		{
		System.out.print(m+" ");
		m++;
		}
		for(int l=8; l>=i; l--)
		{
		System.out.print(l+" ");
		}
		System.out.println();
		}
	}
	
}