
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class JFrameDemo implements ActionListener 
{
	static   JFrame frame;  //top-level container
	JButton b1,b2,b3;

	void createGUI()
	{
			frame = new JFrame("My Frame"); //title
			frame.setLayout(new FlowLayout());

			b1=new JButton("Red");
			b2=new JButton("Green");
			b3=new JButton("Blue");

			frame.add(b1);
			frame.add(b2);
			frame.add(b3);

	        b1.addActionListener(this);
		    b2.addActionListener(this);
			b3.addActionListener(this);

	}
  
   public static void main(String[] args) 
   {			
	      	      
			JFrameDemo jf=new JFrameDemo();
			jf.createGUI();
			
			
	  
			frame.setSize(200,300); // width,height
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//DO_NOTHING_ON_CLOSE  
			// HIDE_ON_CLOSE , we can set it visible true again
			// DISPOSE_ON_CLOSE , destroy the frame but will not exit 

			frame.setVisible(true);
   }
    public void actionPerformed (ActionEvent e) 
	{
		String s=e.getActionCommand();
		if(s.equals("Red")) //Container getContentPane()
		b1.setBackground(Color.red);
		else if(s.equals("Green"))
		frame.getContentPane().setBackground(Color.green);
		else if(s.equals("Blue"))
		frame.getContentPane().setBackground(Color.blue);
       
	}
}
