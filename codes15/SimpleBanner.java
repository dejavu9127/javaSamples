/* A simple banner applet.

   This applet creates a thread that scrolls
   the message contained in msg right to left
   across the applet's window.
*/
import java.awt.*;
import java.applet.*;
/*
<applet code="SimpleBanner" width=400 height=150>

</applet>
*/

public class SimpleBanner extends Applet implements Runnable 
{
  String msg = " A Simple Moving Banner. ";
  Thread t ;//= null;

  boolean stopFlag;

  // Set colors and initialize thread.
  public void init()
  {
    setBackground(Color.green); // java.awt.Color
    setForeground(Color.red);

	//java.awt.Font
	/*
		public Font(String name,
            int style,
            int size) */

	Font f=new Font("Times New Roman",Font.BOLD | Font.ITALIC , 30);// Font.PLAIN
	setFont(f);
  }

  // Start thread
  public void start() 
  {
    t = new Thread(this);// this is runnable instance, applet
    stopFlag = false;
    t.start(); // will call run()
  }

  // Entry point for the thread that runs the banner.
  public void run() 
  {
    char ch;

    // Display banner 
    for( ; ; ) //infinite loop
	{
      try 
	  {
        repaint(); // call to paint()
        Thread.sleep(1000);
        ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;
        if(stopFlag)
          break;
      } 
	  catch(InterruptedException e) 
	  {
		  System.out.println(e);
	  }
    }
  }

  // Pause the banner.
  public void stop() 
  {
    stopFlag = true;
    t = null; // kill the thread
  }

  // Display the banner.
  public void paint(Graphics g)
  {
    g.drawString(msg, 50, 30);
  }
}