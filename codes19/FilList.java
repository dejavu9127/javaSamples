// Using directories. , list() to retrieve a directory list
import java.io.File;

class FilList 
{
  public static void main(String args[]) 
  {
    String dirname = "D:\\CoreJava715pm";
    File f1 = new File(dirname);

    if (f1.isDirectory()) 
	{
      System.out.println("List  of  : " + dirname);
      String s[] = f1.list();//**imp
	  // use list() to extract the list of other files and directories inside it

		for (int i=0; i < s.length; i++) 
		{
		//	if(s[i].endsWith(".java")) //optional
                  System.out.println(s[i] );
         }
      }
     else 
      System.out.println(dirname + " is not a directory"); 
  }
}

