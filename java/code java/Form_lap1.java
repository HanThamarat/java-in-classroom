import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Form_lap1 extends JFrame implements ActionListener

{
	JButton Jb1,Jb2;
	JLabel Jl1,Jl2,Jl3,Jl4,Jl5,Jl6,Jl7,Jl8;
	TextField txt1,txt2,txt3;
	JMenuBar menubar;
	JMenu JF;
	JMenuItem JFc,JFa;

	Form_lap1(){
		setTitle("Salary");
		Container c=getContentPane();
		menubar = new JMenuBar();
		JF=new JMenu("File");
			JFa=new JMenuItem("About us");
			JFc=new JMenuItem("Close");

		menubar.add(JF);
			JF.add(JFa);
			JF.add(JFc);

		setJMenuBar(menubar);

		JFc.addActionListener(this);


		c.setLayout(new BorderLayout());
		Jl5=new JLabel( "Money 008" );
		c.add(Jl5,BorderLayout.NORTH);	  
										  
		 JPanel P=new JPanel();			  
		P.setLayout(new GridLayout(5,2)); 
		Jl1=new JLabel(" Salary ");			txt1=new TextField(20);
 		Jl2=new JLabel(" Bonus/year ");	    txt2=new TextField(20);
		Jl3=new JLabel(" Tax ");			txt3=new TextField(20);
		Jl4=new JLabel(" Taxsum ");			Jl7=new JLabel("");
		Jl6=new JLabel(" Net ");			Jl8=new JLabel("");
		
		P.add(Jl1); P.add(txt1); 
		P.add(Jl2); P.add(txt2); 
		P.add(Jl3);	P.add(txt3); 
		P.add(Jl4); P.add(Jl7);
		P.add(Jl6); P.add(Jl8);  
	
		JPanel B=new JPanel();
		B.setLayout(new GridLayout(1,2));
		Jb1=new JButton(" Process ");
		Jb2=new JButton(" Clear ");

		Jb1.addActionListener(this);
		Jb2.addActionListener(this);

		B.add(Jb1); B.add(Jb2);

		c.add(P,BorderLayout.CENTER);
		c.add(B,BorderLayout.SOUTH);
			 
	}

	public void actionPerformed(ActionEvent e ){
			double a=0,b=0,f=0;
			a=Double.parseDouble(txt1.getText());
			b=Double.parseDouble(txt2.getText());	
			f=Double.parseDouble(txt2.getText());
			 if(e.getSource()==Jb1){
		double d=((a*12)+b)*(tax);
		double total=((a*12)+b)-d;
		double tax=(a/100);
			Jl7.setText(""+d);
			Jl8.setText(""+total);

		}else if (e.getSource()==Jb2){
			txt1.setText("");
			txt2.setText("");
			txt3.setText("");
			Jl7.setText("");
			Jl8.setText("");

		}else if(e.getSource()==JFc){
			System.exit(0);
		}
	}
	
	public static void main(String[] args) 
	{
		Form_lap1 f=new Form_lap1();
		f.setSize(500,300);
		f.setVisible(true);
		f.setResizable(false);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}