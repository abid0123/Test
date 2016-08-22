/*AnotherIGUI.java: an interactive version of DummyGUI.java in ReferencePrograms. Please compare the way of addActionListener() in InteractiveGUI.java*/

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;

//GUI which responds to action on it, like click, etc.,
public class AnotherIGUI extends JFrame
{
  private JButton jbtRect = new JButton("Rectangle");
  private JButton jbtImg;
  //JButton variable declared, object not created
  
  private JButton jbtCircle = new JButton("Circle");
  private JButton jbtExit = new JButton("Exit");
  private JTextField jtext = new JTextField("Name of Shapes");

  private JButton jbt1 = new JButton("1");
  private JButton jbt2= new JButton("2");

  /** Default Constructor */
  public AnotherIGUI ()
  {
  // Set BorderLayout for the frame
  setLayout(new BorderLayout());

//below way to access image file applies to jar file as well if you make jar file for .class and image file
 //the image file need to be accessible to the class--copy the image file to class folder
  URL urlToImage = getClass().getResource("cool.gif");
  Image pImage = Toolkit.getDefaultToolkit().getImage(urlToImage);
  jbtImg= new JButton(new ImageIcon(pImage));

  // Create panel p1 for the buttons and set Grid Layout for buttons
  JPanel p1 = new JPanel();
  p1.setLayout(new GridLayout(2,2));

  //Change button color
  jbtRect.setBackground(Color.magenta);//change background color
  jbtCircle.setForeground(Color.red);//change font color

  // Add buttons to the panel
  p1.add(jbtRect);
  p1.add(jbtImg);
  p1.add(jbtCircle);
  p1.add(jbtExit);


  //Create a listener for each button
  jbtRect.addActionListener(new MyListener());
  jbtImg.addActionListener(new MyListener());
 // jbtCircle.addActionListener(this);
  jbtExit.addActionListener(new MyListener());

  add(p1, BorderLayout.CENTER);//Add for Graphic
  add(jbt1, BorderLayout.EAST);
  add(jbt2, BorderLayout.WEST);
  add(jtext, BorderLayout.NORTH);
  }

 class MyListener implements ActionListener{

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
      else if (e.getSource() == jbtCircle)
      {
         jtext.setText("This is a CIRCLE");
      }
      else if (e.getSource() == jbtExit)
      {
        JOptionPane.showMessageDialog(null,"Thanks for using the program!",
          "Learning about Shapes",JOptionPane.INFORMATION_MESSAGE);
          // end the program
          System.exit(0);
      }
    }
 }

  /** Main Method **/
  public static void main(String[] args)
  {
    AnotherIGUI frame = new AnotherIGUI();
    frame.setTitle("My Intelligent GUI - Drawing Shapes");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400,250);
    frame.setVisible(true);

  }
}