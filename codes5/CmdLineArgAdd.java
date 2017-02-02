// add two numbers, using command line arguments
class  CmdLineArgAdd
{
	public static void main(String[] args) 
	{
		//static int parseInt(String s)
		System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
		
	}
}
/*

D:\CoreJava715pm>java CmdLineArgAdd 12  34
1234

D:\CoreJava715pm>java CmdLineArgAdd 12  34
46
*/