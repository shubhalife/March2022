//instance ref variable

class A{
	int x;
	int y;
}

class InstanceRefVariable1{
	int i;
	int j;
	A a;
	

}


class InstanceRefVariable{
	public static void main(String... args){
		InstanceRefVariable1 irv = new InstanceRefVariable1();
		irv.i = 10;
		irv.j = 20;
		irv.a = new A();
		
		irv.a.x = 30;
		irv.a.y = 40;
		
		
		System.out.println(irv.i); //100
		System.out.println(irv.j); //200
		System.out.println(irv.a.x); //300
		System.out.println(irv.a.y); //400
		
	}
}