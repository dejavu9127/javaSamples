import java.util.*;
class  ReadData
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nos ");
		String s=sc.nextLine();
		String arr[]=s.split(" ");

		for(String k : arr)
		{
			System.out.println(k);
		}
	}
}
