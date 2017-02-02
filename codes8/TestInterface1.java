// interfaces are 100% abstract

interface I1 // abstract
{
	int K=100; // public,static,final
	void f1(String msg); // public , abstract

	/*void f2()
	{
	}*/
}
class Impl implements I1
{
	public void f1(String msg)
	{
		//++K; Error
		System.out.println(msg);
		System.out.println("f1() is called , K = "+K);
	}
}
class  TestInterface1
{
	public static void main(String[] args) 
	{
		//I1 obj=new I1(); Error
		I1 r=new Impl();
		r.f1("Hello");
		System.out.println(I1.K);
	}
}
