class Student
{
	int rno;
	String name;

	void setData()
	{
		rno=100;
		name="Nitin";
	}

	void disp()
	{
		System.out.println(rno);
		System.out.println(name);
	}

	static void sayHello()
	{
		System.out.println("Hello World!");
	}
}
class HelloApp 
{
	public static void main(String []args) 
	{
		Student obj=new Student();
		obj.setData();
		obj.disp();
		Student.sayHello();
		//System.out.println("Hello World!");
	}
}
