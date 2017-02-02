class StringDemo 
{
	public static void main(String[] args) 
	{
		String s="Hello";
		System.out.println(s.length()); // length method to count the no of chars
		System.out.println(s.charAt(0));
		//System.out.println(s[0]);
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		 s=sb.toString();
		System.out.println(s);
	}
}
