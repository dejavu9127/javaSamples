// accept lines of text

// stream : byte stream
// Reader/Writer : char stream

import java.io.*;

class BRReadLinesForNumber
{
  public static void main(String args[]) 
  {
	  //An InputStreamReader is a bridge from byte streams to character streams
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    int i,j,k;
    System.out.println("Enter 2 Numbers ");
   
   try
   {
	   
             i =Integer.parseInt( br.readLine());
			  j =Integer.parseInt( br.readLine());
			  k=i+j;
             System.out.println(k);
       
  }
   catch(IOException e)
   {
		     System.out.println(" Caught IOException ");
   }

  }
}