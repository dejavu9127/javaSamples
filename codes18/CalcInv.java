import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CalcInv implements ActionListener
{
	static JFrame frame;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bp,bs,bm,bd,be,bc;
	JTextField jans;
	JPanel jp;
	String msg = "";
	int a=0,b=0,c=0;
	char ch=' ';

	void createGUI()
	{
		frame = new JFrame("Calculator!!");
		frame.setLayout(new BorderLayout());

		 jans = new JTextField(20);

		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		bp = new JButton("+");
		bs = new JButton("-");
		bd = new JButton("*");
		bm = new JButton("/");
		be = new JButton("=");
		bc = new JButton("C");

		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bp.addActionListener(this);
		be.addActionListener(this);
		bs.addActionListener(this);
		bm.addActionListener(this);
		bd.addActionListener(this);
		bc.addActionListener(this);
		
		jp = new JPanel();
		jp.setLayout(new GridLayout(4,4));
		jp.add(b0);
		jp.add(b1);
		jp.add(b2);
		jp.add(b3);
		jp.add(b4);
		jp.add(b5);
		jp.add(b6);
		jp.add(b7);
		jp.add(b8);
		jp.add(b9);
		jp.add(bp);
		jp.add(bs);
		jp.add(bm);
		jp.add(bd);
		jp.add(be);
		jp.add(bc);


		frame.add(jans,BorderLayout.NORTH);
		frame.add(jp,BorderLayout.CENTER);
	}


	public static void main(String[] args) 
	{
		CalcInv jf = new CalcInv();
		jf.createGUI();

		frame.setSize(200,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{
		String s = ae.getActionCommand();

		if(s.equals("0"))
			msg+=0;
		else if(s.equals("1"))
			msg+=1;
		else if(s.equals("2"))
			msg+=2;
		else if(s.equals("3"))
			msg+=3;
		else if(s.equals("4"))
			msg+=4;
		else if(s.equals("5"))
			msg+=5;
		else if(s.equals("6"))
			msg+=6;
		else if(s.equals("7"))
			msg+=7;
		else if(s.equals("8"))
			msg+=8;
		else if(s.equals("9"))
			msg+=9;
		else if(s.equals("C"))
			msg="";


		else if(s.equals("+"))
		{
			a = Integer.parseInt(msg);
			msg="";
			ch='+';
		}
		else if(s.equals("-"))
		{
			a = Integer.parseInt(msg);
			msg="";
			ch='-';
		}
		else if(s.equals("*"))
		{
			a = Integer.parseInt(msg);
			msg="";
			ch='*';
		}
		else if(s.equals("/"))
		{
			a = Integer.parseInt(msg);
			msg="";
			ch='/';
		}

		else if(s.equals("="))
		{
			b = Integer.parseInt(msg);
			if (ch=='+') 
			{
				c = a + b;
				msg=""+c;
			}
			else if (ch=='-') 
			{
				c = a - b;
				msg=""+c;
			}
			else if (ch=='*') 
			{
				c = a * b;
				msg=""+c;
			}
			else if (ch=='/') 
			{
				try
				{
					c = a / b;
					msg=""+c;
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(frame,"Enter again!!","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
			
		}

		jans.setText(msg);
	}
}
