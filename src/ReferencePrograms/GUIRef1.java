package ReferencePrograms;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.*;

public class GUIRef1 extends JFrame implements ActionListener
{
  private JButton jbtClickMe = new JButton("Click Me");
  
  /** Default Constructor */
  public GUIRef1()
  {
  // Get the content panel of the frame
  Container container = getContentPane();
  // Set BorderLayout for the frame
  container.setLayout(new BorderLayout()); 
  container.add(jbtClickMe, BorderLayout.CENTER);//Add button to container center

  //add a Actionlistener to button
  jbtClickMe.addActionListener(this);
  }
    /** This method will be invoked when a button is clicked **/
    public void actionPerformed(ActionEvent e)
    {
    // find out which button was pressed
      if (e.getSource()==jbtClickMe)
      {
        // handle the jbtClickMe event
        System.out.println("ClickMe button ActionEvent received and handled by the actionPerformed handler");
      }     
    }

  /** Main Method **/
  public static void main(String[] args)
  {
    GUIRef1 frame = new GUIRef1();
    frame.setTitle("Example 1");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400,250);
    frame.setVisible(true);
  }
}