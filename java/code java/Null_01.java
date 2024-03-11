import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Null_01 extends JFrame 
{
	JButton Jb1,Jb2;
	JLabel Jl1;
	TextField txt1;
	Null_01(){
		setTitle("Technic Krabi");
		Container c=getContentPane();
		c.setLayout(null);
		Jb1=new JButton("Test Button 1 ");
		c.add(Jb1);
		Jb1.setBounds(100,10,150,50);
		Jb2=new JButton("Test Button 2 ");
		c.add(Jb2);
		Jb2.setBounds(100,70,150,50);
		Jl1=new JLabel("Hello");
		c.add(Jl1);
		txt1=new TextField(20);
		c.add(txt1);
		


	}

	public static void main(String[] args) 
	{
	Null_01 f=new Null_01();
	f.setSize(500,300);
	f.setVisible(true);
	f.setResizable(false);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
