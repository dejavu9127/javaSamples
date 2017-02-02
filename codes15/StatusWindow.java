// Using the Status Window.
import java.awt.*;
import java.applet.*;
/*
<applet code="StatusWindow" width=300 height=150>
</applet>
*/
public class StatusWindow extends Applet
{
  public void init() 
  {
    setBackground(Color.gray);
	setForeground(Color.white);
  }
  // Display msg in applet window.
  public void paint(Graphics g)
  {
    g.drawString("This is in the applet window.", 10, 20);
    showStatus("This is shown in the status window.");
  }
}