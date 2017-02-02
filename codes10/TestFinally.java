// finally keyword
class  TestFinally
{
	public static void main(String[] args) 
	{
		try
		{
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println("c = " + c);
			return ;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("from catch : " + e);
		}

		finally
		{
			System.out.println("from finally , closing code ");
		}
		System.out.println("last line");
	}
}
