class Animal{

	void eat(){
	System.out.println("Animal eat");
	}

	void sleep(){
	System.out.println("Animal sleep");
	}

}
class Birds extends Animal{
	void eat(){
	System.out.println("Birds eat");
	}

	void sleep(){
	System.out.println("Birds sleep");
	}
	
	void fly(){
	System.out.println("Birds fly");
	}
}

class Jungle{
	public static void main(String[] args){
		Animal a1= new Animal();
		a1.eat();
		a1.sleep();
		Birds b1 = new Birds();
		b1.eat();
		b1.sleep();
		b1.fly();
		
		
	}


}