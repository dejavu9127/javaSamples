class A
{
	int i=100;
	void f1()
	{
		System.out.println("A.f1()");
	}
}
class B extends A
{
	int i=200;
	void add()
	{
		System.out.println(i+super.i);
	}
	void f1() //overriding
	{
		
		System.out.println("B.f1()");
		super.f1();
	}
}
class  SecondUseOfSuper
{
	public static void main(String[] args) 
	{
		B obj=new B();
		obj.add();
		obj.f1();
	}
}
