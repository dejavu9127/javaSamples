class MethodOverloadingUsingStatic 
{
	static int add(int a,int b)
	{
		return (a+b);
	}
	static int add(int a,int b,int c)
	{
		return (a+b+c);
	}
	static float add(float a,float b)
	{
		return (a+b);
	}
	static int s=100;
	public static void main(String[] args) 
	{
	
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));
		System.out.println(add(10.1f,20.2f));
		System.out.println(s);
	}
}
