package Examples;

//exception handling demo
//custom exception
class Myexception extends Exception
{
	//constructor
	Myexception()
	{
		System.out.println("My exception created");
	}
	public Myexception handler()
	{
		System.out.println("Exception handled here...");
		return this;
    }
}
public class Addingdemo {

	public static void main(String[] args) throws Myexception {
		
		int a,b;
		Integer result;
		if(args.length!=2)
		{
		         System.out.println("please pass two numbers as arguments!");	
		}else
		{
			try {
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			
			result=a/b;
			System.out.println(result);
			}
				
			catch(Exception e)
			{
				//e.printStackTrace();
				//system.out.println("Exception occurred!"); 
				throw new Myexception().handler();
			}finally {
				result=null;
				System.out.println("Result object set to null,Finally block executed");
			
			}
			
		}

	}

}
