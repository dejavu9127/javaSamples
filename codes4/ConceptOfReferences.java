class Num
{
	int n;
	Num(int n)
	{
		this.n=n;
	}
	void disp()
	{
		System.out.println(n);
	}
}
class ConceptOfReferences 
{
	public static void main(String[] args) 
	{
		Num r1=new Num(100);
		Num r2=r1;
		r1.disp();
		r2.disp();

		r1.n=400;
		r1.disp();
		r2.disp();
	}
}
