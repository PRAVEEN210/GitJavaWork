package examples;
class Mythread implements Runnable
{
	private String threadName;
	//constructor
	Mythread()
	{
		threadName="Mythread";
		System.out.println("Thread"+threadName+"created");
	}
	@Override
	public void run() {
		System.out.println("Mythread"+threadName+" running successfully");
	}
}


public class Runnablethreaddemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("thread name:"+Thread.currentThread().getName()+"started");
		
		Mythread mt=new Mythread();
		mt.run();
	}

}
