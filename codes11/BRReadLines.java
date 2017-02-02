// accept lines of text
import java.io.*;

class BRReadLines 
{
  public static void main(String args[]) 
  {
	  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    String str;
    System.out.println("Enter lines of text.");
    System.out.println("Enter 'stop' to quit.");
   try
   {
	   
        do 
        {
             str = br.readLine();
             System.out.println(str);
        } while(!str.equals("stop"));
   }
   catch(IOException e)
   {
		     System.out.println(" Caught IOException ");
   }

  }
}