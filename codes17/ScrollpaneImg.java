//JScrollPane 
import java.awt.*;
import javax.swing.*;
/*
<APPLET CODE=ScrollpaneImg WIDTH=250 HEIGHT=200 >
</APPLET>
*/
public class ScrollpaneImg extends JApplet
{
	public ScrollpaneImg()
	{
		
		JLabel jlabel = new JLabel(new ImageIcon("bulg.jpg"));
		JScrollPane jscrollpane = new JScrollPane(jlabel);
		
		add(jscrollpane);
	}
}
