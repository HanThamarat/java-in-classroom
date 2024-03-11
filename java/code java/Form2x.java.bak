import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Form2x extends JFrame implements ActionListener
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
	Form2x(){
		setTitle("Technic Krabi");
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		menubar = new JMenuBar();

		JPanel p=new JPanel();			  
		p.setLayout(new GridLayout(1,2)); 

		JPanel r=new JPanel();			  
		r.setLayout(new GridLayout(1,1)); 

		JF=new JMenu("File");
			JFn=new JMenuItem("New");
			JFnw=new JMenuItem("New");
			JFo=new JMenuItem("Open");
			JFs=new JMenuItem("Save");
			JFsa=new JMenuItem("Save As");
			JFp=new JMenuItem("Page Setup");
			JFpr=new JMenuItem("Print");
			JFa=new JMenuItem("About us");
			JFe=new JMenuItem("Exit");

			menubar.add(JF);
			JF.add(JFn);
			JF.add(JFnw);
			JF.add(JFo);
			JF.add(JFs);
			JF.add(JFsa);
			JF.add(JFp);
			JF.add(JFa);
			JF.add(JFe);


		JE=new JMenu("Edit");
			JEu=new JMenuItem("Undo");
			JEc=new JMenuItem("Cut");
			JEcp=new JMenuItem("Copy");
			JEp=new JMenuItem("Paste");
			JEd=new JMenuItem("Delete");
			JEf=new JMenuItem("Find");
			JEfn=new JMenuItem("Fine Next");
			JEfp=new JMenuItem("Fine previous");
			JEg=new JMenuItem("GO to");
			JEs=new JMenuItem("Select all");
			JEt=new JMenuItem("Time/Date");
			JEft=new JMenuItem("Font");
			
			menubar.add(JE);
			JE.add(JEu);
			JE.add(JEc);
			JE.add(JEcp);
			JE.add(JEp);
			JE.add(JEf);
			JE.add(JEfn);
			JE.add(JEfp);
			JE.add(JEg);
			JE.add(JEs);
			JE.add(JEt);
			JE.add(JEft);

		Jh=new JMenu("Format");
			JFw=new JMenuItem("Word wrap");
			JFf=new JMenuItem("Font");
		menubar.add(Jh);
			Jh.add(JFw);
			Jh.add(JFf);


		JV=new JMenu("View");
			JVz=new JMenu("Zoom");
				JVzi=new JMenuItem("Zoom in");
				JVzu=new JMenuItem("Zoom out");
				JVzr=new JMenuItem("Restore default zoom");
			JVs=new JMenuItem("Status Bar");
		menubar.add(JV);
			JV.add(JVz);
				JVz.add(JVzi);
				JVz.add(JVzu);
				JVz.add(JVzr);
			
		JH=new JMenu("Help");
			JHt=new JMenu("Topic");
				JHtj=new JMenuItem("Java");
				JHth=new JMenuItem("Html");
			JHr=new JMenuItem("Register");

			
		
		
		

		menubar.add(JH);
			JH.add(JHt);
				JHt.add(JHtj);
				JHt.add(JHth);
			JH.add(JHr);
		setJMenuBar(menubar);
		
		
		
		Jb1=new JButton("Wrap");
		Jb2=new JButton("No Wrap");
		p.add(Jb1); p.add(Jb2);

		
		t1=new JTextArea(8,20);
		Jp1=new JScrollPane(t1);
		getContentPane().add(Jp1,"center");
		r.add(Jp1);
		

		JFe.addActionListener(this);
		JFa.addActionListener(this);
		Jb1.addActionListener(this);
		Jb2.addActionListener(this);
		
		c.add(r,BorderLayout.CENTER);
		c.add(p,BorderLayout.SOUTH);
	}
		public void actionPerformed(ActionEvent e ){
		if(e.getSource()==JFa){
			JOptionPane.showMessageDialog(null,"Mr.Thanatrorn Roengsamut");
		}else if(e.getSource()==JFe){
			System.exit(0);
		}
		if(e.getSource()==Jb1){
			t1.setLineWrap(true);
			Jp1.validate();
		}
		else if(e.getSource()==Jb1){
			t1.setLineWrap(false);
			Jp1.validate();
		}
	}
	

	public static void main(String[] args) 
	{
	Form2x f=new Form2x();
	f.setSize(500,300);
	f.setVisible(true);
	f.setResizable(true);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
