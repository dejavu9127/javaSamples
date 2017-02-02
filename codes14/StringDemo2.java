class StringDemo2 
{
	public static void main(String[] args) 
	{
		String s="Guru";
		//System.out.println(s[0]);// Error
		System.out.println(s.charAt(0));

		String s1="abc";
		String s2="ABC";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

		System.out.println(s1.length()); // imp () 
		
		String t="abcdefghijk";
		System.out.println(t.substring(3));// from beginIndex to end of string
		System.out.println(t.substring(3,6));//from beginIndex to endIndex - 1 


		String w="  Cert   Guru   ";
		System.out.println(w.trim()+"abc");

		String h="abcdef";
		System.out.println(h.startsWith("xy"));
		System.out.println(h.endsWith("def"));



	}
}
