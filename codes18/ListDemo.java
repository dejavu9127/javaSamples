// Demonstrate Lists. 
import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;

/*
  <applet code="ListDemo" width=650 height=180>
  </applet>
*/

public class ListDemo extends JApplet implements ListSelectionListener 
{
  JList os, browser;
  String msg = "";

  JLabel lab1,lab2;

  public void init() 
  {
	String []items={"Windows 98/XP","Windows NT/2000","Solaris","MacOS","Linux"};

    setLayout(new GridLayout(2,2));
	setFont(new Font("SansSerif", Font.PLAIN, 14));
	
    os = new JList(items);// multiselection ,  by default
	

	String [] browsers={"Internet Explorer","Firefox","Opera"};
    browser = new JList(browsers); 
	browser.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//IMP

	lab1=new JLabel("");
	lab2=new JLabel("");

	 

    // add lists to window
    add(os);
    add(browser);

	add(lab1);
	add(lab2);

    
    os.addListSelectionListener(this);
    browser.addListSelectionListener(this);
  }
  
  public void 	valueChanged(ListSelectionEvent e) 
  {     
    msg = "Current OS: ";
    Object []strArr = os.getSelectedValues(); // multiselection
  
	for(int i=0; i<strArr.length; i++)
	{
      msg +=(String) strArr[i] + "  "; 
	}	
	
   lab1.setText(msg);
    
	msg = "Current Browser: ";
    msg +=(String) browser.getSelectedValue();// single selection
    lab2.setText(msg);
  }
}
