class A
{
	static int s=20;
	static class B
	{
		void disp()
		{
			System.out.println(s);
		}
	}
}
class  StaticInner1
{
	public static void main(String[] args) 
	{
		A.B obj= new A.B();
		obj.disp();
	}
}
