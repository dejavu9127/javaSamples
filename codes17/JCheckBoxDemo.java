import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="JCheckBoxDemo" width=400 height=50>
</applet>
*/
public class JCheckBoxDemo extends JApplet implements ItemListener 
{
	JTextField jtf;
	JCheckBox cb1,cb2,cb3,cb4;
	JLabel lab;
	public void init() 
	{
		setLayout(new FlowLayout());

		 cb1 = new JCheckBox("C");

		cb1.addItemListener(this);
		add(cb1);

		cb2 = new JCheckBox("C++");
		cb2.addItemListener(this);
		add(cb2);

		cb3 = new JCheckBox("Java"); //,true
		cb3.addItemListener(this);

		add(cb3);

		cb4 = new JCheckBox("Perl");

		cb4.addItemListener(this);
		add(cb4);

		// Add text field to the JApplet
		jtf = new JTextField(15);
		add(jtf);

		lab=new JLabel("");
		add(lab);
	}
	public void itemStateChanged(ItemEvent ie) 
	{
		JCheckBox cb = (JCheckBox)ie.getItem();
		jtf.setText(cb.getText() + "  " + cb.isSelected());

		String s="";
		if(cb1.isSelected())
			s+=cb1.getText() + "   ";
		if(cb2.isSelected())
			s+=cb2.getText() + "   ";
		if(cb3.isSelected())
			s+=cb3.getText() + "   ";
		if(cb4.isSelected())
			s+=cb4.getText() + "   ";

		lab.setText(s);

	}
}