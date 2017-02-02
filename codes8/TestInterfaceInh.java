interface I1
{
	void f1();
}
interface I2
{
	void f2();
}
interface I3 extends I1,I2 // multiple
{
	void f3();
}
class Sup
{
    void f4()
	{
		System.out.println("f4()..");
	}
}
class Impl extends Sup implements I3
{
	public void f1()
	{
		System.out.println("f1()..");
	}
	public void f2()
	{
		System.out.println("f2()..");
	}
	public void f3()
	{
		System.out.println("f3()..");
	}
}
class  TestInterfaceInh
{
	public static void main(String[] args) 
	{
		Impl obj=new Impl();
		obj.f1();
		obj.f2();
		obj.f3();
		obj.f4();
	}
}
