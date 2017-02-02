// first applet
import java.awt.*; // for Graphics class
import java.applet.*; // for Applet class
/*

<applet code="SimpleApplet" width=350 height=350 >
</applet>
*/

public class SimpleApplet extends Applet 
{
  public void paint(Graphics g) 
  {
    g.drawString("A Simple Applet",50,100);	
	System.out.println("Hello");	

  }
}


// appletviewer SimpleApplet.java
//appletviewer SimApp.html
