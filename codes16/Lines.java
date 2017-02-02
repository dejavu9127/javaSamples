// Draw lines
//void drawLine(int startX, int startY, int endX, int endY)
//void drawRect(int top, int left, int width, int height)
//void fillRect(int top, int left, int width, int height)
//void drawOval(int top, int left, int width, int height)
//void fillOval(int top, int left, int width, int height)
import java.awt.*;
import java.applet.*;
/*
<applet code="Lines" width=300 height=200>
</applet>
*/
public class Lines extends Applet 
{
  public void paint(Graphics g) 
	 {
	/* g.setColor(Color.red);
     g.drawLine(0, 0, 100, 100);
	 g.drawLine(100,100,200,100);
	  g.setColor(Color.blue);
	   g.drawLine(200,100,200,150);
	g.drawLine(110,110,110,110);   
		
    
    g.setColor(Color.green);
	g.drawLine(100,100,100,190);*/
	Color c=new Color(100,0,140);
		g.setColor(c);
	 g.drawRect(20,20,150,100); // drawRect or fillRect

	 g.fillOval(20,20,150,100); // drawOval or fillOval


  }
}

