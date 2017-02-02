import java.io.File;
class  TestMkDir
{
	public static void main(String[] args) 
	{
		 
  //  File f1 = new File("d:\\coreJava715pm\\temp123");
		//System.out.println(f1.mkdir()); // will return true/false 


		 File f1 = new File("d:\\coreJava715pm\\temp123\\t1\\t2\\t3\\p1");
		System.out.println(f1.mkdirs()); // will return true/false
	}
}
