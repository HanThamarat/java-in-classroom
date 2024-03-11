import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class  Form_img2 extends JFrame implements ActionListener{
	int n=1;
	JButton Jb1,Jb2,Jb3;
	JLabel Jl1,Jl2,Jl3;
	ImageIcon img1,img2,img3,img4;
	Form_img2(){
		setTitle("");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
	
		Jl1=new JLabel("");
	
		img1=new ImageIcon("img/g1.png");
		Image image = img1.getImage();
		Image newimg = image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		img1= new ImageIcon(newimg);
		Jl1.setIcon(img1);

		

		c.add(Jl1);
		
		

	}
	public void actionPerformed(ActionEvent e ){
		
	}
	public static void main(String[] args) 
	{
	Form_img2 f=new Form_img2();
	f.setSize(500,300);
	f.setVisible(true);
	f.setResizable(true);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}