// Use a BufferedReader to read characters from the console.
import java.io.*;
class BRRead {
public static void main(String args[]) //throws  IOException
{	 
   // char c;
	int i;
	//An InputStreamReader is a bridge from byte streams to character streams
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
	System.out.println("Enter characters, 'q' to quit.");	
    // read characters	
	try
	{
      do 
	  {
		//c =(char)br.read(); //int read()

		i =br.read();
		System.out.print(i);
		//System.out.print(c);
      } while(i != 'q');	
	}
	catch(IOException e) // checked exception
	{
		  System.out.println(e);
	}

	

   }
}
