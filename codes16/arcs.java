// Draw Arcs
/*
void drawArc(int top, int left, int width, int height, int startAngle,
int sweepAngle)
*/
import java.awt.*;
import java.applet.*;
/*
<applet code="arcs" width=300 height=200>
</applet>
*/
public class arcs extends Applet {
  public void paint(Graphics g) {	  
	 // g.drawRect(10, 40, 70, 70);
	 g.drawArc(10, 40, 70, 70, -90, 30);
  // g.drawArc(10, 40, 70, 70, 90, 60);
 //  g.fillArc(100, 40, 70, 70, 0, 90);
//	g.drawArc(100,100,90,60,220,130);
  }
}