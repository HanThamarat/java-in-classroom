import javax.swing.*;
import java.awt.*;
class Form3 extends JFrame 
{
	JButton Jb1,Jb2,Jb3,Jb4,Jb5;
	//JLabel Jl1;
	//TextField txt1;
	Form3(){
		setTitle("Border Layout");
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		Jb1=new JButton(" CENTER ");
		Jb2=new JButton(" NORTH ");
		Jb3=new JButton(" EAST ");
		Jb4=new JButton(" WEST ");
		Jb5=new JButton(" SOUTH ");
		//Jl1=new JLabel("Hello");
		//txt1=new TextField(20);
		//c.add(Jl1);
		//c.add(txt1);
		c.add(Jb1,BorderLayout.CENTER);
		c.add(Jb2,BorderLayout.NORTH);
		c.add(Jb3,BorderLayout.EAST);
		c.add(Jb4,BorderLayout.WEST);
		c.add(Jb5,BorderLayout.SOUTH);
	}

	public static void main(String[] args) 
	{
	Form3 f=new Form3();
	f.setSize(500,300);
	f.setVisible(true);
	f.setResizable(false);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
