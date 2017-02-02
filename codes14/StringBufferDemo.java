class StringBufferDemo 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("abc");
		//StringBuffer sb1="Hello"; //Error

		System.out.println(sb);

		StringBuffer k=sb.reverse();
		System.out.println(sb);
		System.out.println(k);

	}
}
