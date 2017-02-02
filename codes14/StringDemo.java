class  StringDemo
{
	public static void main(String[] args) 
	{
		Integer i=100;
		String str1=new String("Hello");
		System.out.println(str1);


		String str2="Welcome";
		System.out.println(str2);

		String str3=str1;// copy the ref
		System.out.println(str3);

		str3="abcd"; // new object is created
		System.out.println(str1);
		System.out.println(str3);


		String str4="xyz";
		
		String s5=str4.toUpperCase();
		System.out.println(str4);
		System.out.println(s5);


	}
}
