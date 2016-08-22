package ReferencePrograms;
//reference program for Dialog Box

import javax.swing.JOptionPane;//import the JOptionPane class to be used in this program

public class HelloBox 
{
  public static void main(String[] args)
  {
    String sName, sSayHello;
 
    //ask the use to enter his or her name from an input box
    sName =JOptionPane.showInputDialog(null,"Please enter your name:"); 

    sSayHello = "Hi there "+ sName + "! Hope you like Java?";

   //print out say hello message to user in a message box
   JOptionPane.showMessageDialog(null, sSayHello);

   System.exit(0);//release resource used by the dialog box to exit the program
    
  }

}