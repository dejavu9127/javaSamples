// instantiate Class using 3 ways
class TestClass3
{
	public static void main(String args[]) 
	{
		Class c1 = TestClass3.class; //1 , class literal
		System.out.println(c1.getName());

		TestClass3 obj=new TestClass3();
		Class c=obj.getClass(); //2 , java.lang.Object ->  getClass()
		System.out.println(c.getName());

		try
		{
			Class c2=Class.forName("java.lang.Object");
			//Class c2=Class.forName("TestClass3"); //3
			System.out.println(c2.getName());
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
	}
}