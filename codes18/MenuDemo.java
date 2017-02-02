// Creating JMenu
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class MenuDemo implements ActionListener 
{
   static  JFrame frame = new JFrame("MenuDemo");
   void makeGui()
	{
	       JMenu menu = new JMenu("Color");

			menu.setMnemonic(KeyEvent.VK_C);// for underline , kbd shortcut
		   ImageIcon icon = new ImageIcon("red.gif");
		   ImageIcon icon2 = new ImageIcon("green.gif");
	       JMenuItem red = new JMenuItem("Red",icon);
			// JMenuItem temp=new  JMenuItem("t1234");
			 
			red.setMnemonic(KeyEvent.VK_R); // underline
			menu.add(red);
			//red.add(temp);

			JMenuItem green = new JMenuItem("Green",icon2);
			green.setMnemonic(KeyEvent.VK_G);
			green.setAccelerator(KeyStroke.getKeyStroke(
			KeyEvent.VK_G, ActionEvent.ALT_MASK)); //CTRL_MASK
			menu.add(green);

	        red.addActionListener(this);
		    green.addActionListener(this);

		    menu.add(new JSeparator());  // line as a separator    
			JMenuItem exit = new JMenuItem("Exit");
			exit.addActionListener(this);
            menu.add(exit);

            JMenuBar bar = new JMenuBar();
            bar.add(menu);
	        frame.setJMenuBar(bar);
	}
   public static void main(String[] args) 
   {
	   MenuDemo m = new MenuDemo();
	   m.makeGui();    
       frame.setSize(250,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  //DO_NOTHING_ON_CLOSE  
	  // HIDE_ON_CLOSE , we can set it visible true again
	  // DISPOSE_ON_CLOSE , destroy the frame but will not exit 
      frame.setVisible(true);
   }
    public void actionPerformed (ActionEvent e) {
		String s=e.getActionCommand();
		if(s.equals("Red"))
		frame.getContentPane().setBackground(Color.red);
		else
		if(s.equals("Green"))
		frame.getContentPane().setBackground(Color.green);
		else
       	if(s.equals("Exit"))
		{
            frame.dispose();// release the resources
            System.exit(0);
		}
	}
}
