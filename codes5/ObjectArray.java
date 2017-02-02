//object array
import java.util.*;
class Emp
{
	 int empNo; 
	 String name;


	Emp(int en,String name) // constructor
	{		
		empNo=en;
		this.name=name;
	}



	void disp()
	{
		System.out.println("Emp Number : " + empNo);
		System.out.println("Name : "+name);
	}
	
}
class ObjectArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many employees : ");
		int n=sc.nextInt();
		Emp []arr=new Emp[n]; // object references array
		
		/*for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]); // all null
		}*/
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter empNo & name ");
			int no=sc.nextInt();
			String nm=sc.next();
			arr[i]=new Emp(no,nm);
		}
   //  Emp obj=new Emp(1,"abc");
	//	Emp []arr={new Emp(101,"aa") ,obj, new Emp(102,"bb")};


		for(Emp k : arr)
		{
			k.disp();
		}
		
		System.out.println("Enter name to search : ");
		String nm =sc.next();

		boolean flag=false;

		for(int i=0;i<n;i++)
		{
			//if(arr[i].empNo == no)

			if(arr[i].name.equalsIgnoreCase(nm)) //equals
			{
				flag=true;
				System.out.println("Emp Num : " + arr[i].empNo);
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("not found");
		}



		
	}
}
