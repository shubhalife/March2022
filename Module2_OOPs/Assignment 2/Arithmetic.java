class Funct{
	int a;
	int b;
	int ans;
	
	 Funct(int a, int b){
		this.a=a;
		this.b=b;
		System.out.println("consrtuctor invoked");
	}
	void add(){
		ans = a + b;
		System.out.println("Addition is "+ans);
	}
	void sub(){
		ans = a - b;
		System.out.println("subtraction is "+ans);
	}
	void mult(){
		ans = a * b;
		System.out.println("multiplication is "+ans);
	}
	void div(){
		ans = a / b;
		System.out.println("division is "+ans);
	}
	void mod(){
		ans = a % b;
		System.out.println("modulus is "+ans);
	}
}

class Arithmetic{
	public static void main(String...args){
		Funct f1 = new Funct(20,10);
		f1.add();
		f1.sub();
		f1.mult();
		f1.div();
		f1.mod();
	}
	
}
