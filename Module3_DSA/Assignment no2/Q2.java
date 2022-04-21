//2. You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in the list. One of the integers is missing in the list. Write an efficient code to find the missing integer.
		

class Q2{
	static int find(int arr[]){
		int n=arr.length;
		int m =n+1;
		int sum = 0;
		int sum1=0;
		
		
		for(int i : arr){
			sum +=i;
		}
		
		/* for(int i=1;i<=(n+1);i++){
			sum1 += i;
		} */
		sum1 = (m*(m+1))/2;
		
		//System.out.println("sum "+sum);
		//System.out.println("sum1 "+sum1);
		return (sum1-sum);
	}
	
	
	
	
	
	public static void main(String... args){
		int  arr[] = {1, 2, 5, 6, 3, 7, 8};
		
		int result = find(arr);                
		
		System.out.println("The missing element is  "+result);
		
		
	}
	
	
	
}