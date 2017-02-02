abstract class MyClass
{
	abstract void f1();
}
class Sub extends MyClass
{
	 void f1()
	{
		 System.out.println("Hello World!");
	}
}
class  TestAbstractClass
{
	public static void main(String[] args) 
	{
		MyClass obj=new Sub();
		obj.f1();
		
	}
}
