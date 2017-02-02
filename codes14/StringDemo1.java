class StringDemo1 
{
	public static void main(String[] args) 
	{
		String s="Guru";
		String k=s.concat(" Shree ");
		System.out.println(s);
		System.out.println(k);

		String k1=s.toUpperCase();
		System.out.println(s);
		System.out.println(k1);

		String k2=s.toLowerCase();
		System.out.println(s);
		System.out.println(k2);

		String k3=s.replace('u','U');
		System.out.println(s);
		System.out.println(k3);

		String t="one two one three ";
		System.out.println(t.replaceFirst("one" , "ten") );
		System.out.println(t.replaceAll("one" , "ten" ));
		System.out.println(t);




	}
}
