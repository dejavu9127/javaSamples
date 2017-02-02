// JComboBox
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="JComboBoxDemo" width=400 height=300>
</applet>
*/
public class JComboBoxDemo extends JApplet implements ItemListener 
{
	JLabel jl;
	public void init() 
	{	   		
		setLayout(new FlowLayout());	
		
		// Create a combo box and add it		
		JComboBox jc = new JComboBox();
		//jc.setEditable(true);// optional
		jc.addItem("umbrella");
		jc.addItem("house");
		jc.addItem("icecream");
		jc.addItem("globe");

		jc.addItemListener(this); // register for ItemEvent

		add(jc);
		// Create label
		jl = new JLabel(new ImageIcon("umbrella.gif"));
		add(jl);
	}
	/*public void itemStateChanged(ItemEvent ie) 
	{
		String s = (String)ie.getItem(); // def return type is Object
		jl.setIcon(new ImageIcon(s + ".gif"));
	}*/
}
