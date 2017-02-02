// Demonstrate BorderLayout 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="BorderLayoutDemo" width=495 height=250>
</applet>
*/

public class BorderLayoutDemo extends JApplet 
{
	JTextArea t;// multiple lines
	JButton b1,b2;
	JPanel p;

  public void init() 
  {
	  p=new JPanel();// simple container which does not hava a border,title bar etc.
	  p.setLayout(new GridLayout(1,2));
	//p.setLayout(new FlowLayout());
      b1=new JButton("OK");
      b2=new JButton("Cancel");
	  p.add(b1);// add buttons to a panel
	  p.add(b2);
      setLayout(new BorderLayout());// for applet
      add(p,  BorderLayout.NORTH);// add panel to the applet 

      add(new JLabel("The footer message might go here."),
        BorderLayout.SOUTH);

    add(new JButton("Right"), BorderLayout.EAST);
    add(new JButton("Left"), BorderLayout.WEST);

    String msg = "The reasonable man adapts " +
      "himself to the world;\n" +
      "the unreasonable one persists in " +
      "trying to adapt the world to himself.\n" +
      "Therefore all progress depends " +
      "on the unreasonable man.\n\n" +
      "        - George Bernard Shaw\n\n";
     t= new JTextArea(msg);
    add(t, BorderLayout.CENTER);	//default region is CENTER
	
  }

}

