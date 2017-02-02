// single inheritance
class Sup
{
	private int a,b;
	void setData(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	int getA()
	{
		return(a);
	}
	int getB()
	{
		return(b);
	}
	void disp()
	{
		System.out.println("a = " + a + " , b = " + b);
	}
}
class Sub extends Sup
{
	int c=11;
	void add()
	{
		disp();
		System.out.println("Addition is : " + (getA()+getB()+c));
	}
}
class  SingleInh
{
	public static void main(String[] args) 
	{
		Sub obj=new Sub();
		obj.setData(100,200);
		obj.add();
		
	}
}
