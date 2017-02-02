// final data : constant
// final class : prevent inheritance
// final method : prevent method overriding

class A
{
	final void f1()
	{
		System.out.println("A.f1()");
	}
}
class B extends A
{
	void f1() //overriding
	{
		
		System.out.println("B.f1()");
	}

}
class  TestFinalKeyword
{
	public static void main(String[] args) 
	{
		//(new B()).f1();
		B obj=new B();
		obj.f1();
	}
}
