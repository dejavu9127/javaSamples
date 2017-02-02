import java.util.*;
//@SuppressWarnings("unchecked")
class  StackDemo
{
	public static void main(String[] args) 
	{
		Stack<String> s=new Stack<String>(); // Generic class, type safe classes
		s.push("abc");
		s.push("xyz");
		s.push("pqr");
		//s.push(44); // Error
		System.out.println(s);
		System.out.println(" pop : " + s.pop());


		Stack<Integer> s1=new Stack<Integer>();
		s1.push(11);
		s1.push(22);
		s1.push(33);
		System.out.println(s1);
		System.out.println(" pop : " + s1.pop());


		/*Stack s2=new Stack(); // Object type
		s2.push("aa");
		s2.push(100);
		System.out.println(s2);*/


	}
}
/*
D:\>javac -Xlint:unchecked StackDemo.java
StackDemo.java:24: warning: [unchecked] unchecked call to push(E) as a member of
 the raw type java.util.Stack
                s2.push("aa");
                       ^
StackDemo.java:25: warning: [unchecked] unchecked call to push(E) as a member of
 the raw type java.util.Stack
                s2.push(100);
                       ^
2 warnings

*/