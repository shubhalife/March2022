class Funct{
	private double length;
	private double breath;
	private double height;
	private double volume;
	
	public Funct(double length, double breath, double height){//..........................parametric constructor
		this.length=length;
		this.breath=breath;
		this.height=height;
	}
	public void setLength(double length){//....................................setter
		this.length=length;
	}
	
	public void setBreath(double breath){
		this.breath=breath;
	}
	
	public void setHeight(double height){
		this.height=height;
	}
	public double getVolume(){//.........................................getter
		volume = length * breath * height ;
		return volume;
	}	
}
class Box
{
	public static void main (String args[])
	{
		Funct f1 =new Funct(10.0,120.0,12.0);
		System.out.println("volume of box"+f1.getVolume());
	}
}