//RobustCal.java: A robust version of MySimpleCal.java

/** 
  This program is a simple calculator that does addition and substraction.
  Do try to enhance the program by :
 (1) Add in division and multiplication features.
 (2) Using Button arrays for better efficiency.
 (3) Improve error handling.
**/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  public class RobustCal extends JFrame implements ActionListener{

     JTextField jtext = new JTextField("");
    private JButton b1 = new JButton("1");
    private JButton b2 = new JButton("2");
    private JButton b3 = new JButton("3");
    private JButton b4 = new JButton("4");
    private JButton b5 = new JButton("5");
    private JButton b6 = new JButton("6");
    private JButton b7 = new JButton("7");
    private JButton b8 = new JButton("8");
    private JButton b9 = new JButton("9");
    private JButton b0 = new JButton("0");
    private JButton badd = new JButton("+");
    private JButton bsub = new JButton("-");
    private JButton beq = new JButton("=");
    private JButton bclr = new JButton("C");
    private double lastResult = 0;//to cater more data type
    private String process; 
    private boolean next = false;
    
   public RobustCal(){
		
    /** creating buttons pad for calculator **/
    JPanel p1 = new JPanel();
    p1.setLayout(new GridLayout(4,3,1,1));

    p1.add(b1);
    p1.add(b2);
    p1.add(b3);
    p1.add(b4);
    p1.add(b5);
    p1.add(b6);
    p1.add(b7);
    p1.add(b8);
    p1.add(b9);
    p1.add(badd);
    p1.add(b0);
    p1.add(bsub);

    //Create a listener for each button, not include text field
   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
   b4.addActionListener(this);
   b5.addActionListener(this);
   b6.addActionListener(this);
   b7.addActionListener(this);
   b8.addActionListener(this);
   b9.addActionListener(this);
   b0.addActionListener(this);
   badd.addActionListener(this);
   bsub.addActionListener(this);
   beq.addActionListener(this);
   bclr.addActionListener(this);

/** creating result button **/
    JPanel p2 = new JPanel();
    p2.setLayout(new GridLayout(1,2));
    p2.add(beq);
    p2.add(bclr);
  
    add(jtext, BorderLayout.NORTH);
    add(p1, BorderLayout.CENTER);
    add(p2, BorderLayout.SOUTH);
   }

    public static void main(String[] args) {
            RobustCal frame = new RobustCal();
            frame.setTitle("My Simple Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(200,200);
         
            frame.setVisible(true);
    }

  /** This method will be invoked when a button is clicked **/
    public void actionPerformed(ActionEvent e)
    {
     if (next == true) 
     {
        jtext.setText("");
        next = false;
     }
      if (e.getSource()==b1)
        jtext.setText(jtext.getText() + b1.getText());
      else if (e.getSource()==b2)
        jtext.setText(jtext.getText() + "2");
      else if (e.getSource()==b3)
        jtext.setText(jtext.getText() + "3");
      else if (e.getSource()==b4)
        jtext.setText(jtext.getText() + "4");
      else if (e.getSource()==b5)
        jtext.setText(jtext.getText() + "5");
      else if (e.getSource()==b6)
        jtext.setText(jtext.getText() + "6");
      else if (e.getSource()==b7)
        jtext.setText(jtext.getText() + "7");
      else if (e.getSource()==b8)
        jtext.setText(jtext.getText() + "8");
      else if (e.getSource()==b9)
        jtext.setText(jtext.getText() + "9");
      else if (e.getSource()==b0)
      {
        /** Disallow preceding zero **/
        if (!jtext.getText().equals(""))
          jtext.setText(jtext.getText() + "0");
      }
      else if (e.getSource()==badd)//get 1st value from text field
      {
        process = "+";
        String s = jtext.getText();
        try{
           lastResult = Double.parseDouble(s);
           next = true;
        }catch(NumberFormatException/*ArrayIndexOutOfBoundsException*/ ex){
           JOptionPane.showMessageDialog(null,"Please key in again.","Wrong Number",JOptionPane.ERROR_MESSAGE);
           jtext.setText("");
        }
        next = true;
      } 
      else if (e.getSource()==bsub)//get 1st value from text field
      {
        process = "-";
        String s = jtext.getText();
       
        try{
           lastResult = Double.parseDouble(s);
           next = true;
        }catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(null,"Please key in again.","Wrong Number",JOptionPane.ERROR_MESSAGE);
           jtext.setText("");
        }/*finally{
            System.out.println("in finally");
        }
      System.out.println("after fianlly");*/
      }
      else if (e.getSource()==beq)//get 2nd value from textfield and calulate
      {
        String s = jtext.getText();
        double i;
        try{
           i = Double.parseDouble(s);
        }catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(null,"Please key in again.","Wrong Number",JOptionPane.ERROR_MESSAGE);
           jtext.setText("");
           return;
        }
        if (process.equals("+") == true)
            lastResult = lastResult + i;
        if (process.equals("-") == true)
            lastResult = lastResult - i;            
        jtext.setText("" + lastResult);
        process = "";
        lastResult = 0;
      }
      else if (e.getSource()==bclr)//reset everything
      {
        process = "";
        next = false;
        jtext.setText("");
        lastResult = 0;
      }
    }
}