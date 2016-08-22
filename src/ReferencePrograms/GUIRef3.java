package ReferencePrograms;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.*;

public class GUIRef3 extends JFrame implements ActionListener
{
  private JButton jbtButton1 = new JButton("Button 1");
  private JButton jbtButton2 = new JButton("Button 2");
  JPanel panel = new JPanel();
  private JTextField jtext = new JTextField("");
  
  /** Default Constructor */
  public GUIRef3()
  {
  // Get the content panel of the frame
  Container container = getContentPane();
  // Set BorderLayout for the frame
  container.setLayout(new BorderLayout()); 
  
  // Set GridLayout for the Panel
  panel.setLayout(new GridLayout(3,1)); //set layout of 2 rows and 1 column
  
  //add JButtons and JTextField to panel
  panel.add(jbtButton1);//Add button 1 to row 1
  panel.add(jbtButton2);//Add button 2 to row 2
  panel.add(jtext);//Add textfield to row 3

  // add panel to frame
  container.add(panel, BorderLayout.CENTER);
  
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
        // handle the jbtButton1 event Clicked
       jtext.setText("Button 1 Clicked"); // display message to JTextField
      } 
      else if (e.getSource() == jbtButton2)
      {
       // handle the jbtButton2 event
        jtext.setText("Button 2 Clicked"); // display message to JTextField
      }    
    }

  /** Main Method **/
  public static void main(String[] args)
  {
    GUIRef3 frame = new GUIRef3();
    frame.setTitle("Example 3");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400,250);
    frame.setVisible(true);
  }
}