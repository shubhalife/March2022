//1. Problem: Given an array arr[] of n elements, write a function to search a given element x in arr[].


class Q1{
	 static int linearSearch(int arr[], int x, int n){
		 for(int i = 0; i<n;i++){
			 if(arr[i]==x){
				return i; 
			 }
		 }
		  return -1;
		 
	 }
	
	public static void main(String... args){
		int arr[] ={30, 40, 50, 10, 20};
		int n= arr.length;
		int x = 10;
		
		int result = linearSearch(arr,x,n);
		
		if(result==-1){
			System.out.println("Element x is not present in arr[]");
		}
		else{
			System.out.println("Element "+ x + " is present at index "+ result);
		}	
	}
}