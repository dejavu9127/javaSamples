// throw , throws
class  TestThrowThrowsKeywords1
{
	static void f2() throws Exception
	{
		try
		{

			throw new Exception();
		}
		catch(Exception e)
		{
			
			System.out.println(e);
		}
	}
	static void f1() throws Exception
	{
		f2();
	}
	public static void main(String[] args)// throws Exception
	{
		//try
		//{
			f1();
		//}
		/*catch(Exception e)
		{
			System.out.println(e);
		}*/
		System.out.println("last line of main");
	}
}
