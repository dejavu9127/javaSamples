import p1.*;
class  TestClassPath
{
	public static void main(String[] args) 
	{
		PkgP1 obj=new PkgP1();
		obj.f1();
	}
}
/*
D:\CoreJava715pm>javac -cp d:\temp TestClassPath.java



D:\CoreJava715pm>javac TestClassPath.java
TestClassPath.java:1: package p1 does not exist
import p1.*;
^
TestClassPath.java:6: cannot find symbol
symbol  : class PkgP1
location: class TestClassPath
                PkgP1 obj=new PkgP1();
                ^
TestClassPath.java:6: cannot find symbol
symbol  : class PkgP1
location: class TestClassPath
                PkgP1 obj=new PkgP1();
                              ^
3 errors

D:\CoreJava715pm>javac -cp d:\temp TestClassPath.java

D:\CoreJava715pm>java TestClassPath
Exception in thread "main" java.lang.NoClassDefFoundError: p1/PkgP1
        at TestClassPath.main(TestClassPath.java:6)
Caused by: java.lang.ClassNotFoundException: p1.PkgP1
        at java.net.URLClassLoader$1.run(URLClassLoader.java:202)
        at java.security.AccessController.doPrivileged(Native Method)
        at java.net.URLClassLoader.findClass(URLClassLoader.java:190)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:306)
        at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:301)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:247)
        ... 1 more

D:\CoreJava715pm>java -cp d:\temp TestClassPath
Exception in thread "main" java.lang.NoClassDefFoundError: TestClassPath
Caused by: java.lang.ClassNotFoundException: TestClassPath
        at java.net.URLClassLoader$1.run(URLClassLoader.java:202)
        at java.security.AccessController.doPrivileged(Native Method)
        at java.net.URLClassLoader.findClass(URLClassLoader.java:190)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:306)
        at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:301)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:247)
Could not find the main class: TestClassPath.  Program will exit.

D:\CoreJava715pm>java -cp d:\temp;. TestClassPath
f1()...

D:\CoreJava715pm>java -cp .;d:\temp TestClassPath
f1()...

*/