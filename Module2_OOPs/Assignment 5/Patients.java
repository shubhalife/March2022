
class Patient{
	private static String name;
	private double weight;
	private double height;
	private double bmi;
	
	Patient(double weight, double height){
		this.weight=weight;
		this.height=height;
	}
	static void setName(String n){
		name=n;
	}
	
	void setWeight(double weight){
		this.weight=weight;
	}
	
	void setHeight(double height){
		this.height=height;
	}
	
	double getWeight(){
		return this.weight;
	}
	double getHeight(){
		return this.height;
	}
	
	double bmi(){
		bmi = (weight /(height*height))*703;
		return bmi;
	}	
}

class Patients{
	public static void main(String... args){
		Patient.setName("RAjkumar");
		Patient p1 = new Patient(53.0,69.0);
		System.out.println("The BMI of "+Patient.name+" is "+p1.bmi());
		
	}
}