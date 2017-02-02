// handle WindowEvent
import javax.swing.*;
import java.awt.event.*;

public class WindowEvents  implements WindowListener 
{
	public void win()
	{
	  JFrame f = new JFrame (" My Frame ");  // frame title
	  JButton b = new JButton("Press this ");
		
		

		f.setLayout(null);
		b.setBounds(20,80,120,40);// x,y,width,height

		f.add(b);
		
		f.addWindowListener(this);
	  
		f.setSize(300,260); // width,height
		f.setVisible(true);
		
	}

 public static void main(String args[]) 
 {
	  WindowEvents w = new WindowEvents();
	  w.win();
  }
  public void windowClosing(WindowEvent we) 
 {
		System.out.println("Closing");
       //System.exit(0); // imp , must be here  	    

}
public void windowActivated(WindowEvent we) 
{
		System.out.println("Activated");
}
  public void windowDeactivated(WindowEvent we) 
 {
		System.out.println("Deactivated");
  }
  public void windowOpened(WindowEvent we) 
 {
		System.out.println("Opened");
  }
 public void windowClosed(WindowEvent we) 
   {
		System.out.println("Closed");// no imp code here
	}
	public void windowIconified(WindowEvent we) 
	{
		System.out.println("Iconified");
	 }
	 public void windowDeiconified(WindowEvent we) 
	{
		System.out.println("Deiconified");
	}   
} 