class A
{
	A()
	{
		System.out.println("A()");
	}
}
class B extends A
{
	B()
	{
		System.out.println("B()");
	}
}
class C extends B
{
	C()
	{
		//super(); //by default executed
		System.out.println("C()");
	}
}
class  MultLevelInh
{
	public static void main(String[] args) 
	{
		C obj=new C();
	}
}
