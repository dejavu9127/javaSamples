class WrapperClasses 
{
	public static void main(String[] args) 
	{
		int i=100; // value type
		System.out.println(i);

		Integer objI=new Integer(100); // reference type
		Integer objI2=new Integer("100");

		System.out.println(objI);
		System.out.println(objI2);

		System.out.println(Integer.parseInt("101",2));

		Character ch=new Character('G');// single constructor
		System.out.println(ch);
	}
}
