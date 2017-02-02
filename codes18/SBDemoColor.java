// Demonstrate scroll bars. 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
  <applet code="SBDemoColor" width=300 height=200>

  </applet>
*/

public class SBDemoColor extends JApplet   implements AdjustmentListener 
{
  String msg = "";
  JScrollBar redSB, greenSB, blueSB;
  JTextField t=new JTextField(20);

  public void init() 
  {
	  setLayout(new GridLayout(4,1,0,10));// row,col,horz gap , vert gap
  

      redSB = new JScrollBar(Scrollbar.HORIZONTAL,
                           0, 5, 0, 255);
	  redSB.setBackground(Color.red);
/*	public JScrollBar(int orientation,
                  int value,
                  int extent,
                  int min,
                  int max)*/

    greenSB = new JScrollBar(Scrollbar.HORIZONTAL,
                          0, 1, 0, 255);
	greenSB.setBackground(Color.green);
	blueSB = new JScrollBar(Scrollbar.HORIZONTAL,
                          0, 1, 0, 255);
	blueSB.setBackground(Color.blue);
	add(t);
    add(redSB);
    add(greenSB);
	add(blueSB);

    // register to receive adjustment events
    redSB.addAdjustmentListener(this);
    greenSB.addAdjustmentListener(this);
	blueSB.addAdjustmentListener(this);

   
  }

  public void adjustmentValueChanged(AdjustmentEvent ae) 
  {
    int r=redSB.getValue();
    int g=greenSB.getValue();
    int b=blueSB.getValue();

	t.setBackground(new Color(r,g,b));

  }

 

 
}
