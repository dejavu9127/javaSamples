// static inner class

class Outer1
{
	private static int i=100;
	static class Inner1
	{
		static int k=200;
		void disp()
		{
			System.out.println(i+ "  " + k);
		}
	}
}
class  StaticInnerClassDemo1
{
	static class Inner2
	{
	}
	public static void main(String[] args) 
	{
		Outer1.Inner1 obj=new Outer1.Inner1();
		obj.disp();

		Inner2 obj1=new Inner2();
	}
}
