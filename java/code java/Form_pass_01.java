import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Form_pass_01 extends JFrame implements ActionListener
{	
	JFrame f;
	JButton Je,Jo;
	JLabel Ma,Jl1,Jl2,Jl3;
	JPasswordField pwd1;
	JTextField Jt1;
	Form_pass_01(){
		setTitle("Caculator");
		Container c=getContentPane();
		c.setLayout(null);
		
		
		JPanel p=new JPanel();			  
		p.setLayout(null); 
		Je=new JButton("Login");
		Je.setFont(new Font("Kanit",Font.ITALIC,14));
		Je.setBackground(Color.pink);
		Jo=new JButton("Reset");
		Jo.setBackground(Color.pink);
		Jo.setFont(new Font("Kanit",Font.ITALIC,14));
		Ma=new JLabel("");
		Jl1=new JLabel("User Name");
		Jl1.setFont(new Font("Kanit",Font.ITALIC,15));
		Jl2=new JLabel("Password");
		Jl2.setFont(new Font("Kanit",Font.ITALIC,15));
		pwd1=new JPasswordField(20);
		Jt1=new JTextField(20);
		p.add(Jl1); p.add(Jt1);
		p.add(Jl2); p.add(pwd1);
		p.add(Je); p.add(Jo);
		p.setBorder(BorderFactory.createTitledBorder("CALCULATOR"));
		p.setFont(new Font("Kanit",Font.ITALIC,20));
		
		
		

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

					Form_pass_02 f2=new Form_pass_02(); //Link Form_pass_02
					
					
					f2.setSize(500,300);
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
	Form_pass_01 f=new Form_pass_01();
	f.setSize(500,300);
	f.setVisible(true);
	f.setResizable(false);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
