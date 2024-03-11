import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class From_login extends JFrame implements ActionListener
{	
	JFrame f;
	JButton Je,Jo;
	JLabel Jl1,Jl2,Jl3;
	JLabel Jl4;
	JPasswordField pwd1;
	JTextField Jt1;
	ImageIcon img1,img2,img3,img4;
	From_login(){
		setTitle("Caculator");
		Container c=getContentPane();
		c.setLayout(null);
		
		
		JPanel p=new JPanel();			  
		p.setLayout(null); 
		Je=new JButton("Login");
			Je.setBounds(161,175,150,50);
			Je.setFont(new Font("Kanit",Font.ITALIC,14));
			Je.setBackground(Color.pink);
		Jo=new JButton("Reset");
			Jo.setBounds(325,175,150,50);
			Jo.setBackground(Color.pink);
			Jo.setFont(new Font("Kanit",Font.ITALIC,14));
		Jl1=new JLabel("User Name");
			Jl1.setBounds(163,9,150,50);
			Jl1.setFont(new Font("Kanit",Font.ITALIC,15));
		Jl2=new JLabel("Password");
			Jl2.setBounds(163,79,150,50);
			Jl2.setFont(new Font("Kanit",Font.ITALIC,15));
		pwd1=new JPasswordField(20);
			pwd1.setBounds(161,121,315,35);
		Jt1=new JTextField(20);
			Jt1.setBounds(161,50,315,35);

		Jl4=new JLabel("");
			Jl4.setBounds(80,50,315,300);
		img1=new ImageIcon("img/g1.png");
		Image image = img1.getImage();
		Image newimg = image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		img1= new ImageIcon(newimg);
		Jl4.setIcon(img1);
		
		
		p.add(Jl1); p.add(Jt1);
		p.add(Jl2); p.add(pwd1);
		p.add(Je); p.add(Jo);
		p.setBorder(BorderFactory.createTitledBorder("CALCULATOR"));
		p.setFont(new Font("Kanit",Font.ITALIC,20));
		p.setBounds(1,1,484,240);
		
		
		c.add(Jl4);
		c.add(p);
		
		
		
	}

	public void actionPerformed(ActionEvent e ){
		
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
