interface I
{
	void f1();
}
class AnonymousInnerClass 
{
	public static void main(String[] args) 
	{
		//1. which implements an interface
		Runnable r=new Runnable() {
			public void run()
			{
				System.out.println("Hello World!");
			}
		};
		Thread t=new Thread(r);
		t.start();

		//2 which extends from a superclass
		Thread t1=new Thread() {
			public void run()
			{
				System.out.println("Welcome ");
			}
		};

		t1.start();


		I v=new I() {
			public void f1()
			{

			}
		};
		v.f1();
		
	}
}
