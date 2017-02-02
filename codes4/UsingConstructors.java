class Emp
{
	private int empNo; // instance variables
	private String name;
	Emp()
	{
		empNo=0;
		name="Unknown";
	}

	Emp(int en,String name) // constructor
	{
		if(en>0)//validation
		  empNo=en;
		this.name=name;
	}

	Emp(Emp temp) // Emp temp=a2;
	{
		empNo=temp.empNo;
		name=temp.name;
	}

	void disp()
	{
		System.out.println("Emp Number : " + empNo);
		System.out.println("Name : "+name);
	}
	
}
class UsingConstructors
{
	public static void main(String[] args) 
	{
		Emp a1=new Emp(101,"Guru"); // allocate memory using new , () is for constructor call
		
		Emp a2=new Emp(102,"Shree");

		Emp a3=new Emp(); 

		Emp a4=new Emp(a2); // call to copy constructor
		
		a1.disp();
		a2.disp();
		a3.disp();
		a4.disp();
		//System.out.println(a1.name); Error

	}
}
