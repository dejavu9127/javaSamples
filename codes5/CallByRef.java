// call by ref
class Num
{
	int n;
}
class  CallByRef
{
	static void modify(Num t) // Num t=obj1;
	{
		t.n=0;
	}
	public static void main(String[] args) 
	{
		Num obj1=new Num();
		obj1.n=100;
		System.out.println(obj1.n);
		modify(obj1);
		System.out.println(obj1.n);

	}
}
