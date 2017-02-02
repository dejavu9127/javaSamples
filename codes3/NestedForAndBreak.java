class NestedForAndBreak 
{
	public static void main(String[] args) 
	{
		xyz:for(int i=1;i<=2;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
				{
					//break xyz;
					continue xyz; // continue with the next iteration
				}
				System.out.println(i+ "  " + j);
			}
			System.out.println(" Outside the j loop ");
		}
		System.out.println("Hello World!");
	}
}
