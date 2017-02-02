import java.io.File;

class FilRen 
{
  public static void main(String args[]) 
  {

   File f1 = new File( "d:\\test\\s.txt");//old
	 File f2 = new File( "myFile1.txt"); //new name
	if(f1.renameTo(f2))
		System.out.println("Renamed");
	else
			System.out.println("Not");
	}



	  
	}

