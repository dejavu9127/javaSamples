// Demonstrate File class.
// File class is used to obtain the information  associated
// with a disk file , it is not used to read or write data

import java.io.File;
class FileDemo 
{
 
  public static void main(String args[]) 
  {
    File f1 = new File("d:\\corejava715pm"); // we can also pass a filename

    System.out.println("File Name: " + f1.getName());
    System.out.println("Path: " + f1.getPath());
    System.out.println("Abs Path: " + f1.getAbsolutePath());

    System.out.println("Parent: " + f1.getParent());
    System.out.println(f1.exists() ? "exists" : "does not exist");

    System.out.println(f1.canWrite() ? "is writeable" : "is not writeable");
    System.out.println(f1.canRead() ? "is readable" : "is not readable");

    System.out.println("is " + (f1.isDirectory() ? "" : "not") + " a directory");
    System.out.println(f1.isFile() ? "is normal file" : "not a normal file ");
    System.out.println("File size: " + f1.length() + " Bytes");
  }
}
