//final int z=100; //Global not allowed
class TestScope 
{
	public static void main(String[] args) 
	{

		int i;// local scope
		//System.out.println(i); // Error

		for( i=1;i<=10;i++)
		{
			System.out.println(i); 
		}

		System.out.println("Outside the loop : " + i);
	}
}
