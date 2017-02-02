// user defined exception class
import java.util.*;
class NegativeNumberException extends Exception
{
	int n;
	
	NegativeNumberException(int n)
	{
		this.n=n;
	}

	public String toString()
	{
		return(" You entered wrong value  : "+n);
	}
}
class  TestUserDefinedException
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter +ve number : ");
		try
		{
			int k=sc.nextInt();
			if(k<0)
			{
				throw new NegativeNumberException(k);
			}
			else
			{
				System.out.println("value : " + k);
			}
		}
		catch(InputMismatchException k)
		{
			System.out.println(k);
		}
		catch(NegativeNumberException e)
		{
			System.out.println(e); // call to toString()
		}

	}
}
