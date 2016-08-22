/* InteractiveGUI.java: an interactive version of      
 * DummyGUI.java in ReferencePrograms
 * with animation(gif file) displayed,
 * and text formatted using HTML tag or foreground color
 *
 * To run this GUI application, please copy cool.gif file to the bin directory
 *
 * Image path is handled
 * String absolutePath = getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
 * absolutePath = absolutePath.substring(0, absolutePath.lastIndexOf("/"));
 * String decodedPath = URLDecoder.decode(absolute, "UTF-8");//solve the problem with spaces and special characters
 */
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;

//GUI which responds to action on it, like click, etc.
public class InteractiveGUI extends JFrame implements ActionListener
{
  /*prepare all the GUI components first by creating objects from GUI classes*/ 
  private JButton jbtRect = new JButton("Rectangle");
  private JButton jbtImg;
  //JButton variable declared, object not created yet
  
  private JButton jbtCircle = new JButton("<html><h3 style='font-family:verdana;'>Circle</h3></html>");
  private JButton jbtExit = new JButton("<html><center><b><u><font color=#ff0000>E</u>ixt</font></b><br>"
                 + "<font color='green'>(close) </font></html>");//use HTML tag to format displayed text, including color, size, etc.
  private JTextField jtext = new JTextField("Name of Shapes");

  private JButton jbt1 = new JButton("1");
  private JButton jbt2= new JButton("2");

  /** Default Constructor */
  public InteractiveGUI()
  {
  /* Set BorderLayout for the frame, BorderLayout can place components in 5 different position: EAST, WEST, NORTH, SOUTH*/
  setLayout(new BorderLayout());

 /* below way to access image file applies to jar file as well if you make jar file for .class and image file; the image file need to be accessible to the class--copy the image file to class folder */
  URL urlToImage = getClass().getResource("cool.gif");
  Image pImage = Toolkit.getDefaultToolkit().getImage(urlToImage);
  jbtImg= new JButton(new ImageIcon(pImage));

  // Create panel p1 to hold the buttons using Grid Layout with 2 rows 2 columns
  JPanel p1 = new JPanel();
  p1.setLayout(new GridLayout(2,2));

  //Change button color
  jbtRect.setForeground(Color.magenta);//change font  color
  jbtCircle.setBackground(Color.blue);//change background color

  // Add buttons to the panel
  p1.add(jbtRect);
  p1.add(jbtImg);
  p1.add(jbtCircle);
  p1.add(jbtExit);

//Why jbt1 and jbt2 are not responsive
  //Create a listener for each button
  jbtRect.addActionListener(this);
  jbtImg.addActionListener(this);
  jbtCircle.addActionListener(this);
  //jbtExit.addActionListener(this);
  jbt1.addActionListener(this);
  add(p1, BorderLayout.CENTER);
  add(jbt1, BorderLayout.EAST);
  add(jbt2, BorderLayout.WEST);
  add(jtext, BorderLayout.NORTH);
  }

    /** This method will be invoked when a button is clicked **/
    public void actionPerformed(ActionEvent e)
    {
    // find out which button was pressed
    
     if (e.getSource()==jbtRect)
      {
         jtext.setText("This is a RECTANGLE");
      }
      else if (e.getSource() == jbtImg)
      {
         jtext.setText("Is this an image?");
      }
    /*  else if (e.getSource() == jbtCircle)
      {
         jtext.setText("This is a CIRCLE");
     }*/
      else if (e.getSource() == jbtExit)
      {
        JOptionPane.showMessageDialog(null,"Thanks for using the program!",
          "Learning about Shapes",JOptionPane.INFORMATION_MESSAGE);
          // end the program
          System.exit(0);
      }else if (e.getSource()==jbt1)
      {
          jtext.setText("button 1 is clicked");
       }
   }

  /** Main Method **/
  public static void main(String[] args)
  {
    InteractiveGUI frame = new InteractiveGUI();
    frame.setTitle("My Interactive GUI - Drawing Shapes");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300,250);
    frame.setVisible(true);
    
  }
}
