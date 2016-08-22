import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

/* TryCatchInput.java: Example for Exception Handling
 * Break down an amount into smaller units.
 * This example also shows you how to fetch the integer and fractional part of a floating value. 
 * It can detect the wrong entry.
*/

public class TryCatchInput {

/** Main method */
public static void main(String[] args) {
  double amount=0; // declare a double type variable amount and initialize it to 0
  System.out.println("Please enter an amount of money here:");
  Scanner input=  new Scanner(System.in);
  try{
     amount = input.nextDouble();//if a non numeric value in entered, this statement will throw exception
  }catch(/*Exception*/InputMismatchException e){
    JOptionPane.showMessageDialog(null, "wrong entry, the amount should be a double value.\nPlease run the program again.");
    System.exit(0);
  }
  // Find the number of one dollars
  //cast double type amount to int to remove cents and get dollars only
  int numOfOneDollars = (int)amount; 
 
  // Find the number of cents in the remaining amount
  int numOfCents = (int)((amount - numOfOneDollars)*100);
  
  // Display results
  String output = "Your amount " + amount + " consists of \n" + 
    numOfOneDollars + " dollars\n" + 
    numOfCents + " cents\n";
  
  /*call JOptionPane class another overloaded static method showMessageDialog
  to display message in a dialog box with customized title and icon
  */ 
  JOptionPane.showMessageDialog(null, output, 
    "Compute Change Output", JOptionPane.INFORMATION_MESSAGE);
  input.close();
  System.exit(0);
 }
}
