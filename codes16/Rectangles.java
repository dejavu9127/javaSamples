//void drawRoundRect(int top, int left, int width, int height,int
// xDiam, int yDiam)
// The diameter of the rounding arc along the X axis is specified
//by xDiam. The diameter of
//the rounding arc along the Y axis is specified by yDiam.
import java.awt.*;
import java.applet.*;
/*
<applet code="Rectangles" width=300 height=200>
</applet>
*/
public class Rectangles extends Applet 
{
	
  public void paint(Graphics g) 
  {
 
	g.setColor(Color.blue);
    g.drawRoundRect(100, 10, 60, 50, 20, 20);
	g.setColor(Color.magenta);
    g.fillRoundRect(70, 90, 140, 100, 40, 20);	
  }
}