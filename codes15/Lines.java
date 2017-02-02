// Draw lines
//void drawLine(int startX, int startY, int endX, int endY)
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
	g.setColor(Color.red);
     g.drawLine(0, 0, 100, 100);
	 g.drawLine(100,100,200,100);
	  g.setColor(Color.blue);
	  
	g.drawLine(110,110,110,110);   
		
    
  
	Color c=new Color(100,0,140);
		g.setColor(c);
	 g.drawLine(200,100,200,150);

  }
}

