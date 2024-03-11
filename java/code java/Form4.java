import javax.swing.*;
import java.awt.*;
class Form4 extends JFrame 
{
	JButton Jb1,Jb2;
	JLabel Jl1,Jl2,Jl3;
	TextField txt1,txt2,txt3;
	Form4(){
		setTitle("Grid Layout");
		Container c=getContentPane();
		c.setLayout(new GridLayout(4,2));
		Jl1=new JLabel(" Number 1 ");
		Jl2=new JLabel(" Number 2 ");
		Jl3=new JLabel(" Result ");
		txt1=new TextField(20);
		txt2=new TextField(20);
		txt3=new TextField(20);
		Jb1=new JButton(" Process ");
		Jb2=new JButton(" Clear ");
		//Jl1=new JLabel("Hello");
		//txt1=new TextField(20);
		//c.add(Jl1);
		//c.add(txt1);
		c.add(Jl1); c.add(txt1);
		c.add(Jl2); c.add(txt2);
		c.add(Jl3); c.add(txt3);
		c.add(Jb1);
		c.add(Jb2);
	}

	public static void main(String[] args) 
	{
	Form4 f=new Form4();
	f.setSize(500,300);
	f.setVisible(true);
	f.setResizable(false);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
