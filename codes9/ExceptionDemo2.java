// handle exceptions : try,catch,throw,throws,finally
class  ExceptionDemo2
{
	static void f2()
	{
		int a=10;
		int b=0;
		System.out.println("Hello");
		try
		{
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}
	static void f1()
	{
		f2();
	}
	public static void main(String[] args) 
	{
		f1();
		System.out.println("last line in main...");
	}
}
