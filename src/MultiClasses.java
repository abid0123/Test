/*MultiClasses.java shows how to create object from another class existing, then call the method from the object to complete certain function in your GUI.
	 Here Chapter 6 programming exercise class Convertor is used to help to convert from one temperature unit to another 
	
	*/
import TConvertor.Convertor6_5_1;//import class Convertor6_5_1 from another package

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;

	//GUI which responds to action on it, like click, etc.
	public class  MultiClasses  extends JFrame implements ActionListener
	{
	  private JButton jbtRect = new JButton("Rectangle");
	  private JButton jbtImg;
       //declare a JButton variable, object not created yet

	  private JButton jbtCircle = new JButton("Circle");
	  private JButton jbtExit = new JButton("Exit");
	  private JTextField jtext = new JTextField("Name of Shapes");

	  private JButton jbtEast = new JButton("F2C");
	  private JButton jbtWest= new JButton("C2F");
	  
	  static MultiClasses frame = null;//declare object frame from current class, it is null now, not ready to use
	   
	  Convertor6_5_1 c =null;//declare Convertor6_5_1 object c, not ready to use

	  /** Default Constructor */
	  public MultiClasses()
	  {
	   c = new Convertor6_5_1();// Convertor6_5_1() object is created, c is ready to use
	  // Set BorderLayout for the frame
	  setLayout(new BorderLayout());

	  /*below way to access image file applies to jar file as well if you make jar file for .class and image file; the image file need to be accessible to the class--copy the image file to class folder*/
	   URL urlToImage = getClass().getResource("cool.gif");
	   Image pImage = Toolkit.getDefaultToolkit().getImage(urlToImage);
	   jbtImg= new JButton(new ImageIcon(pImage));

/* Create panel p1 for the buttons and set Grid Layout for buttons */
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
	  jbtEast.addActionListener(this);
	  jbtWest.addActionListener(this);

	  add(p1, BorderLayout.CENTER);
	  add(jbtEast, BorderLayout.EAST);
	  add(jbtWest, BorderLayout.WEST);
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
	      } else if (e.getSource() == jbtEast)//when F2C button is clicked
	      {
	    	  double orgValue=0;
	    	 try {
	    		orgValue = Double.parseDouble(jtext.getText().trim());//String class trim() method remove leading and tailing empty space
	    	 }catch(NumberFormatException e11){
	    		 JOptionPane.showMessageDialog(null, "Please enter a numeric value in the field.");
	    		 jtext.setText("");
	    		 return;
	    	 }
	         double cvtValue = c.fToC(orgValue);//call Convertor obejct c's method fToC to convert temperature from fareinheit to celcius
	         jtext.setText(""+cvtValue);
	      }else if (e.getSource() == jbtWest)
	      {
	    	double orgValue=0;
		    try {
		    	 orgValue = Double.parseDouble(jtext.getText().trim());//String class trim() method remove leading and tailing empty space
		    }catch(NumberFormatException e21){
		   		 JOptionPane.showMessageDialog(null, "Please enter a numeric value in the field.");
		   		 jtext.setText("");
		   		 return;
		    }
	    	  double cvtValue = c.cToF(orgValue);
	         jtext.setText(""+cvtValue);
	      }
	      
	   }

	  /** Main Method **/
	  public static void main(String[] args)
	  {
		frame = new MultiClasses();
	    frame.setTitle("My Interactive GUI - Drawing Shapes");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(400,250);
	    frame.setVisible(true);
	    
	  }
	}


