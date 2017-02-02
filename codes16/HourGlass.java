// Draw Polygon
//void drawPolygon(int x[ ], int y[ ], int numPoints)
import java.awt.*;
import java.applet.*;
/*
<applet code="HourGlass" width=230 height=210>
</applet>
*/
public class HourGlass extends Applet 
{
  public void paint(Graphics g) 
  {
	 Color c1 = new Color(120, 0, 120);// r,g,b , 0 to 255
	 g.setColor(c1);
	 int xpoints[] = {30, 200, 30,200};
	 int ypoints[] = {30, 30, 200, 200};
	 g.fillPolygon(xpoints, ypoints,4);
	 g.clearRect(100,40,40,20);
  }
}
// clearRect() to clear the specific rectangular area
// void clearRect(int left,int top,int width,int height)

