
 class Parent
{
	 void disp()
	 {
		 System.out.println(" disp() parent ");
	 }

	 @Deprecated
	 void f1()
	{
		 System.out.println(" Deprecated ");
	}
}


class  TestAnn2
{
	//@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		
		Parent ref1=new Parent();
		ref1.disp();
		ref1.f1();
	}
}
/*
D:\>javac -Xlint:deprecation TestAnn2.java
TestAnn2.java:24: warning: [deprecation] f1() in Parent has been deprecated
                ref1.f1();
                    ^
1 warning

D:\CoreJava15May>



*/