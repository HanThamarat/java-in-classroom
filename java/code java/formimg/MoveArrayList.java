package pacp.test;
 
import java.awt.EventQueue;
import javax.swing.JFrame;
 
 
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.ListIterator;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextField;
 
 
public class MoveArrayList {
    private JFrame frame;
    private JTextField textFieldName;
     
    private ArrayList<Person> PersonList = new ArrayList<Person>();
    private ListIterator<Person> PersonIterator = PersonList.listIterator();
 
    //--------------------------------------------------------------------------------------------------------------------------------------------
    // Launch the application.
    //--------------------------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MoveArrayList window = new MoveArrayList();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
    //--------------------------------------------------------------------------------------------------------------------------------------------
    // Create the application.
    //--------------------------------------------------------------------------------------------------------------------------------------------
    public MoveArrayList() {
        PersonList.add(new Person());
        PersonList.add(new Person());
        PersonList.add(new Person());
        initialize();
    }
 
    //--------------------------------------------------------------------------------------------------------------------------------------------
    // Initialize the contents of the frame.
    //--------------------------------------------------------------------------------------------------------------------------------------------
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 391, 230);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
 
 
        // ---------------------------------------------------------------
        // Text
        // ---------------------------------------------------------------
        textFieldName = new JTextField();
        textFieldName.setBounds(123, 27, 138, 20);
        textFieldName.setColumns(10);
        textFieldName.setText(PersonList.get(0).getName()); 
        frame.getContentPane().add(textFieldName);
 
        // ---------------------------------------------------------------
        // Next
        // ---------------------------------------------------------------
        JButton btnNext = new JButton("Next");
        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if ( PersonIterator.hasNext() ) {
                    //advance current position by one using next method
                    PersonIterator.next();
                    textFieldName.setText(PersonIterator.next().getName());
                }
            }
        });
        btnNext.setBounds(288, 24, 62, 23);
        frame.getContentPane().add(btnNext);
 
        // ---------------------------------------------------------------
        // Previous
        // ---------------------------------------------------------------
        JButton btnPrevious = new JButton("Previous");
        btnPrevious.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if ( PersonIterator.hasPrevious() ) {
                    //back current position by one using next method
                    PersonIterator.previous();
                    textFieldName.setText(PersonIterator.next().getName());
                }
 
            }
        });
        btnPrevious.setBounds(21, 24, 73, 23);
        frame.getContentPane().add(btnPrevious);
 
        // ---------------------------------------------------------------
        // Save
        // ---------------------------------------------------------------
        JButton btnSave = new JButton("Save");
        btnSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PersonIterator.next().setName(textFieldName.getText());
            }
        });
        btnSave.setBounds(141, 93, 89, 23);
        frame.getContentPane().add(btnSave);
 
        // ---------------------------------------------------------------
        // New
        // ---------------------------------------------------------------
        JButton btnNew = new JButton("New");
        btnNew.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
 
                //advance current position by one using next method
                PersonIterator.next();
 
                 // Add an element just before the next element
                PersonIterator.add(new Person());
 
                // Create a ?? name                     
                textFieldName.setText("??");
 
            }
        });
        btnNew.setBounds(34, 93, 89, 23);
        frame.getContentPane().add(btnNew);
 
        // ---------------------------------------------------------------
        // Delete
        // ---------------------------------------------------------------
        JButton btnDelete = new JButton("Delete");
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PersonIterator.remove();
            }
        });
        btnDelete.setBounds(251, 93, 89, 23);
        frame.getContentPane().add(btnDelete);
 
 
        // ---------------------------------------------------------------
        // Display
        // ---------------------------------------------------------------
        JButton btnDisplay = new JButton("Display");
        btnDisplay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int i = 0; i < PersonList.size(); i++)
                {
                    System.out.println(" Personl[" + i + "] --> Name = " + PersonList.get(i).getName());
                    System.out.println("            --> Age = " + PersonList.get(i).getAge());
                }
 
            }
        });
        btnDisplay.setBounds(141, 153, 89, 23);
        frame.getContentPane().add(btnDisplay);
 
    }
}