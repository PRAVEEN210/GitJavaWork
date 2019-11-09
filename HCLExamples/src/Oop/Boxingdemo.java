package Oop;

public class Boxingdemo {
	public static void main(String args[])
	{
		int a=0;
		int b=0;
		
		if(args.length!=0)
		{
			//unboxing..
			//convert String object into into value to store it in a
			a=Integer.parseInt(args[0]);
			//convert String object into into value to store it in b
			b=Integer.parseInt(args[1]);
			//boxing-converting value into an object
			Integer result=a+b;
			
			System.out.println(result);
		}
		else
		{
			          System.out.println("Please pass two integers as arguments!");
		}
	}

}
