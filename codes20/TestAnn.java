 class Parent
{
	 void disp()
	 {
		 System.out.println(" disp() from parent ");
	 }
}
class Child extends Parent
{
	@Override
	void disp()
	{
		System.out.println(" disp() from child ");
		
	}
}
class  TestAnn
{
	public static void main(String[] args) 
	{		
		Parent ref1=new Child(); //dynamic
		ref1.disp();
	}
}
