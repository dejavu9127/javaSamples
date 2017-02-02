// if,for,while,do while , switch , break , continue
import java.util.*;
class  IfDemo
{
	public static void main(String[] args) 
	{
		int a,b;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter 2 numbers ");
		 a=sc.nextInt();
		 b=sc.nextInt();

		 if(a>b)
		{
			System.out.println("Max is " + a);
		}
		else
		{
			System.out.println("Max is " + b);
		}

	}
}
