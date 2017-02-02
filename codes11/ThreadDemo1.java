class MyThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(" From my thread : " + i);
		}
	}
}
class  ThreadDemo1
{
	public static void main(String[] args) 
	{
		MyThread obj=new MyThread();
		obj.start();
		MyThread obj2=new MyThread();
		obj2.start();

		for(int i=1;i<=10;i++)
		{
			System.out.println(" From main  : " + i);
		}
	}
}
