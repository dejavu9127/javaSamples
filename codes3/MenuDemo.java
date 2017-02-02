// menu driven app
import java.util.*;

class  MenuDemo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first value : ");
		int a=sc.nextInt();
		System.out.println("Enter second value : ");
		int b=sc.nextInt();
		int c=0;
		float d;
		int ch;
		do
		{
			System.out.println("1. Add");
			System.out.println("2. Sub");
			System.out.println("3. Mult");
			System.out.println("4. Div");
			System.out.println("5. Exit");

			System.out.println("Enter your choice : ");
			 ch=sc.nextInt();
			
			switch(ch)
			{
				case 1: c=a+b; break;
				case 2: c=a-b; break;
				case 3: c=a*b; break;
				case 4: d=(float)a/b; 
						System.out.println("Result is : " +d);
						break;
				case 5: System.exit(0);
				default: System.out.println("Wrong choice ");

			}

			if(ch>=1 && ch<=3)
				System.out.println("Result is : " +c);

		}while(ch!=5);


	}
}
