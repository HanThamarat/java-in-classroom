import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Form_CalculatorTest extends JFrame implements ActionListener,ItemListener

{
	JButton Jb1,Jb2;
	JLabel Jl1,Jl2,Jl3,Jl4,Jl5;
	TextField txt1,txt2,txt3,txt4;
	JMenuBar menubar;
	JMenu JF;
	JMenuItem JFe,JFa,JFr;
	JRadioButton P1,P2,P3,P4;
	ButtonGroup Pg;
	double a,b,sum;
	Form_CalculatorTest(){
		setSize(500,300);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculator");
		Container c=getContentPane();
		menubar = new JMenuBar();
		JF=new JMenu("File");
		JF.setFont(new Font("Kanit",Font.ITALIC,13));
			JFa=new JMenuItem("About us");
			JFa.setFont(new Font("Kanit",Font.ITALIC,13));
			//JFr=new JMenuItem("Reset");
			JFe=new JMenuItem("Exit");
			JFe.setFont(new Font("Kanit",Font.ITALIC,13));
		menubar.add(JF);
			JF.add(JFa);
			//JF.add(JFr);
			JF.add(JFe);

		setJMenuBar(menubar);

		JFe.addActionListener(this);
		//JFr.addActionListener(this);
		JFa.addActionListener(this);

		/*c.setLayout(new BorderLayout());
		Jl5=new JLabel( "                                        Calculator " );
		Jl5.setFont(new Font("Kanit",Font.ITALIC,20));
		c.add(Jl5,BorderLayout.NORTH);  */
										  
		 JPanel P=new JPanel();			  
		P.setLayout(new GridLayout(5,2)); 
		Jl1=new JLabel(" Number	1 ");
		Jl1.setFont(new Font("Kanit",Font.ITALIC,15));      txt1=new TextField(20);
 		Jl2=new JLabel(" Number 2 ");						txt2=new TextField(20);
		Jl2.setFont(new Font("Kanit",Font.ITALIC,15));
		Jl3=new JLabel(" Result ");							txt3=new TextField(20);
		Jl3.setFont(new Font("Kanit",Font.ITALIC,15));
		P1=new	JRadioButton("+");
		P1.setFont(new Font("Kanit",Font.ITALIC,15));
		P2=new	JRadioButton("-");
		P2.setFont(new Font("Kanit",Font.ITALIC,15));
		P3=new	JRadioButton("x");
		P3.setFont(new Font("Kanit",Font.ITALIC,15));
		P4=new	JRadioButton("/");
		P4.setFont(new Font("Kanit",Font.ITALIC,15));
		Pg=new	ButtonGroup();
		
		P.add(Jl1); P.add(txt1); 
		P.add(Jl2); P.add(txt2); 
		P.add(Jl3); P.add(txt3);
		P.add(P1);	P.add(P2);		P.add(P3);		P.add(P4);
		Pg.add(P1);	Pg.add(P2);		Pg.add(P3);		Pg.add(P4);
		P.setBorder(BorderFactory.createTitledBorder("CALCULATOR"));
		JPanel B=new JPanel();
		B.setLayout(new GridLayout(1,2));
		Jb1=new JButton(" Process ");
		Jb2=new JButton(" Reset ");
		Jb1.setBackground(Color.pink);
		Jb1.setFont(new Font("Kanit",Font.ITALIC,15));
		Jb2.setBackground(Color.pink);
		Jb2.setFont(new Font("Kanit",Font.ITALIC,15));
		Jb1.addActionListener(this);
		Jb2.addActionListener(this);

		P1.addItemListener(this);
		P2.addItemListener(this);
		P3.addItemListener(this);
		P4.addItemListener(this);

		B.add(Jb1);
		B.add(Jb2);

		c.add(P,BorderLayout.CENTER);
		c.add(B,BorderLayout.SOUTH);
			 
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
		}else if (e.getSource()==Jb2){
			int result = JOptionPane.showConfirmDialog (null,"Do you want to  Reset ?","Warning",JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.YES_NO_OPTION)
			txt1.setText("");
			txt2.setText("");
			txt3.setText("");

			

		}else if (e.getSource()==JFa){
			JOptionPane.showMessageDialog(null,"Mr.Thamarat Laosen 009");

		}else if (e.getSource()==JFe){
			int result = JOptionPane.showConfirmDialog (null,"Do you want to  Exit ?","Warning",JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.YES_NO_OPTION)
					setVisible(false);


		}
	}

	
	public static void main(String[] args) 
	{	/*
		Form_CalculatorTest f=new Form_CalculatorTest();
		f.setSize(500,300);
		f.setVisible(true);
		f.setResizable(false);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE); */
	}
}