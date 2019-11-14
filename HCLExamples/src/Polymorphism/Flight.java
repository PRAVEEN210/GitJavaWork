package Polymorphism;

public class Flight extends Bird implements inherit.Automobile {
	private int wheels;
	public String flightNumber;
	private String airLines;
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getAirLines() {
		return airLines;
	}
	public void setAirLines(String airLines) {
		this.airLines = airLines;
	}
	@Override
	public boolean selfdriven() {
		//TODO Auto-generated method stub
		return true;
		
	}
	//method overriding
	@Override 
	public void fly()
	{
		//we can call super class fly method also by using keyword
		super.fly();
		System.out.println("Flight"+this.flightNumber+"belongs to"+this.airLines+"starting..."+"has"+this.tails+"tail decorate with red colour");
		System.out.println("Start first Engine");
		System.out.println("Drive the flight towards runway");
		System.out.println("Once Flight reaches the runway");
		System.out.println("Start second Engine");
		System.out.println("Take off");
	}
	

}
