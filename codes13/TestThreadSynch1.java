//synchronized method ,
class Callme 
{	 
	static int k;
    //  synchronized static method uses lock for a class****   
	synchronized static void call(String msg) 
	{
		System.out.print("[" + msg);
	
		try 
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e) 
		{
			System.out.println("Interrupted");
		}
		System.out.println("] " );
	}
}
class Caller extends Thread 
{
  String msg;
  Callme target;

  public Caller(Callme targ, String s) 
  {
    target = targ;
    msg = s;   
    start();
  }
  public void run() 
  {
    target.call(msg);
  }
}
class TestThreadSynch1 
{
  public static void main(String args[]) 
  {
    Callme target = new Callme();
	Callme target1 = new Callme();
	Callme target2 = new Callme();
	
    Caller ob1 = new Caller(target, "Hello");
    Caller ob2 = new Caller(target1, "Synchronized");
    Caller ob3 = new Caller(target2, "World");
 
  }
}
