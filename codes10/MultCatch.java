class MultCatch 
{
	public static void main(String[] args) 
	{
		try
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			System.out.println(a/b);
		}	
		
		catch(ArithmeticException e11) // e11 is a reference var
		{
			
			System.out.println(" 1 " + e11);

		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" 2 " +e);
		}
		catch(NumberFormatException e)
		{
			System.out.println(" 3 " + e);
		}
		catch(Exception e) // must be the last catch block , superclass
		{
			System.out.println(" 4 " + e);
		}
		
		System.out.println("last line");
	
	}
}
/*

D:\CoreJava715pm>java MultCatch 10 2
5
last line

D:\CoreJava715pm>java MultCatch 10 0
 1 java.lang.ArithmeticException: / by zero
last line

D:\CoreJava715pm>java MultCatch
 2 java.lang.ArrayIndexOutOfBoundsException: 0
last line

D:\CoreJava715pm>java MultCatch 11
 2 java.lang.ArrayIndexOutOfBoundsException: 1
last line

D:\CoreJava715pm>java MultCatch 11 abc
 3 java.lang.NumberFormatException: For input string: "abc"
last line

D:\CoreJava715pm>

*/