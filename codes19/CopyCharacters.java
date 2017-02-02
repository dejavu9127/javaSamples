// copying characters from one file to another( character stream(Unicode) )
import java.io.*;
class  CopyCharacters 
{
	public static void main(String[] args)
	{			
		FileReader ins=null; // creates i/p file stream
		FileWriter outs=null; // o/p file stream

		try
		{
			// open
			ins=new FileReader("myfile123.txt"); // source
			outs=new FileWriter("target.txt");  //target

			int ch;
			while((ch=ins.read())!=-1)// -1 EOF
			{
				outs.write(ch);
			}			
		}
		catch(IOException e)
		{
			System.out.println(e);			
		}	
		finally
		{
			try
			{
				if(ins!=null)
					ins.close();
				if(outs!=null)
					outs.close();
			}
			catch(IOException e)
			{
				System.out.println(e);			
			}	
		}
	}
}

// create the src.txt
// run the prog
// open t.txt
