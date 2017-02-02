/* Copy a text file using command line arguments. ( byte stream )

   type  some content in SOURCE.TXT.
   
   java CopyFile SOURCE.TXT TARGET.TXT

   
*/

import java.io.*;

class CopyFile 
{
	public static void main(String args[]) 
	{
		int i;
		// byte stream
		FileInputStream fin=null;
		FileOutputStream fout=null;
		try 
		{      
			try 
			{
				fin = new FileInputStream(args[0]);// open input file
			} 
			catch(FileNotFoundException e) 
			{
				System.out.println("Input File Not Found");
				return;
			} 
			
			fout = new FileOutputStream(args[1]); // open output file     

			do 
			{
               i = fin.read();
               if(i != -1) fout.write(i);
			} while(i != -1);  // -1 indicates EOF


		    // fin.close();
            // fout.close();
		} 
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Array Index Error ");
			return;
		}
		catch(IOException e)
		{
			System.out.println("File IO Error");
		}
		finally
		{
			try 
		{
				if(fin!=null)
					fin.close();
				if(fout !=null)
					fout.close();
		}
			 catch(IOException e)
		{
			System.out.println("File IO Error");
		}
		}
  
	}
}

/*

D:\>
D:\>type myfile.txt
This is my data
121212
,.
asdasdasd

D:\>java CopyFile myfile.txt tar.txt

D:\>type tar.txt
This is my data
121212
,.
asdasdasd

D:\>



D:\>cd CoreJava715pm

D:\CoreJava715pm>java CopyFile src.txt abc.xyz

D:\CoreJava715pm>type abc.xyz
This is my file
123123
,.
dlf sdf

*/


