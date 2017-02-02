// Inner class demo for adapter class
import javax.swing.*;
import java.awt.event.*;
/*
  <applet code="InnerClassDemo2" width=200 height=100>
  </applet> 
*/ 
public class InnerClassDemo2 extends JApplet 
{

  public void init() 
  { 
    addMouseListener(new MyEventHandler());
  }
 class MyEventHandler extends MouseAdapter 
   {
    public void mousePressed(MouseEvent me)//override
	{
      showStatus("Mouse button is Pressed");
    }	
  }  
}







 
