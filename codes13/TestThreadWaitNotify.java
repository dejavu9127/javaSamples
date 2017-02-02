// wait() and notify() , belongs to Object class
class TestThreadWaitNotify 
{
	public static void main(String [] args) 
	{
		 ThreadB b = new ThreadB();
		b.start();

		synchronized(b) 
		{
			try 
			{
				System.out.println("Waiting for b to complete...");
				b.wait();// release lock
				
			} 
			catch (InterruptedException e) 
			{
				System.out.println(e);
			}
			System.out.println("Total is: " + b.total);
		}
	}
}

class ThreadB extends Thread 
{
	int total=0;
	public void run() 
	{
		synchronized(this) 
		{
			for(int i=0;i<=5000;i++) 
			{
				total += i;
			}
		  notify();

		}// release lock
		try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}

		System.out.println(" From child thread , the last line ");

	}
}
