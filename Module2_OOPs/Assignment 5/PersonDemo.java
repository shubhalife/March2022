import java.util.*;

class Person{

private int age;
private String name;

Scanner sc = new Scanner(System.in);
	Person(){
		System.out.println("Enter age and name");
		age = sc.nextInt();
		sc.nextLine();
		name=sc.nextLine();	
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void setName(){
		name = sc.nextLine();
	
	}
	public void setAge(){
		age = sc.nextInt();
		sc.nextLine();
	}
}

class PersonDemo{
	public static void main(String args[])
	{
		Person p = new Person();
		System.out.println(p.getName() + " "+ p.getAge());
		
		p.setAge();
		p.setName();
		//p.setAge();
		System.out.println(p.getName() + " "+ p.getAge());
		
		
	
	}

}