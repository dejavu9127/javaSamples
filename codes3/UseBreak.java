//break & continue
class  UseBreak
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				//break;
				continue; // continue with the next iteration
			}
			System.out.println(i);
		}
		System.out.println("abc");
	}
}
