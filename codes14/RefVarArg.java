// var arg of ref type
class A
{
	void f1()
	{
		System.out.println("A");
	}
}
class B extends A
{
	void f1()//override
	{
		System.out.println("B");
	}
}
class C extends A
{
	void f1()
	{
		System.out.println("C");
	}

}
class  RefVarArg
{
	static void show(A...r)
	{
		for(A k : r)
		{
			k.f1();
		}
	}
	public static void main(String[] args) 
	{
		show(new A(),new B(),new C());
	}
}
