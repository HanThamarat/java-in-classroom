import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FormT extends JFrame implements ActionListener

{
	JButton Jb1,Jb2;
	JLabel Jl1,Jl2,Jl3,Jl4,Jl5,Jl6,Jl7,Jl8,Jl9;
	TextField txt1,txt2,txt3,txt4;
	JMenuBar menubar;
	JMenu JF;
	JMenuItem JFe,JFa,JFr;
	JRadioButton P1,P2,P3,P4;
	ButtonGroup Pg;
	
	FormT(){
		setTitle("Calculate");
		Container c=getContentPane();
		menubar = new JMenuBar();
		JF=new JMenu("File");
			JFa=new JMenuItem("About us");
			JFr=new JMenuItem("Reset");
			JFe=new JMenuItem("Exit");
				JPanel B=new JPanel();
						Jb1=new JButton(" Process ");
						B.setLayout(new GridLayout(1,1));

		menubar.add(JF);
			JF.add(JFa);
			JF.add(JFr);
			JF.add(JFe);

		setJMenuBar(menubar);

        JPanel p=new JPanel();			  
		p.setLayout(new GridLayout(4,3)); 
		Jl1=new JLabel("shirt 5 km. 350 bath");				txt1=new TextField(20);			Jl5=new JLabel("");
 		Jl2=new JLabel("shirt 10.5 km. 450 bath");			txt2=new TextField(20);			Jl6=new JLabel("");
		Jl3=new JLabel("VIP shirt 1000 bath");			    txt3=new TextField(20);			Jl7=new JLabel("");
		Jl4=new JLabel("amount/price");					    Jl9=new JLabel("");		        Jl8=new JLabel("");
		
		JFe.addActionListener(this);
		JFr.addActionListener(this);
		JFa.addActionListener(this);
		Jb1.addActionListener(this);

		c.setLayout(new BorderLayout());
		Jl5=new JLabel( "CalculateTest 009" );
		c.add(Jl5,BorderLayout.NORTH);  
										  
		 
		
		p.add(Jl1);			p.add(txt1);		p.add(Jl5);
		p.add(Jl2);			p.add(txt2);		p.add(Jl6);
		p.add(Jl3);			p.add(txt3);		p.add(Jl7);
		p.add(Jl4);			p.add(Jl9);		p.add(Jl8);
				B.add(Jb1);

	
		


		



		c.add(p,BorderLayout.CENTER);
		c.add(B,BorderLayout.SOUTH);
			 
	}
	

	public void actionPerformed(ActionEvent e ){
		double a,b,c;
		a=Double.parseDouble(txt1.getText());
		b=Double.parseDouble(txt2.getText());
		c=Double.parseDouble(txt3.getText());
		
		if(e.getSource()==Jb1){
			double amout=a+b+c;
			double price1=a*350;
			double price2=b*450;
			double price3=c*1000;
			double price4=price1+price2+price3;
			Jl5.setText(""+price1);
			Jl6.setText(""+price2);
			Jl7.setText(""+price3);
			Jl8.setText(""+price4);
			Jl9.setText(""+amout);
		}
	}

	
	public static void main(String[] args) {
		FormT f=new FormT();
		f.setSize(500,300);
		f.setVisible(true);
		f.setResizable(false);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}