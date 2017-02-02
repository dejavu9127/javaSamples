// FocusEvent
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
  <applet code="FocusDemo" width=280 height=200>
  </applet>
*/

public class FocusDemo extends JApplet   implements FocusListener  
{

  JTextField name,city,pin;
  

  public void init() 
  {
	setLayout(new FlowLayout());
	setFont(new Font("SansSerif", Font.PLAIN, 14));
    JLabel nameLab = new JLabel("Name: ");
    JLabel addrLab= new JLabel("City: ");
	JLabel pinLab= new JLabel("Pin: ");
    name = new JTextField(20);
    city = new JTextField(20);
	pin = new JTextField(20);


    add(nameLab);
    add(name);
    add(addrLab);
    add(city);
	add(pinLab);
    add(pin);


    // register to receive focus event
	city.addFocusListener(this); 

	
}
  public void focusGained(FocusEvent fe)
	{
	   city.setBackground(Color.orange);	
	}
	 public void  focusLost(FocusEvent fe)
	{
	   city.setBackground(Color.green);	
	}
}