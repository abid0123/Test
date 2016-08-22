package ReferencePrograms;
/* OverloadDialogBoxDemo.java: Entering input from input dialog boxes
   JOptionPane's other showInputDialog and showMessageDialog method is used, 
   which accept more inputs allow use to customize the dialogbox title and icons  
*/
import javax.swing.JOptionPane;

public class OverloadDialogBoxDemo {
  public static void main(String args[]) {
    // Prompt the user to enter a year 
    String yearString = JOptionPane.showInputDialog(null, 
      "Enter a year:", "Customized Input Dialogbox", 
      JOptionPane.QUESTION_MESSAGE);

    // Convert the string into an int value
    int year = Integer.parseInt(yearString);
    
    // Check if the year is a leap year 
    boolean isLeapYear = 
      ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    
    // Display the result in a message dialog box
    JOptionPane.showMessageDialog(null, 
      "Is year "+year + " a leap year? " + (isLeapYear?"Yes":"No"),
      "Customized Output Dialogbox", JOptionPane.INFORMATION_MESSAGE);

    System.exit(0);
  } 
}