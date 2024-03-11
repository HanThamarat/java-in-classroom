import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class From_Sum extends JFrame implements ActionListener,AdjustmentListener
{	
	JFrame f;
	JButton Je,Jo;
	JPasswordField pwd1;
	ImageIcon img1,img2,img3,img4;
	JMenuBar menubar;
	JMenu JF;
	JMenuItem JFr,JFe;
	
	JTextField Jt1,Jt2,Jt3,Jt4,Jt5,Jt6,Jt7,Jt8,Jt9,Jt10,Jt11,Jt12,Jt13,Jt14,Jt15;
	JLabel Jl1,Jl2,Jl3,Jl4,Jl5,Jl6,Jl7,Jl8,Jl9,Jl10,Jl11,Jl12;
	From_Sum(){
	/*setVisible(true);
	setResizable(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
		//Image icon = Toolkit.getDefaultToolkit().getImage("img/KHAO.png");  
		setTitle("Food Price Calculator");
		Container c=getContentPane();
		c.setLayout(null);
		
		menubar = new JMenuBar();

		JF=new JMenu("File");
			JFr=new JMenuItem("Reset");
			JFe=new JMenuItem("Exit");

		menubar.add(JF);
			JF.add(JFr);
			JF.add(JFe);
		setJMenuBar(menubar);
		
		JPanel p=new JPanel();			  
		p.setLayout(null); 
		//Title Menu
		Jl1 = new JLabel("Menu");				
			Jl1.setBounds(20,-240,484,538);
			Jl1.setFont(new Font("Kanit",Font.BOLD,16));
		Jl2 = new JLabel("Quantity per menu");
			Jl2.setBounds(180,-240,484,538);
			Jl2.setFont(new Font("Kanit",Font.BOLD,16));
		Jl3 = new JLabel("Price per menu");
			Jl3.setBounds(353,-240,484,538);
			Jl3.setFont(new Font("Kanit",Font.BOLD,16));
		//spade 1
		Jl4 = new JLabel("1.Rice Salad");
		Jl4.setBounds(10,-200,484,538);
			Jl4.setFont(new Font("Kanit",Font.PLAIN,14));
		Jt1 = new JTextField(20);
		Jt1.setBounds(220,60,80,20);
			Jt1.setFont(new Font("Kanit",Font.PLAIN,14));
		Jl5 = new JLabel("30 Baht");
		Jl5.setBounds(377,-200,484,538);
			Jl5.setFont(new Font("Kanit",Font.PLAIN,14));
		//spade 2
		Jl6 = new JLabel("2.Rice Curry with Chicken");
		Jl6.setBounds(10,-170,484,538);
			Jl6.setFont(new Font("Kanit",Font.PLAIN,14));
		Jt2 = new JTextField(20);
		Jt2.setBounds(220,90,80,20);
			Jt2.setFont(new Font("Kanit",Font.PLAIN,14));
		Jl7= new JLabel("50 Baht");
		Jl7.setBounds(377,-170,484,538);
			Jl7.setFont(new Font("Kanit",Font.PLAIN,14));
		//spade 3
		Jl8 = new JLabel("3.Nooldel Curry");
		Jl8.setBounds(10,-143,484,538);
			Jl8.setFont(new Font("Kanit",Font.PLAIN,14));
		Jt3 = new JTextField(20);
		Jt3.setBounds(220,117,80,20);
			Jt3.setFont(new Font("Kanit",Font.PLAIN,14));
		Jl9= new JLabel("30 Baht");
		Jl9.setBounds(377,-143,484,538);
			Jl9.setFont(new Font("Kanit",Font.PLAIN,14));
		//spade 4
		Jl10 = new JLabel("4.Fried Noodle");
		Jl10.setBounds(10,-113,484,538);
			Jl10.setFont(new Font("Kanit",Font.PLAIN,14));
		Jt4 = new JTextField(20);
		Jt4.setBounds(220,145,80,20);
			Jt4.setFont(new Font("Kanit",Font.PLAIN,14));
		Jl12= new JLabel("20 Baht");
		Jl12.setBounds(377,-113,484,538);
			Jl12.setFont(new Font("Kanit",Font.PLAIN,14));
		//spade 4
		Jl10 = new JLabel("4.Fried Noodle");
		Jl10.setBounds(10,-113,484,538);
			Jl10.setFont(new Font("Kanit",Font.PLAIN,14));
		Jt4 = new JTextField(20);
		Jt4.setBounds(220,145,80,20);
			Jt4.setFont(new Font("Kanit",Font.PLAIN,14));
		Jl12= new JLabel("20 Baht");
		Jl12.setBounds(377,-113,484,538);
			Jl12.setFont(new Font("Kanit",Font.PLAIN,14));
			
		

		p.add(Jl1);		p.add(Jl2);		p.add(Jl3);
		p.add(Jl4);		p.add(Jt1);		p.add(Jl5);
		p.add(Jl6);		p.add(Jt2);		p.add(Jl7);
		p.add(Jl8);		p.add(Jt3);		p.add(Jl9);
		p.add(Jl10);	p.add(Jt4);		p.add(Jl12);
		
		p.setBorder(BorderFactory.createTitledBorder("FOOD MENU"));
		p.setFont(new Font("Kanit",Font.ITALIC,20));
		p.setBounds(1,1,484,538);

		/*JPanel m=new JPanel();			  
		m.setLayout(new GridLayout(11,4)); 
		Jl1 = new JLabel("Menu");		Jl2 = new JLabel("Menu");		Jl3 = new JLabel("Menu");
		Jl4 = new JLabel("Menu");		Jl5 = new JLabel("Menu");		Jl6 = new JLabel("Menu");
		Jl7 = new JLabel("Menu");		Jl8 = new JLabel("Menu");		Jl9 = new JLabel("Menu");
		Jl10 = new JLabel("Menu");		Jl11 = new JLabel("Menu");		Jl12 = new JLabel("Menu");
		
		m.add(Jl1);		m.add(Jl2);		m.add(Jl3);
		m.add(Jl4);		m.add(Jl5);		m.add(Jl6);
		m.add(Jl7);		m.add(Jl8);		m.add(Jl9);
		m.add(Jl10);	m.add(Jl11);	m.add(Jl12);
		p.add(m,BorderLayout.CENTER);*/

		JPanel s=new JPanel();			  
		s.setLayout(null); 
			 final Scrollbar Sc = new Scrollbar();
			     Sc.setBounds(226,10,20,459);

		s.add(Sc);
		s.setBorder(BorderFactory.createTitledBorder("FOOD PRICE"));
		s.setFont(new Font("Kanit",Font.ITALIC,20));
		s.setBounds(485,1,249,473);
		
		Jo = new JButton("Process");
		Jo.setBackground(Color.pink);
			Jo.setFont(new Font("Kanit",Font.ITALIC,30));
		Jo.setBounds(488,477,244,60);

		c.add(Jo);
		c.add(p);
		c.add(s);
		
		JFe.addActionListener(this);
		JFr.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e ){
		try{
			
		}
		catch(NumberFormatException s){
			JOptionPane.showMessageDialog(null,"Mr.Thanatrorn Roengsamut");
		}
		if(e.getSource()==JFr){
				
		}
		else if(e.getSource()==JFe){
			System.exit(0);
		}
	}
	
	public void adjustmentValueChanged(AdjustmentEvent g){
		
	}

	
	public static void main(String[] args) 
	{
	From_Sum f=new From_Sum(); 
	//f.setIconImage(icon); 
	f.setSize(750,600);
	f.setVisible(true);
	f.setResizable(false);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
