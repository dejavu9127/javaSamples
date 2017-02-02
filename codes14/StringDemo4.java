class StringDemo4 
{
	public static void main(String[] args) 
	{
		String s1=new String("AniketxyzAniket");
		String s2=new String("abc");
		String s3=s1; // copy ref
		System.out.println(s1==s2); // references
		System.out.println(s1.equals(s2)); // content or data
		System.out.println(s1==s3);

		int i=s1.indexOf("et"); //try lastIndexOf
		System.out.println(i);
	}
}
