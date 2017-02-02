//JRadioButton
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="JRadioButtonDemo" width=300 height=80>
</applet>
*/
public class JRadioButtonDemo extends JApplet implements ActionListener 
{
	JTextField tf;
	ButtonGroup bg; // add RadioButtons in this group , so that at a time
					// single RadioBtn can be selected in this group
	public void init() 
	{
		setLayout(new FlowLayout());

		
		JRadioButton b1 = new JRadioButton("Java");
		b1.setActionCommand("Java Programming");
		b1.addActionListener(this);
		add(b1);

		JRadioButton b2 = new JRadioButton("C++");
		b2.setActionCommand("C++ Programming");
		b2.addActionListener(this);
		add(b2);

		JRadioButton b3 = new JRadioButton("VB");
		b3.setActionCommand("VB Programming");
		b3.addActionListener(this);
		add(b3);

		// Define a button group
		 bg = new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);

	

		tf = new JTextField(20);
		add(tf);
	}
	public void actionPerformed(ActionEvent ae) 
	{
		tf.setText("You selected : " + bg.getSelection().getActionCommand());
	}
}