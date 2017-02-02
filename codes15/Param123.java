// A parameterized applet
import java.awt.*;
import java.applet.*;
/*
<applet code="Param123" width=550 height=150>
<param name="message22" value="Java Applets...."/>
<param name="str" value="Servlet123"/>
<param name="num" value="25"/>
</applet>
*/   

public class Param123 extends Applet 
{
	Font f;
   String msg;

  // Set colors and font.
  public void init() 
  {
	  f = new Font("Arial", Font.BOLD | Font.ITALIC, 30);
	  /*
		  public Font(String name,
            int style,
            int size) */

      setBackground(Color.cyan);
      setForeground(Color.red);
	  setFont(f);
  }

  public void start() 
  {
    msg = getParameter("message2"); // pass parameter name to get it's value
    if(msg == null) msg = "Message not found.";
    msg = " " + msg;
	msg = msg+" , " +getParameter("str");
	msg = msg+" ,  " +getParameter("num");
  }

  // Display the parameter
  public void paint(Graphics g) 
  {
    g.drawString(msg, 50, 60);
	
  }
}
