  // Object serialization  and deserialization 
import java.io.*;
public class SerializationDemo 
{
  public static void main(String args[]) 
  {       
   try 
	{
      MyClass object1 = new MyClass("Hello", -7, 2.710); // create an object
      System.out.println("object1: " + object1); // call to toString()

       //   	ObjectOutputStream(OutputStream out) 
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("temp1.txt"));
 System.out.println("1");
      oos.writeObject(object1); //serialize
	 System.out.println("2");	
      oos.flush();// clear the o/p buffer
      oos.close();
    }
    catch(IOException e) 
	{
      System.out.println("Exception during serialization: " + e);
      System.exit(0);
    }

    // Object deserialization
    try 
	{
      MyClass object2 ; // reference

      
      ObjectInputStream ois = new ObjectInputStream( new FileInputStream("temp1.txt"));
		//Object readObject()
      object2 = (MyClass)ois.readObject(); // type cast required
      ois.close();
      System.out.println("object2: " + object2);
    }
    catch(Exception e) 
	{
      System.out.println("Exception during deserialization: " + e);
      System.exit(0);
    }
  }
}
//Serializability of a class is enabled by the class implementing
//the java.io.Serializable interface.
// state of an object is all non static var
class MyClass implements Serializable // marker interface, no members
{
     String s;
   //transient  ////   not serialized
     int i;  
    double d; 
	

     public MyClass(String s, int i, double d) 
     {
		this.s = s;
		this.i = i;
		this.d = d;
	 }

     public String toString() // override
	 {
        return "s=" + s + "; i=" + i + "; d=" + d;
     }
}
