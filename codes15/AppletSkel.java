// An Applet skeleton.
import java.awt.*;
import java.applet.*;
/*
<applet code="AppletSkel" width=300 height=350>
</applet>
*/
public class AppletSkel extends Applet
{
  // Called first.
  public void init()
  {
	  System.out.println("init");
      // initialization
  }

	 /* Called second, after init().  Also called whenever
     the applet is restarted. */
	public void start() 
	{
	  	  System.out.println("start");
		  // start or resume execution
    } 
  

  // Called when the applet is stopped.
  public void stop() 
  {
	  	  System.out.println("stop");		  
			// suspends execution
  }

   // Called when an applet's window must be restored.
  public void paint(Graphics g) 
  {
	  	  System.out.println("paint");
		  // redisplay contents of window
  }

  /* Called when applet is terminated.  This is the last
     method executed. */
  public void destroy() 
  {
	  	  System.out.println("destroy");
		  // perform shutdown activities
  } 
}