import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
class Form6 extends JFrame implements ItemListener,ActionListener{
	JButton Jb1;
	TextField txt1,txt2,txt3;
	JLabel Jl1,Jl2,Jl3;
	JRadioButton Rb1,Rb2,Rb3,Rb4;
	ButtonGroup r;
	JMenuBar menubar;
	JMenu JF;
	JMenuItem JFe,JFa,JFr;
	double result,a,b;
	Form6(){
		setTitle("redio");
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		menubar = new JMenuBar();
		JF=new JMenu("File");
		JF.setForeground(Color.red);
			JFa=new JMenuItem("About us");
				JFa.setForeground(Color.red);
			JFr=new JMenuItem("Reset");
				JFr.setForeground(Color.red);
			JFe=new JMenuItem("Exit");
				JFe.setForeground(Color.red);
		
		menubar.add(JF);
			JF.add(JFa);
			JF.add(JFr);
			JF.add(JFe);

		setJMenuBar(menubar);


		JFe.addActionListener(this);
		JFa.addActionListener(this);
		JFr.addActionListener(this);

		JPanel P=new JPanel();
		P.setLayout(new GridLayout(5,2));
		Jl1=new JLabel(" Number 1 ");
			Jl1.setForeground(Color.blue);
		Jl2=new JLabel(" Number 2 ");
			Jl2.setForeground(Color.blue);
		Jl3=new JLabel(" Result ");
			Jl3.setForeground(Color.blue);
		txt1=new TextField();
		txt2=new TextField();
		txt3=new TextField();
			txt3.setForeground(Color.red);

		P.add(Jl1);	P.add(txt1);	
		P.add(Jl2);	P.add(txt2);	
		P.add(Jl3); P.add(txt3);

		r=new ButtonGroup();
		Rb1=new JRadioButton(" + ");
			Rb1.setForeground(Color.red);
		Rb2=new JRadioButton(" - ");
			Rb2.setForeground(Color.red);
		Rb3=new JRadioButton(" x ");
			Rb3.setForeground(Color.red);
		Rb4=new JRadioButton(" / ");
			Rb4.setForeground(Color.red);

		r.add(Rb1); r.add(Rb2);
		r.add(Rb3); r.add(Rb4);
					
		P.add(Rb1); P.add(Rb2);
		P.add(Rb3); P.add(Rb4);

		Rb1.addItemListener(this);
		Rb2.addItemListener(this);
		Rb3.addItemListener(this);
		Rb4.addItemListener(this);

		JPanel B=new JPanel();
		B.setLayout(new GridLayout(1,2));
		Jb1=new JButton(" Process ");
			Jb1.setForeground(Color.red);
	
		Jb1.addActionListener(this);

		B.add(Jb1);

		c.add(P,BorderLayout.CENTER);
		c.add(B,BorderLayout.SOUTH);
		
		
	}
	public void itemStateChanged(ItemEvent x )
	{	try{
		a=Double.parseDouble(txt1.getText());
		}catch(NumberFormatException s){
		 JOptionPane.showMessageDialog(null,"Input 1 No Numberic !");
		}try{
		b=Double.parseDouble(txt2.getText());
		}catch(NumberFormatException s){
		 JOptionPane.showMessageDialog(null,"Input 2 No Numberic !");
		}
		if(x.getSource()==Rb1)
			result=a+b;

		if(x.getSource()==Rb2)
			result=a-b;

		if(x.getSource()==Rb3)
			result=a*b;

		if(x.getSource()==Rb4)
			result=a/b;
	}

	public void actionPerformed(ActionEvent e )
		{
		NumberFormat z=NumberFormat.getNumberInstance();
		z.setMaximumFractionDigits(2);

			if(e.getSource()==Jb1){
				
			txt3.setText(""+z.format(result));

			}else if(e.getSource()==JFe){
			int result=JOptionPane.showConfirmDialog(null,"Exit","Warning",JOptionPane.YES_NO_OPTION);
			if (result == JOptionPane.YES_OPTION)
				System.exit(0);

			}else if(e.getSource()==JFa){
			JOptionPane.showMessageDialog(null,"Mr.Thanatrorn Roengsamut");
				
			}else if (e.getSource()==JFr){
			txt1.setText("");
			txt2.setText("");
			txt3.setText("");
			r.clearSelection();
			}
		}
	public static void main(String[] args) 
		{
		Form6 f=new Form6();
		f.setSize(350,450);
		f.setVisible(true);
		f.setResizable(false);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		}
}