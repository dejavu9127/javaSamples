// sleep()

class Thr1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=4;i++)
		{
			try
			{
				Thread.sleep(1000); // 1 second
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(" From Thr1 : " + i);
		}
	}
}
class  ThreadDemo3
{
	public static void main(String[] args) 
	{
		Thr1 obj=new Thr1();
		obj.start();
		

		for(int i=1;i<=4;i++)
		{
			System.out.println(" From Main Thread : " + i);
			try
			{
				Thread.sleep(1000); // 1 second
			}
			catch(InterruptedException e) // checked exception
			{
				System.out.println(e);
			}
		}
	}
}
