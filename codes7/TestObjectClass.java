class Num 
{
	int n;
	Num(int n)
	{
		this.n=n;
	}
	public String toString() // overriding
	{
		return "n = " +n;
	}
}
class  TestObjectClass
{
	public static void main(String[] args) 
	{
		Num obj=new Num(100);
		System.out.println(obj.n);

		 
		System.out.println(obj); // automatically call toString()

		Object ob=new Object();
		System.out.println(ob);

		Object r=new Num(200);
		System.out.println(r); // dyn method disp
	}
}
