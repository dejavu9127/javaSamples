// priority

class Thread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=35; i++)
		{
			System.out.println("from Thread1 " + i);
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=35; i++)
		{
			System.out.println("from Thread2 " + i);
		}
	}
}
class ThreadPriority 
{
	public static void main(String[] args) 
	{
		Thread1 obj1=new Thread1();
		Thread2 obj2=new Thread2();
		
		obj1.setPriority(Thread.MIN_PRIORITY);
		obj2.setPriority(10);// max

		System.out.println("thr1 prio : " + obj1.getPriority());
		System.out.println("thr2 prio : " + obj2.getPriority());
		System.out.println("Main thread Prio : " + Thread.currentThread().getPriority());

		obj1.setName("MyFirstThread");
		obj2.setName("MySecondThread");

		System.out.println("thr1 name : " + obj1.getName());
		System.out.println("thr2 name : " + obj2.getName());

		Thread.currentThread().setName("MyMainThr");

		System.out.println("Main thread name : " + Thread.currentThread().getName());

		obj2.start();
		obj1.start();


	}
}
/*
from Thread1 1
from Thread2 1
from Thread1 2
from Thread1 3
from Thread1 4
from Thread1 5
from Thread1 6
from Thread1 7
from Thread2 2
from Thread2 3
from Thread2 4
from Thread2 5
from Thread2 6
from Thread2 7
from Thread2 8
from Thread2 9
from Thread2 10
from Thread2 11
from Thread2 12
from Thread2 13
from Thread2 14
from Thread1 8
from Thread1 9
from Thread2 15
from Thread1 10
from Thread2 16
from Thread1 11
from Thread2 17
from Thread1 12
from Thread2 18
from Thread1 13
from Thread2 19
from Thread1 14
from Thread2 20
from Thread1 15
from Thread2 21
from Thread1 16
from Thread2 22
from Thread1 17
from Thread2 23
from Thread1 18
from Thread2 24
from Thread1 19
from Thread2 25
from Thread1 20
from Thread2 26
from Thread2 27
from Thread1 21
from Thread2 28
from Thread1 22
from Thread2 29
from Thread1 23
from Thread2 30
from Thread1 24
from Thread2 31
from Thread1 25
from Thread2 32
from Thread1 26
from Thread2 33
from Thread1 27
from Thread2 34
from Thread1 28
from Thread2 35
from Thread1 29
from Thread1 30
from Thread1 31
from Thread1 32
from Thread1 33
from Thread1 34
from Thread1 35

Press any key to continue...*/







































































