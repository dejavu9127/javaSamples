import java.util.*;
class StringDemo3 
{
	public static void main(String[] args) 
	{
		String s1="ABC";
		String s2="abc";
	//	String s3="BBC";

		System.out.println(s2.compareTo(s1));
		//System.out.println(s1.compareTo(s3));
	//	System.out.println(s3.compareTo(s1));

		String []s={"zz","aa","cc","bb","z"};

		Arrays.sort(s);

		for(String k :s) 
		System.out.println(k);





	}
}
