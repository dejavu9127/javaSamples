/*
.java (source code)

compiler (javac)

.class (bytecode....)

interpreter( java )... output


int i;...4 bytes
float
char... 2 byte... Unicode char set


array... 1d,2d ... similar type data


struct


class....data type
1. grouping of data members
2. group code (methods)
3. security.. access modifiers ... private , protected....
4. Inheritance,poly,enc,


variables of type class .... objects

class is a user defined data type.

*/


// My First App
class HelloWorld
{
	public static void main(String []args)
	{
		System.out.println(" Hello friends ");
	}
}

/*

D:\CoreJava715pm>dir
 Volume in drive D is data
 Volume Serial Number is 8EA4-71F4

 Directory of D:\CoreJava715pm

07-07-2014  19:50    <DIR>          .
07-07-2014  19:50    <DIR>          ..
07-07-2014  19:50               130 HelloWorld.java
               1 File(s)            130 bytes
               2 Dir(s)  165,536,448,512 bytes free

D:\CoreJava715pm>javac HelloWorld.java

D:\CoreJava715pm>dir
 Volume in drive D is data
 Volume Serial Number is 8EA4-71F4

 Directory of D:\CoreJava715pm

07-07-2014  19:51    <DIR>          .
07-07-2014  19:51    <DIR>          ..
07-07-2014  19:51               429 HelloWorld.class
07-07-2014  19:50               130 HelloWorld.java
               2 File(s)            559 bytes
               2 Dir(s)  165,536,448,512 bytes free

D:\CoreJava715pm>java HelloWorld
 Hello friends

D:\CoreJava715pm>

*/