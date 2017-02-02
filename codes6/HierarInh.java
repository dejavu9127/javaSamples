class Shape1
{
	int a,b;
	Shape1(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void disp()
	{
		System.out.println("a = " + a + " , b = " + b);
	}
}
class Tri extends Shape1
{
    Tri(int a,int b)
	{
		
		super(a,b); // super class constructor call , must be the first statement
		System.out.println("From Tri(a,b) ");
		
	}
	void area()
	{
		disp();
		System.out.println("Area of a tri : " + (0.5*a*b));
	}
}
class Rect extends Shape1
{
	 Rect(int a,int b)
	{
		super(a,b); // super class constructor call
	}
	void area()
	{
		System.out.println("Area of a rect : " + (a*b));
	}
}
class  HierarInh
{
	public static void main(String[] args) 
	{
		Tri objT=new Tri(10,20);
		Rect objR=new Rect(10,20);

		objT.area();
		objR.disp();
		objR.area();
	}
}
