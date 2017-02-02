class MyChildThread implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(" i = " + i);
		}
	}
}
class  JoinDemo
{
	public static void main(String[] args) 
	{
		MyChildThread obj=new MyChildThread();
		Thread objThr = new Thread(obj);
		objThr.start();
		//System.out.println(" before calling join method " + objThr.isAlive());
		try
		{
			objThr.join(); //Waits for this thread to die.
			
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}

		//System.out.println(" after calling join method " + objThr.isAlive());
		System.out.println("Last line , closing activity in main ");
	}
}
