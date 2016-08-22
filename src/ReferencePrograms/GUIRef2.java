package ReferencePrograms;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.*;

public class GUIRef2 extends JFrame implements ActionListener
{
  private JButton jbtButton1 = new JButton("Button 1");
  private JButton jbtButton2 = new JButton("Button 2");
  
  /** Default Constructor */
  public GUIRef2()
  {
  // Get the content panel of the frame
  Container container = getContentPane();
  // Set GridLayout for the frame
  container.setLayout(new GridLayout(2,1)); //set layout of 2 rows and 1 column
  container.add(jbtButton1);//Add button 1 to row 1
  container.add(jbtButton2);//Add button 2 to row 2

  //add a Actionlistener to button 1
  jbtButton1.addActionListener(this);
  
  //add a Actionlistener to button 2
  jbtButton2.addActionListener(this);
  }
    /** This method will be invoked when a button is clicked **/
    public void actionPerformed(ActionEvent e)
    {
    // find out which button was pressed
      if (e.getSource()==jbtButton1)
      {
        // handle the jbtButton1 event
        System.out.println("Button 1 ActionEvent received and handled by the actionPerformed handler");
      } 
      else if (e.getSource() == jbtButton2)
      {
       // handle the jbtButton2 event
        System.out.println("Button 2 ActionEvent received and handled by the actionPerformed handler");
      }    
    }

  /** Main Method **/
  public static void main(String[] args)
  {
    GUIRef2 frame = new GUIRef2();
    frame.setTitle("Example 2");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400,250);
    frame.setVisible(true);
  }
}