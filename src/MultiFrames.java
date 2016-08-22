
	/*MultiFrames.java shows how to transit from one GUI to anther
	 Here is from InteractiveGUI to RobustCal
	 Please copy the image file cool.jpg to class folder
	*/
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;

	//GUI which responds to action on it, like click, etc.
	public class  MultiFrames  extends JFrame implements ActionListener
	{
	  private JButton jbtRect = new JButton("Rectangle");
	  private JButton jbtImg;// = new JButton(new ImageIcon("cool.gif"));
	  private JButton jbtCircle = new JButton("Circle");
	  private JButton jbtExit = new JButton("Exit");
	  private JTextField jtext = new JTextField("Name of Shapes");

	  private JButton jbtCal = new JButton("Calulator");
	  private JButton jbt2= new JButton("2");
	  
	  //declare the following 2 GUI classes here, so they are visible to all. 
	  static MultiFrames frame=null;
        //declare it as static so it can be used in main directly

	  RobustCal rCal=null;

	  /** Default Constructor */
	  public MultiFrames()
	  {
	   rCal = new RobustCal();//RobustCal frame is only created once. 
	  // Set BorderLayout for the frame
	  setLayout(new BorderLayout());

	  /*below way to access image file applies to jar file as well if you make jar file for .class and image file; 
	   * the image file need to be accessible to the class--copy the image file to class folder*/
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
	  jbtRect.addActionListener(this);
	  jbtImg.addActionListener(this);
	  jbtCircle.addActionListener(this);
	  jbtExit.addActionListener(this);
	  jbtCal.addActionListener(this);

	  add(p1, BorderLayout.CENTER);
	  add(jbtCal, BorderLayout.EAST);
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
	      else if (e.getSource() == jbtCircle)
	      {
	         jtext.setText(/*jtext.getText()+*/"This is a CIRCLE");
	      }
	      else if (e.getSource() == jbtExit)
	      {
	        JOptionPane.showMessageDialog(null,"Thanks for using the program!",
	          "Learning about Shapes",JOptionPane.INFORMATION_MESSAGE);
	          // end the program
	          System.exit(0);
	      } else if (e.getSource() == jbtCal)
	      {
	    /*rCal is already a RobustCal object created once in current class constructor*/
                rCal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
	       //set Robust Calculator window title, size and display the window.
	        
	          rCal.setTitle("Robust Calculator");
	          rCal.setSize(400,300);
	        
	          rCal.jtext.setText(this.jtext.getText());//get current GUI class text display and pass it to next GUI object rCal for display in its JTextField object 
	          rCal.setVisible(true);
	          //frame.setVisible(false);//make first frame invisible
	          
	          //frame.dispose();//close first frame
	      }
	      
	   }

	  /** Main Method **/
	  public static void main(String[] args)
	  {
		frame = new MultiFrames();
	    frame.setTitle("My Interactive GUI - Drawing Shapes");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(400,250);
	    frame.setVisible(true);
	    
	  }
	}


