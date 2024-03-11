import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FormRadio extends JFrame	implements ItemListener	{
	JRadioButton RB,RP,RI,RBI;
	ButtonGroup R;
	JLabel JT;
	FormRadio(){
	setTitle("Technic Krabi");
	Container c=getContentPane();
	c.setLayout(new FlowLayout());
	RB=new	JRadioButton("Bold");
	RP=new	JRadioButton("Plain");
	RI=new	JRadioButton("italic");
	RBI=new	JRadioButton("Bold/italic");
	JT=new	JLabel("Technic Krabi");
	R=new	ButtonGroup();
	R.add(RB);	R.add(RP);	R.add(RI);	R.add(RBI);
	c.add(JT);
	c.add(RB);	c.add(RP);	c.add(RI);	c.add(RBI);
	RB.addItemListener(this);
	RP.addItemListener(this);
	RI.addItemListener(this);
	RBI.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent s){
		if(s.getSource()==RB){
			JT.setFont(new Font("Algerian",Font.BOLD,20));
		}else if(s.getSource()==RP){
			JT.setFont(new Font("Algerian",Font.PLAIN,20));
		}else if(s.getSource()==RI){
			JT.setFont(new Font("Algerian",Font.ITALIC,20));
		}else if(s.getSource()==RBI){
			JT.setFont(new Font("Algerian",Font.BOLD+Font.ITALIC,20));
		}
	}
	public static void main(String[] args) 
	{
	FormRadio f=new FormRadio();
	f.setSize(500,300);
	f.setVisible(true);
	f.setResizable(false);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}