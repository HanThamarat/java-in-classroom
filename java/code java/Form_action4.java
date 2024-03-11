import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Form_action4 extends JFrame implements ActionListener

{
	JButton Jb1,Jb2;
	JLabel Jl1,Jl2,Jl3;
	TextField txt1,txt2,txt3;
	Form_action4(){
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
		 
		c.add(Jl1); c.add(txt1);
		c.add(Jl2); c.add(txt2);
		c.add(Jl3); c.add(txt3);
		c.add(Jb1); c.add(Jb2);

		Jb1.addActionListener(this);
		Jb2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e ){
		if(e.getSource()==Jb1){
			double a=Double.parseDouble(txt1.getText());
			double b=Double.parseDouble(txt2.getText());
			txt3.setText(""+(a+b));

		} else if(e.getSource()==Jb2){
			txt1.setText("");
			txt2.setText("");
			txt3.setText("");
		}
	}
	
	public static void main(String[] args) 
	{
		Form_action4 f=new Form_action4();
		f.setSize(500,300);
		f.setVisible(true);
		f.setResizable(false);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
