class StringBufferDemo1 
{
	public static void main(String[] args) 
	{
		//StringBuffer sb1="abcd"; //Error , constructor call is missing
		StringBuffer sb=new StringBuffer("abcdefg");

		sb.append("hij"); // sb itself changes
		System.out.println(sb);

		sb.insert(2,"xyz");
		System.out.println(sb);

		sb.delete(2,5);// from starting index to end index-1
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);

		String s=sb.toString(); // from StringBuffer to String
		System.out.println(s);

	}
}
/*
abcdefghij
abxyzcdefghij
abcdefghij
jihgfedcba
jihgfedcba
*/