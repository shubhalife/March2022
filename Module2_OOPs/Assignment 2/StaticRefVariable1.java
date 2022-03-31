class B{
	int p;
	int q;
}

class A{
	static B b;
	
	int x;
	int y;
}

class StaticRefVariable{
	static int i;
	static StaticRefVariable svar;
	static A avar;
	
	int a;
	int b;
	
}


class StaticRefVariable1{
	public static void main(String... args){
	
		StaticRefVariable.i = 100;
		StaticRefVariable.svar = new StaticRefVariable();
		StaticRefVariable.avar = new A();
		A.b = new B();
		
		StaticRefVariable.svar.a = 10;
		StaticRefVariable.svar.b = 10;
		
		StaticRefVariable.avar.x = 100;
		StaticRefVariable.avar.y = 200;
		
		A.b.p = 100;
		A.b.q = 200;
		
		System.out.println(StaticRefVariable.svar.a);
		System.out.println(StaticRefVariable.svar.b);
		System.out.println(StaticRefVariable.avar.x);
		System.out.println(StaticRefVariable.avar.y);
		System.out.println(A.b.p);
		System.out.println(A.b.q);
		
		
		
		
	}
}