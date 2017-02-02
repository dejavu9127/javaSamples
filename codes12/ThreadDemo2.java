// 2. By Implementing Runnable interface

class Thr1  implements Runnable
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(" From Thr1 : " + i);
		}
	}
}
class  ThreadDemo2
{
	public static void main(String[] args) 
	{
		Thr1 obj=new Thr1();
		Thread objThr=new Thread(obj); //public Thread(Runnable target)
		objThr.start();
	//obj.start(); Error

		

		for(int i=0;i<=10;i++)
		{
			System.out.println(" From Main Thread : " + i);
		}
	}
}
