class ArithemeticCal
{
	int add(int a,int b)
	{
		return (a+b);
	}
	int add(int a,int b,int c)
	{
		return (a+b+c);
	}
	float add(float a,float b)
	{
		return (a+b);
	}
}
class MethodOverloading 
{
	public static void main(String[] args) 
	{
		ArithemeticCal obj=new ArithemeticCal();
		System.out.println(obj.add(10,20));
		System.out.println(obj.add(10,20,30));
		System.out.println(obj.add(10.1f,20.2f));
	}
}
