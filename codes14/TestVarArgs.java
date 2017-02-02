// var arg (from J2SE 1.5)
class  TestVarArgs
{
	static void disp(int...v)
	{
		System.out.println("length : "+v.length);
		for(int k : v)
		{
			System.out.println(k);
		}
	}
	public static void main(String[] args) 
	{
		disp(10,20,30);
		disp(11,22,33,44,55,66);
		disp();
	}
}
