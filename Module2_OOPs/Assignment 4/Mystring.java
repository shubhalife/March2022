/*
i/p: ab cd ef gh ij kl
o/p: kl ij gh ef cd ab

*/


class Mystring{
	public static void main(String... args){
		String s ="ab cd ef gh ij kl";
		System.out.println(s);
		String[] arr =s.split(" ");
		
		
		 for(int i=arr.length-1; i>=0; i--){
			System.out.print(arr[i]+" ");
			} 
		
	}


}