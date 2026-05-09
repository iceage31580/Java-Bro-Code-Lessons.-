
public class MyThread extends Thread{
	
	public void run()
	{
		if(this.isDaemon()) {
		System.out.println("This is a daemon thread running"); 
		}
		else 
		{
			System.out.println("This is a user thread that is running"); 
		}
	}
}
