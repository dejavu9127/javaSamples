// 1. By extending Thread class

class Thr1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(" From Thr1 : " + i);
			//if(i==5)
				//stop(); // kill , unsafe operation
		}
	}
}
class  ThreadDemo1
{
	public static void main(String[] args) 
	{
		Thr1 obj=new Thr1();
		obj.start();
		//obj.start(); // Exception
		//obj.run(); // single thread

		for(int i=0;i<=10;i++)
		{
			System.out.println(" From Main Thread : " + i);
		}
	}
}
/*

D:\>javac -Xlint:deprecation ThreadDemo1.java
ThreadDemo1.java:11: warning: [deprecation] stop() in java.lang.Thread has been
deprecated
                                stop(); // kill
                                ^
1 warning

D:\>


*/