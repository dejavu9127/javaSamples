import java.awt.*;
import javax.swing.*;



public class GraphicsDemo2 extends Canvas {


	public void paint(Graphics g) {
		
		g.setColor(Color.RED);
		g.fillOval(0, 0, 30, 30);
		g.drawOval(0, 50, 30, 30);		
		g.fillRect(50, 0, 30, 30);
		g.drawRect(50, 50, 30, 30);
		System.out.println("abc");
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Graphics Demo");
		GraphicsDemo2 g1=new GraphicsDemo2();
		frame.add(g1);
		frame.setSize(300, 300);
		frame.setVisible(true);
		g1.repaint();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}