//4. Move all negative numbers to beginning and positive to end with constant extra space. 
//An array contains both positive and negative numbers in random order.   
// Rearrange the array elements so that all negative numbers appear before all positive numbers.


class Q4
{
   public static void main (String args[])
	{
		int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		
		 for (int i = 0; i<arr.length; i++)
		 {
			 if (arr[i]<0){System.out.print(arr[i]+" ");}
		
		 }
		 for (int i = 0; i<arr.length; i++)
		 {
			 if (arr[i]>=0){System.out.print(arr[i]+" ");}
		
		 }
		
	}
}