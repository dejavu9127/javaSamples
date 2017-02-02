// uncaught exceptions
class  ExceptionDemo1
{
	static void f2()
	{
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);

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
/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ExceptionDemo1.f2(ExceptionDemo1.java:8)
        at ExceptionDemo1.f1(ExceptionDemo1.java:14)
        at ExceptionDemo1.main(ExceptionDemo1.java:18)

Press any key to continue...
*/