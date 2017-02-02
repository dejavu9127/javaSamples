interface I1
{
	void f1();
}
interface I2
{
	void f2();
}
abstract class Impl implements I1,I2
{
	public void f1()
	{
		System.out.println("f1()..");
	}
}
class Sub extends Impl
{
	public void f2()
	{
		System.out.println("f2()..");
	}
}
class  TestMultImpl
{
	public static void main(String[] args) 
	{
		Impl obj=new Sub();
		obj.f1();
		obj.f2();
	}
}
