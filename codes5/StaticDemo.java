//static data & method
class Num
{
	int n;
	static int s;

	void disp()
	{
		System.out.println("n = " +n);
		System.out.println("s = " +s); //allowed
	}

	static void dispS()
	{
		System.out.println("s = " +s);
		//System.out.println("n = " +n); Error
	}
}
class  StaticDemo
{
	public static void main(String[] args) 
	{
		Num obj1=new Num();
		obj1.n=100;
		obj1.s=7;

		Num obj2=new Num();
		obj2.n=200;
		obj2.s=9;


		System.out.println(obj1.n);
		System.out.println(obj2.n);

		System.out.println(obj1.s);
		System.out.println(obj2.s);
		System.out.println(Num.s); // Using class name we can access static member


		obj1.disp();
		obj2.disp();
		Num.dispS();

	}
}
