import java.util.*;
class  LinearSearch
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers : ");
		int n=sc.nextInt();
		
		
		int []arr=new int[n]; //IMP , by default all values are 0
		System.out.println("Enter " + n + " values ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}


		System.out.println("output : ");
		for(int k : arr)
		{
			System.out.println(k);
		}


		System.out.println("Enter value to search : ");
		int s=sc.nextInt();

		boolean flag=false;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==s)
			{
				flag=true;
				System.out.println("Value found at location : " + i);
				break;
			}
		}

		if(flag==false)
		{
			System.out.println("not found");
		}
	}
}
