//RandomAccessFile
import java.io.*;
class  RandomIO
{
	public static void main(String[] args) 
	{
		//public void seek(long pos) // pos in bytes
		RandomAccessFile file;// =null; 
		try
		{
			file=new RandomAccessFile ("rfile.txt","rw"); // read + write mode
			file.writeChar('k');// 2 byte
			file.writeInt(555); // 4 bytes
			file.writeDouble(3.1420); // 8 bytes
			System.out.println("Entire file : ");
			file.seek(0); // rewind , seek uses byte position
			System.out.println(file.readChar()); // sequential
			System.out.println(file.readInt());
			System.out.println(file.readDouble());

			file.seek(2); // byte number as a position
			System.out.println("Int data : " + file.readInt()); // random access
	
			file.seek(6);
			System.out.println(" Double data : " + file.readDouble());

			file.seek(2);
			file.writeInt(99); //overwrite new int value
			System.out.println("Entire file : ");
			file.seek(0); // rewind
			System.out.println(file.readChar());
			System.out.println(file.readInt());
			System.out.println(file.readDouble());
			

			file.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
/*
Advantages:
1. Can read and write primitive type data
2. Requires less memory space
3. Secure , no one can directly read the file
4. seek() method gives random access facility
*/




