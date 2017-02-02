class Sup
{
	 int a,b;
	void setData(int a,int b)
	{
		this.a=a;
		this.b=b;
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
		System.out.println("Addition is : " + (a+b+c));
	}
}
class  ReferencesInInh
{
	public static void main(String[] args) 
	{
		/*Sub obj=new Sub();
		obj.setData(100,200);
		obj.add(); */


		Sup r =new Sub();
		r.setData(1,2);
		r.disp();
		//r.add(); Error
		((Sub)r).add();
		
	}
}
