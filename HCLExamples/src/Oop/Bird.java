package Oop;

public class Bird {
	//instance variables needed to store object data
	public static int legs=2;
	public static int wings=2;
	public String birdName;
	public String birdColour;
	private boolean singStatus;
	
	//constructor is a method used to initilize common values to the attributes or properties
	Bird()
	{
		legs=2;
	}
	//setter method to set value for private variable
	public void setsingingStatus()
	{
		if(this.birdName.equalsIgnoreCase("kokila"))
		{
			singStatus=true;
		}
	}
	//methods to describe the behavior of object
	public void walk()                                                                                                                                                        
	{
		System.out.println(birdColour+" "+birdName+" is walking with"+legs+" legs.");
	}
	
	public void fly()
	{
		System.out.println(birdColour+" "+birdName+" is flying with"+wings+" wings.");
	}
    public void sing()
    {
    	if(singStatus)
    	{
    		System.out.println("la ra looo....la ra looo...");
    	}else
    	{
    		System.out.println("can't sing!!!");
    	}
    }
}
