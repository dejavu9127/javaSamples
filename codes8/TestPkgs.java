//import pack1.P1;
//import pack1.*;
import pack1.nest.*;
class Impl implements PI
{
	public void f1()
	{
		System.out.println("f1()..");
	}
}

class  TestPkgs
{
	public static void main(String[] args) 
	{
		//pack1.P1 obj=new pack1.P1(); //without import
		P1 obj=new P1();
		obj.fromPack();

		P2 obj2=new P2();
		obj2.fromP2();

		P2.s1();

		Impl obj3=new Impl();
		obj3.f1();

		nest.NestedPkgClass obj4=new nest.NestedPkgClass();
		obj4.fromNestPkg();

	}
}
