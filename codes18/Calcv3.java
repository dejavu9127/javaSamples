import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
<applet code="Calcv3" width=495 height=250>
</applet>
*/
public class Calcv3 extends JApplet implements ActionListener
{
	public int []x=new int[10];
	public int i;
	public int sum=0;
	public String ip=new String();
	public StringBuffer temp;
	JButton a0;
	JButton a1;
	JButton a2;
	JButton a3;
	JButton a4;
	JButton a5;
	JButton a6;
	JButton a7;
	JButton a8;
	JButton a9;
	JButton plus;
	JButton op;
	JButton clear;
	JPanel p;
	JTextField opwindow;
	
	public void init(){
		i=0;
		p=new JPanel();
		p.setLayout(new GridLayout(4,4));
		//initialize numeric pad
		a0=new JButton("0");
		a1=new JButton("1");
		a2=new JButton("2");
		a3=new JButton("3");
		a4=new JButton("4");
		a5=new JButton("5");
		a6=new JButton("6");
		a7=new JButton("7");
		a8=new JButton("8");
		a9=new JButton("9");
		plus=new JButton("+");
		op=new JButton("=");
		clear=new JButton("C");
		
		//initialize opwindow
		opwindow=new JTextField();
		
		//add button to p panel and add action listener
		a0.addActionListener(this);
		p.add(a0);
		a1.addActionListener(this);
		p.add(a1);
		a2.addActionListener(this);
		p.add(a2);
		a3.addActionListener(this);
		p.add(a3);
		a4.addActionListener(this);
		p.add(a4);
		a5.addActionListener(this);
		p.add(a5);
		a6.addActionListener(this);
		p.add(a6);
		a7.addActionListener(this);
		p.add(a7);
		a8.addActionListener(this);
		p.add(a8);
		a9.addActionListener(this);
		p.add(a9);
		plus.addActionListener(this);
		p.add(plus);
		op.addActionListener(this);
		p.add(op);
		clear.addActionListener(this);
		p.add(clear);
		
		setLayout(new BorderLayout());
		add(p,BorderLayout.CENTER);
		
		
		add(opwindow,BorderLayout.NORTH);
		
	}
	
	//addition using var args
	public static int add(int ...y)
	{
		int total=0;
		for(int k:y)
		{
			total=total+k;
		}
		return total;
	}
	public void actionPerformed(ActionEvent e)
	{
		String cmd=e.getActionCommand();
		boolean entryFlag=(cmd.equals("+")||cmd.equals("=") ||cmd.equals("C"));
		if(cmd.equals("C"))
		{
			opwindow.setText("");
			for(int k=0;k<i;k++)
			{
				x[k]=0;
			}
			sum=0;
			i=0;
		}
		while(entryFlag==false)
		{
		if(cmd.equals("0"))
		{
		temp=new StringBuffer(ip.concat(cmd));
		ip=temp.toString();
		opwindow.setText(ip);
		break;
		}
		if(cmd.equals("1"))
		{
		temp=new StringBuffer(ip.concat(cmd));
		ip=temp.toString();
		opwindow.setText(ip);
		break;}
		if(cmd.equals("2"))
		{
		temp=new StringBuffer(ip.concat(cmd));
		ip=temp.toString();
		opwindow.setText(ip);
		break;}
		if(cmd.equals("3"))
		{
		temp=new StringBuffer(ip.concat(cmd));
		ip=temp.toString();
		opwindow.setText(ip);
		break;}
		if(cmd.equals("4"))
		{
		temp=new StringBuffer(ip.concat(cmd));
		ip=temp.toString();
		opwindow.setText(ip);
		break;}
		if(cmd.equals("5"))
		{
		temp=new StringBuffer(ip.concat(cmd));
		ip=temp.toString();
		opwindow.setText(ip);
		break;}
		if(cmd.equals("6"))
		{
		temp=new StringBuffer(ip.concat(cmd));
		ip=temp.toString();
		opwindow.setText(ip);
		break;}
		if(cmd.equals("7"))
		{
		temp=new StringBuffer(ip.concat(cmd));
		ip=temp.toString();
		opwindow.setText(ip);
		break;}
		if(cmd.equals("8"))
		{
		temp=new StringBuffer(ip.concat(cmd));
		ip=temp.toString();
		opwindow.setText(ip);
		break;}
		if(cmd.equals("9"))
		{
		temp=new StringBuffer(ip.concat(cmd));
		ip=temp.toString();
		opwindow.setText(ip);
		break;}
		}
		
		
		//write code for addition
		if(cmd.equals("+"))
		{
			x[i]=Integer.parseInt(ip);
			i++;
			opwindow.setText(null);
			ip="";
			
		}
		
		if(cmd.equals("="))
		{
			x[i]=Integer.parseInt(temp.toString());
			for(int k=0;k<=i;k++)
			{sum=sum+x[k];}
			opwindow.setText(Integer.toString(sum));
		}
		showStatus("i="+Integer.toString(i)+"x["+Integer.toString(i)+"]="+Integer.toString(x[i]));
		
	}

}
