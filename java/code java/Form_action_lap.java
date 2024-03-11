import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Form_action_lap extends JFrame implements ActionListener

{
	JButton Jb1,Jb2,Jb3,Jb4,Jb5,Jb6;
	JLabel Jl1,Jl2,Jl3;
	TextField txt1,txt2,txt3;
	Form_action_lap(){
		setTitle("Grid Layout");
		Container c=getContentPane();
		
		c.setLayout(new GridLayout(6,2));
		Jl1=new JLabel(" Number 1 ");
		Jl2=new JLabel(" Number 2 ");
		Jl3=new JLabel(" Result ");
		
		txt1=new TextField(20);
		txt2=new TextField(20);
		txt3=new TextField(20);
		
		Jb1=new JButton(" Exit ");
		Jb2=new JButton(" Clear ");
		Jb3=new JButton(" + ");
		Jb4=new JButton(" - ");
		Jb5=new JButton(" x ");
		Jb6=new JButton("/");
		 
		c.add(Jl1); c.add(txt1); 
		c.add(Jl2); c.add(txt2); 
		c.add(Jl3); c.add(txt3);
		c.add(Jb3); c.add(Jb4);
		c.add(Jb5); c.add(Jb6);
		c.add(Jb1); c.add(Jb2);  

		Jb1.addActionListener(this);
		Jb2.addActionListener(this);
		Jb3.addActionListener(this);
		Jb4.addActionListener(this);
		Jb5.addActionListener(this);
		Jb6.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e ){
			double a,b;
			a=Double.parseDouble(txt1.getText());
			b=Double.parseDouble(txt2.getText());
		if(e.getSource()==Jb1){
			System.exit(0);
		}else if(e.getSource()==Jb3){
			txt3.setText(""+(a+b));

		}else if(e.getSource()==Jb4){
			txt3.setText(""+(a-b));

		}else if(e.getSource()==Jb5){
			txt3.setText(""+(a*b));

		}else if(e.getSource()==Jb6){
			txt3.setText(""+(a/b));

		}else if(e.getSource()==Jb2){
			txt1.setText("");
			txt2.setText("");
			txt3.setText("");
		}
	}
	
	public static void main(String[] args) 
	{
		Form_action_lap f=new Form_action_lap();
		f.setSize(500,300);
		f.setVisible(true);
		f.setResizable(false);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
