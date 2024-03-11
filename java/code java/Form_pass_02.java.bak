import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Form_pass_02 extends JFrame implements ActionListener
{
	JMenuBar menubar;
	JMenu JF,JE,Jh,JV;
	JMenu JH , JHt,JVz ;
	JMenuItem JFn,JFnw,JFsa,JFp,JFpr,JFs,JFo,JFe,JFa;
	JMenuItem JEu,JEc,JEcp,JEp,JEd,JEf,JEfn,JEfp,JEg,JEs,JEt,JEft;
	JMenuItem JFw,JFf;
	JMenuItem  JVs,JVzi,JVzu,JVzr;
	JMenuItem JHtj ,JHr , JHth;
	JButton Jb1,Jb2;
	JTextArea t1;
	JScrollPane Jp1;
	JLabel Jl1,Jl2 ;
	;
	Form_pass_02(){
	//setSize(500,300);
	//setVisible(true);
	//setResizable(false);
	//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("Menu");
	Container c=getContentPane();
	c.setLayout(null);
		menubar = new JMenuBar();
	
		JF=new JMenu("File");
		JF.setFont(new Font("Kanit",Font.ITALIC,13));
			JFn=new JMenuItem("Calculator");
			JFn.setFont(new Font("Kanit",Font.ITALIC,13));
			JFnw=new JMenuItem("Calculate taxes");
			JFnw.setFont(new Font("Kanit",Font.ITALIC,13));
			JFo=new JMenuItem("Exit");
			JFo.setFont(new Font("Kanit",Font.ITALIC,13));
		
			

			menubar.add(JF);
			JF.add(JFn);
			JF.add(JFnw);
			JF.add(JFo);

			//JE=new JMenu("Edit");
			//menubar.add(JE);

			setJMenuBar(menubar);

			Jl1 = new JLabel("Press  the ");
			Jl1.setFont(new Font("Kanit",Font.ITALIC,15));
			Jl1.setBounds(180,70,150,50);
			Jl2 = new JLabel("file  menu. ");
			Jl2.setFont(new Font("Kanit",Font.ITALIC,15));
			Jl2.setBounds(250,70,150,50);
			c.add(Jl1); c.add(Jl2);
			JFn.addActionListener(this);
			JFnw.addActionListener(this);
			JFo.addActionListener(this);
	}
		
	
	public void actionPerformed(ActionEvent e ){
	if(e.getSource()==JFo){
		int result = JOptionPane.showConfirmDialog (null,"Do you want to  Exit ?","Warning",JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.YES_NO_OPTION)
					System.exit(0);
		}
	else if(e.getSource()==JFn){
		Form_CalculatorTest f3=new Form_CalculatorTest(); //Link Form_pass_02
		f3.setSize(500,300);
		f3.setVisible(true);
		//setVisible(false);
		}
	else if(e.getSource()==JFnw){
		Form_action_lap2 f4=new Form_action_lap2(); //Link Form_pass_02
		f4.setSize(500,300);
		f4.setVisible(true);
		//setVisible(false);
		}
	}
	public static void main(String[] args) 
	{
	
	Form_pass_02 f=new Form_pass_02();
	f.setSize(500,300);
	f.setVisible(true);
	f.setResizable(false);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	
	
	}
}
