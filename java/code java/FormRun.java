import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FormRun extends JFrame implements ActionListener,ItemListener

{
	JButton Jb1,Jb2;
	JLabel Jl1,Jl2,Jl3,Jl4,Jl5,Jl6,Jl7,Jl8;
	TextField txt1,txt2,txt3,txt4;
	JMenuBar menubar;
	JMenu JF;
	JMenuItem JFe,JFa,JFr;
	JRadioButton P1,P2,P3,P4;
	ButtonGroup Pg;
	double a,b,sum;
	FormRun(){
		setTitle("Calculate");
		Container c=getContentPane();
		menubar = new JMenuBar();
		JF=new JMenu("File");
			JFa=new JMenuItem("About us");
			JFr=new JMenuItem("Reset");
			JFe=new JMenuItem("Exit");

		menubar.add(JF);
			JF.add(JFa);
			JF.add(JFr);
			JF.add(JFe);

		setJMenuBar(menubar);

		JFe.addActionListener(this);
		JFr.addActionListener(this);
		JFa.addActionListener(this);

		c.setLayout(new BorderLayout());
		Container g=getContentPane();
		g.setLayout(new GridLayout(4,3));
		
										  
		JPanel p=new JPanel();			  
		p.setLayout(new GridLayout(4,3)); 
		Jl1=new JLabel("shirt 5 km. 350 bath");				txt1=new TextField(20);			Jl5=new JLabel("");
 		Jl2=new JLabel("shirt 10.5 km. 450 bath");			txt2=new TextField(20);			Jl6=new JLabel("");
		Jl3=new JLabel("VIP shirt 1000 bath");			    txt3=new TextField(20);			Jl7=new JLabel("");
		Jl4=new JLabel("amount/price");					    txt4=new TextField(20);			Jl8=new JLabel("");
		
		
		p.add(Jl1);			p.add(txt1);		p.add(Jl5);
		p.add(Jl2);			p.add(txt2);		p.add(Jl6);
		p.add(Jl3);			p.add(txt3);		p.add(Jl7);
		p.add(Jl4);			p.add(txt4);		p.add(Jl8);


		c.add(p,BorderLayout.CENTER);
		
	}
	public void itemStateChanged(ItemEvent s ){
		try{
			a=Double.parseDouble(txt1.getText());
			b=Double.parseDouble(txt2.getText());

		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null,"Input No Numveric ! ");

	}		
	
		if(s.getSource()==JFa){
			JOptionPane.showMessageDialog(null,"Mr.Thamarat");

		}if(s.getSource()==P1)
			sum = a+b;

		if(s.getSource()==P2)
			sum = a-b;

		if(s.getSource()==P3)
			sum = a*b;

		if(s.getSource()==P4)
			sum = a/b;
	}
	public void actionPerformed(ActionEvent e ){
		if(e.getSource()==Jb1){
			txt3.setText(""+sum);
		}else if (e.getSource()==JFr){
			int result = JOptionPane.showConfirmDialog (null,"Reset","Warning",JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.YES_NO_OPTION)
			txt1.setText("");
			txt2.setText("");
			txt3.setText("");
			

		}else if (e.getSource()==JFa){
			JOptionPane.showMessageDialog(null,"Mr.Thamarat Laosen 009");

		}else if (e.getSource()==JFe){
			int result = JOptionPane.showConfirmDialog (null,"Exit","Warning",JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.YES_NO_OPTION)
					System.exit(0);

		}
	}

	
	public static void main(String[] args) 
	{
		FormRun f=new FormRun();
		f.setSize(500,300);
		f.setVisible(true);
		f.setResizable(false);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}