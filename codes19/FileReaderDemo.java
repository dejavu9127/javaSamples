// Demonstrate FileReader with BufferedReader
// Display the contents of a file
import java.io.*;
class FileReaderDemo 
{
  public static void main(String args[])  
  {
	  FileReader fr=null;
	  try
	  {		
	  	
		 fr = new FileReader("src1.txt");//open
		BufferedReader br = new BufferedReader(fr); //IMP

		String s;
		while((s = br.readLine()) != null) // read data from file
		{

			System.out.println(s);
		}
		
	  }
	  catch(FileNotFoundException e)
	  {
			System.out.println(e);
	  }
	  catch(IOException e)
	  {
			System.out.println(e);
	  }

	  finally
	  {
		  try
		  {
			  if(fr!=null)// if file is opened
			  {
					fr.close();
			  }
		  }
		  catch(IOException e)
			{
				System.out.println(e);
			}
	  }

  }
}
