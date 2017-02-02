import java.io.*;

class FilDel 
{
  public static void main(String args[]) 
  {

    File f1 = new File( "abc.xyz");
	if(f1.delete()) //boolean delete()
		System.out.println("Deleted");
	else
			System.out.println("Not deleted ");

	}
}
