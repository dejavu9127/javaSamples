import java.lang.reflect.*;

class Employee  // any class
{
	int eId;
	String name;
	
	void disp()
	{
		System.out.println("Id = " + eId);
		System.out.println("Name = " + name);
	}
	void show()
	{
		System.out.println("Show()");
	}
}
class  TestRefl
{
	public static void main(String[] args) 
	{
		Class c1 = Employee.class;

		System.out.println("Class Name : " + c1.getName());
		System.out.println("SuperClass Name : " + c1.getSuperclass());
		System.out.println("Fields: ");
		Field[] f=c1.getDeclaredFields();
		for(Field f1 : f)
		{
			System.out.println(f1);
		}
		System.out.println("Methods : ");
		Method[] m=c1.getDeclaredMethods();
		for(Method m1 : m)
		{
			System.out.println(m1);
		}
	}
}
