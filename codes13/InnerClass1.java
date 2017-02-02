class Outer1
{
	
	private int i=100;
	void call()
	{
	//	Inner1 obj=new Inner1();
	//	obj.disp();
	//	System.out.println(obj.k);
	}
	class Inner1
	{
		int k=300;
		void disp()
		{
			System.out.println(i);//IMP
			System.out.println(k);
		}
	}
}
class InnerClass1 
{
	public static void main(String[] args) 
	{
		Outer1 obj1=new Outer1();
		obj1.call();
		//Inner1 obj=new Inner1(); Error

		Outer1.Inner1 obj=obj1.new Inner1(); // *****IMP ******
		obj.disp();
	}
}
