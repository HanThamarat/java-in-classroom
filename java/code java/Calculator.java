import javax.swing.*;
import java.awt.*;
class Calculator extends JFrame 
{
	JButton Jb1,Jb2,Jb3,Jb4,Jb5,Jb6,Jb7,Jb8,Jb9,Jb10,Jb11,Jb12,Jb13,Jb14,Jb15,Jb16,Jb17;
	TextField txt1;
	Calculator(){
		setTitle("Calculator");
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		TextField Txt1=new TextField();
		Jb17=new JButton(" CLEAR ");
		c.add(Txt1,BorderLayout.NORTH);

		JPanel P=new JPanel();
		P.setLayout(new GridLayout(4,4));
		Jb1=new JButton(" 1 ");  Jb2=new JButton(" 2 ");  Jb3=new JButton(" 3 ");  Jb4=new JButton(" + "); 
		Jb5=new JButton(" 4 ");  Jb6=new JButton(" 5 ");  Jb7=new JButton(" 6 ");  Jb8=new JButton(" - "); 
		Jb9=new JButton(" 7 ");  Jb10=new JButton(" 8 "); Jb11=new JButton(" 9 "); Jb12=new JButton(" x ");
		Jb13=new JButton(" 0 "); Jb14=new JButton(" . "); Jb15=new JButton(" = "); Jb16=new JButton(" / ");

		P.add(Jb1);		P.add(Jb2);		P.add(Jb3);		P.add(Jb4);
		P.add(Jb5);		P.add(Jb6);		P.add(Jb7);		P.add(Jb8);
		P.add(Jb9);		P.add(Jb10);	P.add(Jb11);	P.add(Jb12);
		P.add(Jb13);	P.add(Jb14);	P.add(Jb15);	P.add(Jb16);


		c.add(P,BorderLayout.CENTER);
		c.add(Jb17,BorderLayout.SOUTH);
		

	}

	public static void main(String[] args) 
	{
	Calculator f=new Calculator();
	f.setSize(350,450);
	f.setVisible(true);
	f.setResizable(false);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
