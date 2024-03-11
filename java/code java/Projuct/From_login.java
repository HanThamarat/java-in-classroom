import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class From_login extends JFrame implements ActionListener
{	
	JFrame f;
	JButton Je,Jo;
	JLabel Jl1,Jl2,Jl3;
	JLabel Jl4, Ma;
	JPasswordField pwd1;
	JTextField Jt1;
	ImageIcon img1,img2,img3,img4;
	JMenuBar menubar;
	JMenu JF;
	JMenuItem JFr,JFe;
	From_login(){
		setTitle("Food Price Calculator");
		Container c=getContentPane();
		c.setLayout(null);
		
		
		JPanel p=new JPanel();			  
		p.setLayout(null); 
		Ma=new JLabel("");
		Je=new JButton("Login");
			Je.setBounds(161,175,150,50);
			Je.setFont(new Font("Kanit",Font.ITALIC,14));
			Je.setBackground(Color.pink);
		Jo=new JButton("Reset");
			Jo.setBounds(325,175,150,50);
			Jo.setBackground(Color.pink);
			Jo.setFont(new Font("Kanit",Font.ITALIC,14));
		Jl1=new JLabel("Branch Code");
			Jl1.setBounds(163,9,150,50);
			Jl1.setFont(new Font("Kanit",Font.ITALIC,15));
		Jl2=new JLabel("Password");
			Jl2.setBounds(163,79,150,50);
			Jl2.setFont(new Font("Kanit",Font.ITALIC,15));
		pwd1=new JPasswordField(20);
			pwd1.setBounds(161,121,315,35);
		Jt1=new JTextField(20);
			Jt1.setBounds(161,50,315,35);

	
		
		
		p.add(Jl1); p.add(Jt1);
		p.add(Jl2); p.add(pwd1);
		p.add(Je); p.add(Jo);
		p.setBorder(BorderFactory.createTitledBorder("LOGIN"));
		p.setFont(new Font("Kanit",Font.ITALIC,20));
		p.setBounds(1,1,484,240);
		
		
		c.add(Jo);
		c.add(p);
		
		
		Je.addActionListener(this);
		Jo.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e ){
		try{
			
		}catch(NumberFormatException s){
			JOptionPane.showMessageDialog(null,"Input No Numveric ! ");

	}		
		if(e.getSource()==Je){
			//System.exit(0);
			String UserText =new String(Jt1.getText());
			String passText =new String(pwd1.getPassword());
				if(passText.equals("1234") && UserText.equals("Han")){
					Ma.setText("Login OK");

					From_Sum f2=new From_Sum(); //Link Form_pass_02
					
					
					f2.setSize(750,600);
					f2.setVisible(true);
					setVisible(false);

				}
				else{
					 JOptionPane.showMessageDialog(f,"Login Error.","Alert",JOptionPane.WARNING_MESSAGE);
				}
		
		}
		else if(e.getSource()==Jo){ 
			pwd1.setText("");
			Jt1.setText("");

		}
	}
	
	
	public static void main(String[] args) 
	{
	From_login f=new From_login();
	f.setSize(500,280);
	f.setVisible(true);
	f.setResizable(false);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
