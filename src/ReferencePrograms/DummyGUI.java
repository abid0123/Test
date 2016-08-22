package ReferencePrograms;
//DummyGUI.java: With 4 button and one textfield only. cannot response

import javax.swing.*;
import java.awt.*;//Container, Layout Manager, etc not starting with J belong to it
//import java.awt.event.*;//not needed

//GUI Only, no response
public class DummyGUI extends JFrame
{
 /*prepare all the GUI components first by creating objects from GUI classes*/ 
  private JButton jbtRect = new JButton("Rectangle");
  private JButton jbtOval = new JButton("Oval");
  private JButton jbtCircle = new JButton("Circle");
  private JButton jbtExit = new JButton("Exit");
  private JTextField jtext = new JTextField("This is a: ");

  /** no-arg Constructor */
  public DummyGUI()
  {
  // Get the content panel of the frame,no need for new version of JDK
  // Container container = getContentPane();//getContentPane() is JFrame's method
  
  /* Set BorderLayout for the frame
   BorderLayout can place components in 5 different position: EAST,    
   WEST, NORTH, SOUTH 
  */  
BorderLayout b = new BorderLayout();
  //container.setLayout(b);
  setLayout(b);
  //container.setLayout(new BorderLayout());

  // Create panel p1 to hold the buttons using Grid Layout with 2 rows 2 columns
  JPanel p1 = new JPanel();
  p1.setLayout(new GridLayout(2,2));

   //Change button color
   jbtRect.setBackground(Color.magenta);//change background color
   jbtOval.setForeground(Color.red);//change font color

  // Add buttons to the panel
    p1.add(jbtCircle);
    p1.add(jbtRect);
    p1.add(jbtOval);
    p1.add(jbtExit);

  /*container.add(p1, BorderLayout.CENTER);//Add for Graphic
  container.add(jtext, BorderLayout.NORTH);
  *///no need for new version of JDK
  
  add(p1, BorderLayout.CENTER);//Add for Graphic
 // add(p1, BorderLayout.SOUTH);
  add(jtext, BorderLayout.NORTH);

  }

  /** Main Method **/
  public static void main(String[] args)
  {
    DummyGUI frame = new DummyGUI();
      //JFrame frame=new JFrame();
    frame.setTitle("My Simple GUI - Drawing Shapes");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300,250);
    
    frame.setVisible(true);
   // System.out.println("diaply window, but set is invisible");
  }
  /*public static void main(String[] args)
  {
    JFrame frame = new JFrame();
      //sJFrame frame=new JFrame();
    frame.setTitle("My Simple GUI - Drawing Shapes");
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    frame.setSize(400.0,250);
    JFrame.setVisible(true);
  }*/
}
