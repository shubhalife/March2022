// Q3 WAP to reverse the array elements


class ReverseArray{
	public static void main(String... args){
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int brr[] = new int[10];
		
		
		for(int i =0,j=9;i<10 && j>=0;i++,j--){
			brr[i]=arr[j];
		}
		System.out.print("arr = [");
		for(int i =0; i<10; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
		System.out.print("brr = [");
		for(int i =0; i<10; i++){
			System.out.print(brr[i]+" ");
		}
		System.out.println("]");
		
	}

}