// JButton
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; // standard extensions

// swing: platform independent GUI

/* <applet code="JButtonDemo" width=280 height=200>
   </applet> */

public class JButtonDemo extends JApplet implements ActionListener
{
	
	JLabel lab; // static text
	JTextField jtf; // accept user input
	JButton jb;
	JLabel res;

	public void init() 
	{
		setLayout(new FlowLayout(FlowLayout.LEFT)); // imp, default layout for JApplet is BorderLayout

		lab=new JLabel("Name : ");
		add(lab);// add  in Applet window

		jtf = new JTextField(15);
		add(jtf);

		jb = new JButton("OK"); // if button is pressed , ActionEvent is generated
		jb.addActionListener(this); // register ActionListener for event handling
		jtf.addActionListener(this); // when enter key is pressed
		jb.setToolTipText("Press This Button ...");

		// add button in Applet window
		add(jb);	

		res=new JLabel(" ");
		add(res);
	}
	public void actionPerformed(ActionEvent ae) // method from ActionListener
	{
		//getActionCommand() : get the text of a button which is clicked
		res.setText(ae.getActionCommand()+ " button is pressed by " + jtf.getText());
	}
}
