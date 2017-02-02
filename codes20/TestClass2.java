class Simple
{
	void message()
	{
		System.out.println("Hello Java");
	}
}
class TestClass2
{
	public static void main(String args[])
	{
		try
		{
			Class c=Class.forName("Simple");
			//Creates a new instance of the class represented by this Class object. 
			Simple s=(Simple)c.newInstance(); // object is created
			s.message();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}