class Emp
{
	private int empNo;
	private String name;

	void setData(int en,String name) // shadowing
	{
		if(en>0)//validation
		  empNo=en;
		this.name=name;
	}

	void disp()
	{
		System.out.println("Emp Number : " + empNo);
		System.out.println("Name : "+name);
	}
	
}
class ObjectsAndClasses 
{
	public static void main(String[] args) 
	{
		Emp a1=new Emp(); // allocate memory using new , () is for constructor call
		a1.setData(101,"Guru");
		Emp a2=new Emp();
		a2.setData(102,"Shree");
		a1.disp();
		a2.disp();
		//System.out.println(a1.name); Error
	}
}
