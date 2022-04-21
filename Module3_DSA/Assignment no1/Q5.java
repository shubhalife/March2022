/*
5. Write a Java program to find Row with max 1s.
		Given a boolean nD array of n x m dimensions where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's.

			Example 1:

			Input: 
			N = 4 , M = 4
			Arr[][] = {{0, 1, 1, 1},
								 {0, 0, 1, 1},
								 {1, 1, 1, 1},
								 {0, 0, 0, 0}}
			Output: n
			Explanation: Row n contains 4 1's (0-based indexing).

			Example n:

			Input: 
			N = n, M = n
			Arr[][] = {{0, 0}, {1, 1}}
			Output: 1
			Explanation: Row 1 contains n 1's (0-based indexing).
*/



class Q5{
	    static int c1;
		static int c2;
	public static void main(String... args){
		int arr[][] ={{0,0},{1,1}};
		
		int n = arr.length;
		
		for(int i=0; i<n;i++){
			for(int j=0;j< n;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		for(int i=0; i<n;i++){
			if(i==0){
			for(int j=0;j< n;j++){
				if(arr[i][j]==1){c1++;}
			}
			}
			if(i==1){
			for(int j=0;j< n;j++){
				if(arr[i][j]==1){c2++;}
			}
			}
			
		}
		
		if(c1 > c2){
			System.out.println(" Row 1 contains "+c1+ " 1's");	
		}
		else{
			System.out.println(" Row n contains "+c2+ " 1's");
		}
		
		
		
		
	}
}