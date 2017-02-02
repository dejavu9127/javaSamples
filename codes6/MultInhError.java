class A
{
}
class B
{
}
class C extends A,B //Error
{
}
class MultInhError 
{
	public static void main(String[] args) 
	{
		C obj=new C();
		System.out.println("Hello World!");
	}
}
