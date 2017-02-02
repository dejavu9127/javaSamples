class Reader extends Thread 
{
	Calculator c;

	public Reader(Calculator calc) 
	{
		c = calc;
	}

	public void run() 
	{
		synchronized(c) 
		{
			try 
			{
				System.out.println("Waiting for calculation...");
				c.wait();
			} 
			catch (InterruptedException e) 
			{
				System.out.println(e);
			}
			System.out.println("Total is: " + c.total);
		}

	}

	public static void main(String [] args) 
	{
		Calculator calculator = new Calculator();
		//Calculator calculator1 = new Calculator();
		//Calculator calculator2 = new Calculator();
		new Reader(calculator).start();
		new Reader(calculator).start();
		new Reader(calculator).start();
		calculator.start();
	//	calculator1.start();
	//	calculator2.start();

	}
 }

class Calculator extends Thread 
{
	int total;

	public void run() 
	{
		try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		synchronized(this) 
		{
			for(int i=0;i<1000;i++) 
			{
				total += i;
			}
			notifyAll();
			//notify();
		}
	}
 }