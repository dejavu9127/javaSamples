// anonymous inner class
import javax.swing.*;
import java.awt.event.*;
/*
  <applet code="InnerClassDemo3" width=200 height=100>
  </applet> 
*/ 
public class InnerClassDemo3 extends JApplet {

  public void init() { 
	
// this anonymous inner class is extending MouseAdapter
    addMouseListener(new MouseAdapter() {
    public void mousePressed(MouseEvent me)//override
	{
      showStatus("Mouse button is Pressed");
    }	
	
  });

}

}


 
